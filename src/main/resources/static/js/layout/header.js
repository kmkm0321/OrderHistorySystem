/*bulmaのハンバーガーメニューが押下された時のJS処理*/
$(function(){
	$(".navbar-burger").click(function() {
	// Toggle the "is-active" class on both the "navbar-burger" and the "navbar-menu"
		$(".navbar-burger").toggleClass("is-active");
		$(".navbar-menu").toggleClass("is-active");
  });
});