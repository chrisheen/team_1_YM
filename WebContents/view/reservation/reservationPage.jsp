<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<!--  -->
<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />  
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>  
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>
<meta charset="UTF-8">
<title>중앙렌트카 예약페이지</title>

</head>
<body>
<jsp:include page="../main/menu.jsp"/>
<div class="jumbotron">
  <div class="container">
  	<h1 class="display-3">예약하기</h1>
  	<br>
  	<div class="text-left">
     <h6>예약 날자를 선택해주세요</h6>
    </div>
  </div>
</div>  

<div class="container">
	<div class="row" align="center">


 		<div class="col-md-4">

<form name="Date" class=""action="Reservation" method="post">

<div>대여일자 : <input type="date" name="carPickupDate"></div>
<div>반납일자 : <input type="date" name="carReturnDate"></div>
</div>
	
 		<div class="col-md-4">
		<!-- 차종선택 -->
		<input type="button" class="button_A"  value="경차" method="post"></input>
		<input type="button" value="준중형"></input>
		<input type="button"  value="중형"></input>
		<input type="button"  value="대형"></input>
		<input type="button" value="suv"></input>
		</div>
 	<br>
</div>	

<p><input type="submit" id="timeData" value="예약하기"></p>

</form>
</div>

<hr>
<jsp:include page="../main/footer.jsp"/>
</body>
</html>