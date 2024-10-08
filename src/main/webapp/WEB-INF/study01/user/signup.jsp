<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>
<form action="/user" method="post">			<!-- form 속성 - action : 요청 주소, method : 요청 방식 (get / post /..) -->
	아이디 : <input type="text" name="username" id="username"> <button id="chk"> 중복 검사 </button> <br>
	비밀번호 : <input type="password" name="password"> <br>
	이메일 : <input type="text" name="email"> <br>
	<input type="submit" value="회원가입">		<!-- 회원가입 버튼 -->
</form>

<script src="/js/signup.js"></script>
<%@ include file="../layout/footer.jsp" %>
