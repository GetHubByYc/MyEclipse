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
  <form action="servlet/RegServlet" method="post" onSubmit="return reg(this);">
    <table align="center" width="450" border="0">
    	<tr>
    		<td align="right">username:</td>
    		<td><input type="text" name="username" ></td>
    	</tr>
    	<tr>
    		<td align="right">password:</td>
    		<td><input type="text" name="pwd" ></td>
    	</tr>
    	<tr>
    		<td align="right">confirm pwd:</td>
    		<td><input type="text" name="repwd" ></td>
    	</tr>
    	<tr>
    		<td align="right">sex:</td>
    		<td>
    			<input type="radio" name="sex" value="male" checked="checked">male
    			<input type="radio" name="sex" value="fmale">female
    		</td>
    		
    	</tr>
    	<tr>
    		<td align="right">photo:</td>
    		<td>
    			<select name="photo" id="photo" onchange="change();">
    				<option value="images/avatar_Dante_small1.jpg" selected="selected">photo_1</option>
    				<option value="images/avatar_Go_small1.jpg">photo_2</option>
    				<img id="photo_img" src="images/avatar_Dante_small1.jpg"/>
    			</select>
    			
    		</td>
    	</tr>
    	<tr>
    		<td align="right">telphone:</td>
    		<td><input type="text" name="tel" ></td>
    	</tr>
    	<tr>
    		<td align="right">email:</td>
    		<td><input type="text" name="email" ></td>
    	</tr>
    	<tr>
    		<td colspan="2" align="center">
    			<input type="submit" value="reg">
    			<input type="reset" value="reset">
    		</td>
    	</tr>
    </table>
    </form>
  </body>
</html>
