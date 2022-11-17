<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<script type="text/javascript" src="/js/login.js"></script>
<link href="resources/css/style.css" rel="stylesheet" type="text/css">
<body>
  <div class="parent clearfix">
    <div class="bg-illustration">
      <img src="resources/images/로고.png" alt="logo">

      <div class="burger-btn">
        <span></span>
        <span></span>
        <span></span>
      </div>

    </div>
    
    <div class="login">
      <div class="container">
        <h1>酒 다<br />로 그 인</h1>
    
        <div class="login-form">
          <form action="">
            <input type="text" placeholder="아이디">
            <input type="password" placeholder="비밀번호">

            <div class="remember-form">
              <input type="checkbox">
              <span>정보 기억하기</span>
            </div>
            <div class="forget-pass">
              <a href="#">비밀번호를 잊으셨나요?</a>
            </div>

            <button type="submit">들 어 가 기</button>

          </form>
        </div>
    
      </div>
      </div>
  </div>
</body>
</html>