 。<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

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
 <script type="text/javascript">
	function change(){
		var op1 = document.getElementById("photo_img");
		var photo = document.getElementById("photo");
		var index=photo.selectedIndex ; 
		op1.setAttribute("src", photo.options[index].value);
	}
	function checkpwd(){
		var pwd = document.getElementById("pwd");
		var repwd = document.getElementById("repwd");
		var cp = document.getElementById("checkPwd");
		var sb = document.getElementById("sb");
		if(pwd.value != repwd.value){
			cp.innerHTML="<font color='red'>两次的密码不一样</font>";
			sb.setAttribute('disabled', 'disabled')
			
		}else{
			cp.innerHTML="<font color='green'>验证通过</font>";
			sb.removeAttribute("disabled");
		}
	}
</script>
  </head>
  
  <body>
  <form action="servlet/RegServlet" method="post" onSubmit="return reg(this);">
    <table align="center" width="450" border="0">
    	<tr>
    		<td align="right">username:</td>
    		<td><input type="text" name="username" ></td>
    	</tr>
    	<tr>
    		<td align="right" onkeyup="checkpwd()">password:</td>
    		<td><input type="text" name="pwd" id="pwd"></td>
    	</tr>
    	<tr>
    		<td align="right">confirm pwd:</td>
    		<td><input type="text" name="repwd" onkeyup="checkpwd()" id="repwd">
    		
    		</td>
    		<td id="checkPwd"></td>
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
    			<select name="photo" id="photo" onchange="change();" style="position:relative;top:-18px">
    				<option value="images/avatar_Dante_small1.jpg" selected="selected">photo_1</option>
    				<option value="images/avatar_Go_small1.jpg">photo_2</option>		
    			</select>
    			<img id="photo_img" style="width:50px;height:50px;position:relative;left:10px" src="images/avatar_Dante_small1.jpg"/>
    			
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
    			<input id="sb" type="submit" value="reg">
    			<input type="reset" value="reset">
    		</td>
    	</tr>
    </table>
    </form>
  </body>
</html>
