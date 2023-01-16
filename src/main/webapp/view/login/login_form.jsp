<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script
  src="https://code.jquery.com/jquery-3.6.3.min.js"
  integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
  crossorigin="anonymous"></script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>Insert title here</title>
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <![endif]-->
</head>
<body>
<%@include file="/includes/header.jsp" %>
		<div class="container">
		<form action="login.do" method="post">
		
        <input type="text" name="user_email" class="form-control" id="user_email" placeholder="아이디(이메일)">
       	<br>
       	<c:if test="${ !sessionScope.isLoginSuccess }">
         	<h5>사용자를 찾지 못했습니다.</h5>
        </c:if>
        
        <input type="password" name="user_pw" class="form-control" id="user_pw" placeholder="비밀번호"> 
        <br>
		
		<a href="#">비밀번호를 잊으셨나요?</a>
         <c:if test="${ sessionScope.matchedPassword != null && !sessionScope.matchedPassword}">
         	<h5>비밀번호가 일치하지 않습니다.</h5>
         </c:if>
		<br>
		<br>
		
        <button type="submit" class="btn btn-primary">로그인</button>
        
        <hr>
        <br>
        
        <a href="#">다른 방식으로 로그인 할게요.</a>
		
		</form>
		</div>
		
		
		
         
	<%@include file="/includes/footer.jsp" %>
</body>
</html>