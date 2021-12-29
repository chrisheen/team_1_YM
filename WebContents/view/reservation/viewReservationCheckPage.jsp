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
<title>중앙렌터카 예약확인페이지</title>
</head>
<body>
<jsp:include page="../main/menu.jsp"/>
<div class="jumbotron">
  <div class="container">
  	<h1 class="display-3">예약 확인하기</h1>
  </div>
</div>  

<div class="container">
		<div class="row" align="center">

		<p>대여 일자 : <%=request.getAttribute("carPickupDate")%>
		<p>반납 일자 : <%=request.getAttribute("carReturnDate")%>

		</div>
</div>

<jsp:include page="../main/footer.jsp"/>
</body>
</html>