
/*初期制御*/
$(function() {
	
	var areasValue = $('#area').val();
	var yearValue = $('#year').val();
	var displayYear = 4;
	var nowYear = new Date().getFullYear();
	
	if(areasValue == '0'){
		/*エリアコンボボックスが未選択の場合、その他非活性にする*/
		$('#pref').prop('disabled', true);
		$('#shop').prop('disabled', true);
	}
	
	if(yearValue == '0'){
		/*年コンボボックスが未選択の場合、月非活性にする*/
		$('#month').prop('disabled', true);
	}
	
	/*年コンボボックスの表示*/
	for(displayYear; displayYear >= 0; displayYear--){
		$('#year').append($('<option>').html(nowYear - displayYear + '年').val(nowYear - displayYear));
	}
	for(var i = 1; i <= 12; i++){
		$('#month').append($('<option>').html(i + '月').val('0' + i));
	}
	
});

/*エリアコンボボックス変更時アクション*/
$(function(){
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
	    	url : "/oh210/postSelectedArea",
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
$(function(){
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
	    	url : "/oh210/postSelectedPref",
	    	contentType: "application/json",
	    	data : JSON.stringify(ReqAreaOrPref),
	    	dataType : "json",
	    })
	    .done(function(data) {//通信成功時の処理
			/*コンボボックスの値が追加されてしまうので一旦削除*/
			$('#shop').children().remove();
			$('#shop').append($('<option />').val('0').html('未選択'));
	        console.log(data);
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
$(function(){
	$('#shop').change(function() {
    
    var shopsValue = $('#shop').val();

    if(shopsValue != '0'){
		/*ショップコンボボックスが未選択以外の場合、その他活性にする*/
		$('#shop').prop('disabled', false);
	}
	})
});

/*年コンボボックス変更時アクション*/
$(function(){
	$('#year').change(function() {
    
    var yearValue = $('#year').val();

    if(yearValue != '0'){
		/*年コンボボックスが未選択以外の場合、月を活性にする*/
		$('#month').prop('disabled', false);
	}else{
		/*未選択の場合月を非活性にする*/
		$('#month').prop('disabled', true);
		$('#month').val('0');
	}
	})
});

/*検索ボタン押下時アクション*/
$(function(){
	$('#search').click(function() {
		var areasValue = $('#area').val()
		var prefsValue = $('#pref').val()
		var shopsValue = $('#shop').val()
		var yearValue = $('#year').val()
		var monthValue = $('#month').val()		
		/*年が未選択だった場合の処理*/
		if(yearValue == '0'){
			yearAndMonth = null
		}else if(yearValue != '0' && monthValue == '0'){
			/*年が選択かつ、月が未選択*/
			yearAndMonth = $('#year').val()
		}else{
			/*年月選択済み*/
			yearAndMonth = String($('#year').val()) + String($('#month').val())
		}
	    /*リクエストjsonデータ*/
	    var reqSearch = {
	        areasValue : areasValue,
	        prefsValue : prefsValue,
	        shopsValue : shopsValue,
	        yearAndMonth : yearAndMonth
	    };
    console.log(reqSearch);
    /*AJAXでコンボボックスの値を送信*/
	$.ajax({//ajax通信の諸設定
		type : "POST",
		url : "/oh210/postSearch",
		contentType: "application/json",
		data : JSON.stringify(reqSearch),
		dataType : "json",
    })
    .done(function(data) {//通信成功時の処理
    	/*画面のテーブル情報削除処理*/
    	$('#salesTable').children().remove()
    	/*テーブル再生成*/
    	$('#salesTable').append('<thead><tr><th>エリア</th><th>都道府県</th><th>店舗</th><th>氏名</th><th>売上金額</th></tr></thead><tbody></tbody>')
    	/*受け取ったjsonリスト件数分繰り返し*/
		$.each(data, function(index,tableData) {
			/*ｔｄ追加*/ 
			$('#salesTable').append('<tr><td>' + (tableData.areaName) + '</td>'
			+ '<td>' + (tableData.prefName) + '</td>' 
			+ '<td>' + (tableData.shopName) + '</td>' 
			+ '<td>' + (tableData.fullName) + '</td>'
			+ '<td>' + (tableData.totalSales) + '</td></tr>')
		})
		/*DataTable処理*/
		/*jsで動的にテーブルを生成する場合、生成と同時にdatatableの処理をしないとページングが反映されない*/
		$(function() {
			$('#salesTable').DataTable(
				{
					"language": {
						"processing": "処理中...",
						"lengthMenu": "_MENU_ 件表示",
						"zeroRecords": "データはありません。",
						"info": " _TOTAL_ 件中 _START_ から _END_ まで表示",
						"infoEmpty": " 0 件中 0 から 0 まで表示",
						"infoFiltered": "（全 _MAX_ 件より抽出）",
						"infoPostFix": "",
						"search": "検索:",
						"url": "",
						"paginate": {
							"first": "先頭",
							"previous": "前",
							"next": "次",
							"last": "最終"
						}
					},
					//paging: 'full',
					//lengthChange: false,
					searching: false,
					ordering: false,
					//info: false
					destroy: true,
				}
			);
		});
	})
	.fail(function(err) {//失敗時の処理
		console.log(err);
	})
    
	})
});
