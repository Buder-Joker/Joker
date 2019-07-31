<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>存储</title>
</head>
<body>
	<div align="center" >
		<form action="Add" method="post">
			学号:<input type="text" name="stuId"><br>
			姓名:<input type="text" name="stuName"><br>
			性别:<input type="text" name="stuSex"><br>
			出生日期:<input type="text" name="stuBid"><br>
			<input type="submit" value="保存">
			<input type="reset" value="重置">
		</form>
	</div>
</body>
</html>