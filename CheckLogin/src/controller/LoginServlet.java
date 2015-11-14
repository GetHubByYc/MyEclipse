package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;

public class LoginServlet extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		UserDao userDao = new UserDao();
		User user = userDao.login(username, pwd);
		if(user !=null){
			request.getSession().setAttribute("user", user);
			request.setAttribute("av", "../"+user.getPhoho());
			request.getSession().setMaxInactiveInterval(60);
			//response.sendRedirect("fmessage.jsp");
		  request.getRequestDispatcher("../message.jsp").forward(request, response);
		}else{
			request.setAttribute("info", "error: username or password if wrong");
			request.getRequestDispatcher("../message.jsp").forward(request, response);

		}
	}

}
