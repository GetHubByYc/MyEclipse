<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  	<form action='reg.jsp' method='post'>
  		<table align='center' width='400' height='200' border='1'>
  			<tr>
  				<td align='center' height='40'>
  					<b>add user information</b>
  				</td>
  			</tr>
  			<tr>
  				<td align='right'>name: </td>
  				<td>
  					<input type='text' name='name'>
  				</td>
  			</tr>
			<tr>
  				<td align='right'>age: </td>
  				<td>
  					<input type='text' name='age'>
  				</td>
  			</tr>
  			<tr>
  				<td align='right'>sex: </td>
  				<td>
  					<input type='text' name='sex'>
  				</td>
  			</tr>
  			<tr>
  				<td align='right'>addresss: </td>
  				<td>
  					<input type='text' name='addr'>
  				</td>
  			</tr>
  			<tr>
  				<td align='center' colspan='2'>
  					<input type='submit' value='submit'>
  				</td>
  			</tr>
  		</table>
  	</form>
  </body>
</html>