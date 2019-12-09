<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="800px" align="center" cellspacing="0px"
		bordercolor="black" style="border-collapse: collapse">
		<caption><h3>部门管理</h3></caption>
		<tr>
			<th>部门编号</th>
			<th>部门名称</th>
			<th>部门地址</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${depts}" var="dept" >
		    <tr>
				<th>${dept.deptNo}</th>
				<th>${dept.dname}</th>
				<th>${dept.loc}</th>
				<th>
				<a href="deptFindOne.action?dept.deptNo=${dept.deptNo}">修改</a>
				<a href="deptDelete.action?dept.deptNo=${dept.deptNo }">删除</a>
				</th>
		    </tr>
		</c:forEach>
		
	</table>
	<a href="deptAdd.jsp">添加</a>
</body>
</html>