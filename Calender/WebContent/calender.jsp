<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="cb" type="beans.calbean" scope="request"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calender</title>
</head>
<body>
<h2>Calender</h2>


<jsp:getProperty name="cb" property="caldata"/>


<br/>予定を入れてください<br/>
<form action="http://localhost:8080/Calender/calender" method="GET" accept-charset="UTF-8">
<input type ="date" name="dates"><br/>
<input type="text" name="contents">
<input type="submit" value="送信">
</form>
</body>
</html>