<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WebTest Page</title>
<script type="text/javascript" src="testScript.js"></script>
</head>
<body>
<form method="get" action="testServlet" name="frm">
<h2> 회원 가입 페이지 </h2>

 <label for="userName"> 이름 </label><span style="color:blue;"> * </span>
 <input type="text" id="userName" name="userName"> <br>
 
 <label> 주민등록번호 </label><span style="color:blue;"> * </span>
 <input type="text" id="userNoBir" name="userNoBir"> -
  <input type="password" id="userNoSec" name="userNoSec"> <br>

  <label for="userID"> 아이디 </label><span style="color:blue;"> * </span>
  <input type="text" id="userID" name="userID"> <br>

  <label for="userPwd"> 비밀번호 </label><span style="color:blue;"> * </span>
  <input type="password" id="userPwd" name="userPwd"> <br>

  <label for="userPwdchk"> 비밀번호확인 </label><span style="color:blue;"> * </span>
 <input type="password" id="userPwdchk" name="userPwdchk"> <br>
 
 <label for="userEmail"> 이메일 </label><span style="color:blue;"> * </span>
  <input type="text" name="userEmail" id="userEmail"> @
  <input type="text" name="Emailaddr" id="Emailaddr">

  <label for="EmailSelect" style="float: left;"> </label>
     <select id="EmailSelect" name="EmailSelect" size="1">
      <option value="직접입력">직접입력 </option>
      <option value="naver.com"> naver.com </option>
      <option value="nate.com"> nate.com </option>
      <option value="hanmail.net"> hanmail.net </option>
      <option value="gmail.com"> gmail.com </option>
    </select>
    <br>

 <label for="userHomeNo"> 우편번호 </label> &nbsp;
    <input type="text" id="userHomeNo" name="userHomeNo"> <br>
   
    <label for="userAddr1"> 주소 </label> &nbsp;
  <input type="text" id="userAddr1" name="userAddr1">
  <input type="text" id="userAddr2" name="userAddr2"> <br>
  
  <label for="userHP"> 전화번호 </label> &nbsp;
  <input type="text" name="userHP"> <br>
 
 <label for="job" style="float: left;"> 직업 </label>
    <select id="job" name="job" size="1">
      <option value="학생"> 학생 </option>
      <option value="공무원"> 공무원 </option>
      <option value="언론"> 언론 </option>
      <option value="컴퓨터/인터넷"> 컴퓨터/인터넷 </option>
   </select>
   <br>

  <label for="chkMailSMS"> 메일/SMS 정보 수신 여부 </label> &nbsp;
  <input type="radio" id="chkMailSMS" name="chkMailSMS" value="yes" checked> 수신
  <input type="radio" id="chkMailSMS" name="chkMailSMS" value="no"> 거부 <br><br>

 <label for="pl"> 개발언어 관심 분야 </label> &nbsp; <br>
 <input type="checkbox" name="pl" value="C"> C
 <input type="checkbox" name="pl" value="C++"> C++
  <input type="checkbox" name="pl" value="Java"> Java <br>
  <input type="checkbox" name="pl" value="C#"> C#
  <input type="checkbox" name="pl" value="JavaScript"> JavaScript
 <input type="checkbox" name="pl" value="python"> python <br>

 <br><br>
 <input type="submit" value="회원가입" style="float: center;" onclick="return check()">
 <input type="reset" value="취소" style="float: center;margin-right:50px">

</form>
</body>
</html>
