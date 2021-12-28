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
<jsp:include page="./menu.jsp"/>
<div class="jumbotron">
  <div class="container">
  	<h1 class="display-4">예약하기</h1>
  	<br>
  	<div class="text-left">
     <h6>예약 날자를 선택해주세요</h6>
    </div>
  </div>
</div>  

<div class="container">
		<div class="row" align="center">

<div class="col-md-4">
	<!-- 지역선택 -->
	
</div>
 <div class="col-md-4">
<!-- datapicker를 활용한 예약 달력 -->

<jsp:include page="./reservationDatePiker.jsp"/>
</div>	
 <div class="col-md-4">
<!-- 차종선택 -->
</div>
 	<br>
 </div>
<hr>
</div>

<jsp:include page="./footer.jsp"/>
</body>
</html>