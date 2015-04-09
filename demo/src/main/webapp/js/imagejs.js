$(function() {
	$(".wrap").hover(function() {
		$(".cover", this).stop().animate({
			top : "0px"
		}, {
			queue : false,
			duration : 160
		});
	}, function() {
		$(".cover", this).stop().animate({
			top : "200px"
		}, {
			queue : false,
			duration : 160
		});
	});
});