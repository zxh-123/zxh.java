<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="deptUpdate.action">
	    deptno:<input name="dept.deptNo" value="${dept.deptNo}"/><br/>
	    dname:<input name="dept.dname" value="${dept.dname }"/><br/>
	    loc:<input name="dept.loc" value="${dept.loc }"/>
	    <button>提交</button>
	</form>
</body>
</html>