package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.sampled.ReverbType;

import model.User;

public class UserExitServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		if(user != null){
			session.removeAttribute("user");
			request.setAttribute("info", user.getUsername()+"exit successfully!");
		}
	request.getRequestDispatcher("message.jsp").forward(request, response);
	}
}
