                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       <%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'reg.jsp' starting page</title>

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
    <jsp:useBean id="person" class='Bean.Person' scope='page'>
    	<jsp:setProperty name='person' property='*' />
    </jsp:useBean>
    <table align='center' width='400'>
    	<tr>
    		<td align='right'>name: </td>
    		<td>
    			<jsp:getProperty property='name' name='person'/>
    		</td>
    	</tr>
    	<tr>
    		<td align='right'>age: </td>
    		<td>
    			<jsp:getProperty property='age' name='person'/>
    		</td>
    	</tr>
    	<tr>
    		<td align='right'>sex: </td>
    		<td>
    			<jsp:getProperty property='sex' name='person'/>
    		</td>
    	</tr>
    	<tr>
    		<td align='right'>addr: </td>
    		<td>
    			<jsp:getProperty property='addr' name='person'/>
    		</td>
    	</tr>
    </table>

  </body>
</html>
