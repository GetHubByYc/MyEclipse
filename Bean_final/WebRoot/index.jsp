<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head>
  </head>
  
  <body>
 <jsp:useBean id="stu" class="test.TestBean" />
 <jsp:setProperty name="stu" property="name" value="Godwin"/>
 <jsp:setProperty name="stu" property="gender" value="male"/>
 <jsp:setProperty name="stu" property="age" value="27"/>
  <table>
      <tr>
       <td>姓名</td>
       <td> : </td>
       <td> <jsp:getProperty name="stu" property="name"/> </td>
      </tr>
      <tr>
       <td>性别</td>
       <td> : </td>
       <td> <jsp:getProperty name="stu" property="gender"/> </td>
      </tr>
      <tr>
       <td>年龄</td>
       <td> : </td>
       <td> <jsp:getProperty name="stu" property="age"/> </td>
      </tr>
     </table>
  </body>
</html>