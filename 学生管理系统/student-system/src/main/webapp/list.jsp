<%@page import="java.util.ArrayList"%>
<%@page import="user.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主界面</title>
<link rel="stylesheet" href="./css/list.css"/>
</head>
<body>
	<div align="center" class = "id">
		<table border="1" cellpadding="0" cellspacing = "0" width="80%">
			<caption>学生列表</caption>
			<tr align="center">
				<th>学生学号</th>
				<th>学生姓名</th>
				<th>学生性别</th>
				<th>出生日期</th>
				<th>用户操作 </th>
			</tr>
				<%
					List<Student> list = (ArrayList)request.getAttribute("l"); 
					for(Student student: list){
				%>
				<tr>
					<td><%=student.getId() %></td>
					<td><%=student.getName() %></td>
					<td><%=student.getSex() %></td>
					<td><%=student.getBid() %></td>
					<td>	
						<a href = "Add?">增加</a>
						<a href="DelServlet?stuId=<%=student.getId()%>" onclick="return confirm('是否要删除')">删除</a>
						<a href="Update?stuId=<%=student.getId()%>">更新</a>
						<a href = "Query?stuId=<%= student.getId() %>">查询</a>
						
					</td>
				</tr>
				<%} %>
		</table>

	</div>
</body>
</html>