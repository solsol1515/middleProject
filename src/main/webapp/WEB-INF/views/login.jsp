<<<<<<< HEAD
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${sessionScope.login}님 로그인 성공하였습니다.<hr>
	
	<a href=''>모든 회원 정보 보기 </a>
	
</body>
</html>



<%@ page import="java.sql.*"%>
<% 
//  		String id 	= request.getParameter("id");
//  		String pw = request.getParameter("pw");
		
//  		Class.forName("oracle.jdbc.OracleDriver");
		
//  		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "scott", "tiger");
		
//  		String sql = "select member_id id, pw from judamember where id=? and pw=?";
		
//  		PreparedStatement pstmt = con.prepareStatement(sql);
//  		pstmt.setString(1, id);
//  		pstmt.setString(2, pw);
		
//  		ResultSet rs = pstmt.executeQuery();
		
//  		if(rs.next()){
//  			out.print("접속성공");
//  			session.setAttribute("id", "hansol");
//  			session.setAttribute("pw", "0215");
			
//  			response.sendRedirect("index.jsp"); // 로그인하면 인덱스 화면으로 이동
//  			session.setAttribute("pw", "0215");
//  		}else{
//  			out.print("접속실패ㅠㅠ");
//  			response.sendRedirect("login.jsp"); // 로그인 실패할 경우 다시 로그인 화면으로 이동
//  		}
		
		
		
		%> 
=======
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
<link href="resources/css/style_login.css" rel="stylesheet" type="text/css">
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
            
            <div class="forget-pass"></div>
            
            <div class="login_search">
            	<a href='searchId.do'><b>아이디 찾기</b></a> &nbsp; &nbsp;
            	<a href='searchPwd.do'><b>비밀번호 찾기</b></a>&nbsp; &nbsp;
            	<a href='views/join.do'><b>회원가입</b></a>
            </div>

            <button type="submit">들 어 가 기</button>

          </form>
        </div>
    
      </div>
      </div>
  </div>
</body>
</html>
>>>>>>> 87a9c1b58909d2a0468378e6d55cf909113303da
