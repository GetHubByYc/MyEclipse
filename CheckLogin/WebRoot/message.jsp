<%@page import="java.io.PrintWriter"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
		String av = (String) request.getAttribute("av");
		if (info != null) {
			outPrintWriter.println(info);
		}
		User user=(User)session.getAttribute("user");
		if(user != null){
	%>
		<table align="center" width="350" border="1" height="200" bordercolor="#E8F4CC">
			<tr>
				<td align="center" colspan="2">
					<span style="font-weight:bold;font-size:18px><%=user.getUsername() %></span>"
					login successfully!
				</td>
			</tr>
			<tr>
				<td align="right" width="30%">Avatar: </td>
				<td>
					<%if( av!=null){
					%>
					<img src="<%=av %>">
					<%}else{ %>
					<img src="<%=user.getPhoho() %>">
					<%} %>
				</td>
			</tr>
			<tr>
				<td align="right">sex: </td>
				<td><%=user.getSex() %>
			</tr>
			<tr>
				<td align="right">tel: </td>
				<td><%=user.getTel() %></td>
			</tr>
			<tr>
				<td align="right">email: </td>
				<td><%=user.getEmail() %></td>
			</tr>
		</table>
	<%
		}else{
			out.println("sorry,you haven't login");
		}
	 %>
</body>
</html>
