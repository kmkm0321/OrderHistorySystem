
/*初期制御*/
$(document).ready(function() {
    var areasValue = $('#area').val();
    
    if(areasValue == '0'){
        /*エリアコンボボックスが未選択の場合、その他非活性にする*/
        $('#pref').prop('disabled', true);
        $('#shop').prop('disabled', true);
    }
    
});

/*エリアコンボボックス変更時アクション*/
$(document).ready(function() {
    $('#area').change(function() {
        /*サーバ側でのコンボボックス判別用キー*/
        const key = 'area';
        var areasValue = $('#area').val();
        var ReqAreaOrPref = {
            key : key,
            value : areasValue
        };
    
    if(areasValue != '0'){
        /*エリアコンボボックスが未選択以外の場合、その他活性にする*/
        $('#pref').prop('disabled', false);
        
        /*AJAXで選択値に紐づくリストを取得、コンボボックスにセットする*/
        $.ajax({//ajax通信の諸設定
            type : "POST",
            url : "/oh220/postSelectedArea",
            contentType: "application/json",
            data : JSON.stringify(ReqAreaOrPref),
            dataType : "json",
        })
        .done(function(data) {//通信成功時の処理
            /*コンボボックスの値が追加されてしまうので一旦削除*/
            $('#pref').children().remove();
            $('#pref').append($('<option />').val('0').html('未選択'));
            /*受け取ったjsonリストの分繰り返しコンボボックスに値をセット*/
            $.each(data, function(index, pref) { 
                $('#pref').append($('<option>').html(pref.prefectureName).val(pref.prefectureCode));
            })          
        })
        .fail(function(err) {//失敗時の処理
            console.log(err);
        })
    }else{
        /*エリアコンボボックスが未選択の場合、その他日活性にする*/
        $('#pref').prop('disabled', true);
        $('#shop').prop('disabled', true);
        $('#pref').val('0');
        $('#shop').val('0');
        }
    })
});

/*都道府県コンボボックス変更時アクション*/
$(document).ready(function() {
    $('#pref').change(function() {
        /*サーバ側でのコンボボックス判別用キー*/
        const key = 'pref';
        var prefsValue = $('#pref').val();
        var ReqAreaOrPref = {
            key : key,
            value : prefsValue
        };
        
    if(prefsValue != '0'){
        /*都道府県コンボボックスが未選択以外の場合、その他活性にする*/
        $('#shop').prop('disabled', false);
        
        /*AJAXで選択値に紐づくリストを取得、コンボボックスにセットする*/
        $.ajax({//ajax通信の諸設定
            type : "POST",
            url : "/oh220/postSelectedPref",
            contentType: "application/json",
            data : JSON.stringify(ReqAreaOrPref),
            dataType : "json",
        })
        .done(function(data) {//通信成功時の処理
            /*コンボボックスの値が追加されてしまうので一旦削除*/
            $('#shop').children().remove();
            $('#shop').append($('<option />').val('0').html('未選択'));
            /*受け取ったjsonリストの分繰り返しコンボボックスに値をセット*/
            $.each(data, function(index, shop) { 
                $('#shop').append($('<option>').html(shop.shopName).val(shop.shopCode));
            })          
        })
        .fail(function(err) {//失敗時の処理
            console.log(err);
        })
    }else{
        /*都道府県コンボボックスが未選択の場合、その他非活性にする*/
        $('#shop').prop('disabled', true);
        $('#shop').val('0');
        }
    })
});

/*ショップコンボボックス変更時アクション*/
$(document).ready(function() {
    $('#shop').change(function() {

        var shopsValue = $('#shop').val();

        if (shopsValue != '0') {
            /*ショップコンボボックスが未選択以外の場合、その他活性にする*/
            $('#shop').prop('disabled', false);
        }
    })
});

/*検索ボタン押下時アクション*/
$(document).ready(function() {
    $('#search').click(function() {
        // データ行選択時パラメータindex
        var rowDataIndex = 6;
        // 検索用jsonデータ
        var areasValue = $('#area').val();
        var prefsValue = $('#pref').val();
        var shopsValue = $('#shop').val();
        var reqSearch = {
            areasValue: areasValue,
            prefsValue: prefsValue,
            shopsValue: shopsValue,
        };
        //　非同期設定
        $.ajax({
            type: "POST",
            url: "/oh220/postSearch",
            contentType: "application/json",
            data: JSON.stringify(reqSearch),
            dataType: "json",
        })
        .done(function(data) {
            $('#employeesList').children().remove();
            $('#employeesList').append('<thead><tr><th>エリア</th><th>都道府県</th><th>店舗</th><th>社員コード</th><th>氏名</th><th>役職名</th><th></th></tr></thead><tbody></tbody>');
            // データ表示処理
            $.each(data, function(index, tableData) {
                $('#employeesList').append('<tr><td>' + (tableData.areaName) + '</td>'
                    + '<td>' + (tableData.prefName) + '</td>'
                    + '<td>' + (tableData.shopName) + '</td>'
                    + '<td>' + (tableData.empCode) + '</td>'
                    + '<td>' + (tableData.fullName) + '</td>'
                    + '<td>' + (tableData.titleName) + '</td>'
                    + '<td style="display:none;">' + (tableData.empId) + '</td></tr>');

            });
            //　datatables設定
            $('#employeesList').DataTable({
                "language": {
                    "processing": "処理中...",
                    "lengthMenu": "_MENU_ 件表示",
                    "zeroRecords": "データはありません。",
                    "info": " _TOTAL_ 件中 _START_ から _END_ まで表示",
                    "infoEmpty": " 0 件中 0 から 0 まで表示",
                    "infoFiltered": "（全 _MAX_ 件より抽出）",
                    "paginate": {
                        "first": "先頭",
                        "previous": "前",
                        "next": "次",
                        "last": "最終"
                    }
                },
                searching: false,
                ordering: false,
                destroy: true,
                columnDefs: [
                    {
                        "targets": [rowDataIndex],
                        "visible": false,
                        "searchable": false
                    }
                ],
                // テーブル行リンク設定
                createdRow: function(row, rowData) {
                    var empId = rowData[rowDataIndex]; // empIdを取得
                    var urlForm = "/oh221/employees_edit/form?empId=" + empId;
                    $(row).on('click', function() {
                        window.location.href = urlForm; // クリック時にリダイレクト
                    });
                    $(row).hover(
                        function() {
                            $(this).css('background', '#CCCCCC').css("cursor", "pointer");
                        },
                        function() {
                            $(this).css('background', '');
                        }
                    );
                }
            });
        })
        .fail(function(err) {
            console.error('AJAX リクエスト失敗:', err); // デバッグ用ログ
        });
    });
});

$(document).ready(function() {
    $('#reloadButton').click(function() {
        window.location.href = "https://example.com/your-new-url";
    });
});

