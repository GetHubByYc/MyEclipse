<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	String rs;
	String to = "292538649@qq.com";
	String from = "sudo_yc@163.com";
	String host = "localhost";
	Properties properties = System.getProperties();
	properties.setProperty("mail.smtp.host",host);
	Session mailSession = Session.getDefaultInstance(properties);
	
	
	try{
	MimeMessage msg = new MimeMessage(mailSession);
	msg.setFrom(new InternetAddress(from));
	msg.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	msg.setSubject("this is the Subject line");
	msg.setText("this is actual message");
	Transport.send(msg);
	rs = "Sent message successfully";
	}catch(Exception e){
		e.printStackTrace();
		rs = "Error: unable to send message...";
	}
 %>
<body>
<center>
<h1>Send Email using JSP</h1>
</center>
<p align="center">
<% 
   out.println("Result: " + rs + "\n");
%>
</p>
</body>
</html>