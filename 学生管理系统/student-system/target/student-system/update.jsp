<%@page import="user.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改</title>
</head>
<body>
	<div align="center">
		<form action="Update" method="post">
			<%Student student = (Student)request.getAttribute("student"); %>
			<input type="hidden" name="stuId" value="<%=student.getId()%>">
			姓名:<input type="text" name="stuName" value="<%=student.getName()%>"><br>
			性别:<input type="text" name="stuSex" value="<%=student.getSex()%>"><br>
			生日:<input type="text" name="stuBid" value="<%=student.getBid()%>"><br>
			<input type="submit" value="更新">
			<input type="reset" value="重置">
		</form>
	</div>
</body>
</html>