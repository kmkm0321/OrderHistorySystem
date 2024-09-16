/*送信ボタン押下時アクション*/
$(document).ready(function() {
    // 変更しない項目の読み取り専用処理
    $('#empCode').prop('readonly', true);
    $('#shopName').prop('readonly', true);
    $('#titleName').prop('readonly', true);
    
    $(".button").on('click', function() {
        $("#employeesForm").attr('action', "/oh221/employees_edit/submit"); // フォームのaction属性を変更
        $("#employeesForm").submit(); // フォームを送信
    });
    // enter押下時submit
    var enterCode = 13
    $(document).ready(function(e) {
        $('#employeesForm input').keypress(function(e) {
            if (e.which == enterCode) {
                $(".button").click(); 
            }
        });
    });
});



