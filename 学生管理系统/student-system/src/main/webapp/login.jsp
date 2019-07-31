<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>管理员登录</title>
	<link rel="stylesheet" href="./css/login.css"/>
	<script type="text/javascript">
//账号用户验证
	function check() {
	var account = document.getElementById("account").value;
	var password = document.getElementById("password").value;
	if(account == null || account.length <= 0) {
		alert("账号不能为空");
		return false;
		}
	if(password == null || password.length <= 0 ) {
		alert("密码不能为空");
		return false;
		}
	return true;
	} 
</script>
</head>
<body>
	<div class="center">
		<form action="LoginServlet" method="post">
			<ul>
			<li>学生管理</li>
			<li><span>账号:</span><input type="text" name="account" id="account"></li>
			<li><span>密码:</span><input type="password" name="password" id="password"></li>
			<li style="text-align:left"><input type="submit" value="登录" onclick="return check()" style="margin-left:100px; margin-right: 10px" /> 
			<input type="reset" value="重置"></li>
			</ul>
		</form>
	</div>
</body>
</html>