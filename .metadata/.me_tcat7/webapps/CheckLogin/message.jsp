<%@page import="java.io.PrintWriter"%>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="model.User" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'message.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<%
		PrintWriter outPrintWriter = response.getWriter();
		String info = (String) request.getAttribute("info");
		if (info != null) {
			outPrintWriter.println(info);
		}
		User user=(User)session.getAttribute("user");
		if(user != null){
			outPrintWriter.println("login sucessfully!");
		}else{
			outPrintWriter.println("login faild!");
		}	
	%>
	
</body>
</html>
