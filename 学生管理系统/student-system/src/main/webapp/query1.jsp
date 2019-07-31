<%@page import="user.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
</head>
<body>
	
	<div align="center">
		<form action="UpdateStudent" method="post">
			<%Student student = (Student)request.getAttribute("student"); %>
			<input type="hidden" name="stuId" value="<%=student.getId()%>">
			姓名:<input type="text" name="stuName" value="<%=student.getName()%>"><br>
			性别:<input type="text" name="stuSex" value="<%=student.getSex()%>"><br>
			生日:<input type="text" name="stuBid" value="<%=student.getBid()%>"><br>
		</form>
	</div>
</body>
</html>