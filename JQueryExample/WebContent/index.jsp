<%-- Austin Kingrey 9/27
I have my main jsp page here. It mostly focuses on
playing with jquery animations, but also does
some ajax work at the end
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jquery Example Home Page</title>
</head>
<body>
 <div>
 	<%--This is where My labels are that will be manipulated below --%>
	<form>
		<label id="lbl1">This is Test 1</label>
		<br>
		<label id="lbl2">This is Test 2</label>
		<br>
		<label id="lbl3">This is Test 3</label>
		<br>
	</form>
  </div>
  <%--This button will show a box of text after you click the button --%>
  <div>
  <button id="showText">Show My Text</button>
  </div>
  <div id="textGettingShown" style="background-color:blue;display:none;">
  	Hello There Friends.
  </div>
  <form>
  <%--This is where you enter your name, and ajax will process it to the server, then give it back in a printwrite --%>
  	Name <input type="text" id="name">
  	<input type="button" value="Ajax Button" id="btnAjax">
  	<br>
  	<span id="result1"></span>
  </form>

<%--I added the the jquery straight from the a cdn, that way others can use this easier --%>  
<script type="text/javascript" src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript"></script>
<%--This area is for me to do various animations to my text --%>
<%--The last part is where I recieve the user data, and send it off to ajax, and then recieve it again --%>
<script>
	$(function(){
		$("#lbl1").delay(1000).hide(300).show(300);
		
		$("#lbl2").css({color:"red"});
		
		$("#lbl3").fadeOut(1000);
		
		$("#showText").click(function() {
		$("#textGettingShown").toggle("slow")
		});
		
		$("#btnAjax").click(function(){
			var name = $("#name").val();
			$.ajax({
				type:'POST',
				data: {name: name},
				url:'AjaxController',
				success: function(result){
					$("#result1").html(result);
				}
			
			});
		});
		
	});
</script>
</body>
</html>