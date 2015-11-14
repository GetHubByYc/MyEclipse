package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;

public class RegServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String sex = request.getParameter("sex");
		String photo = request.getParameter("photo");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		UserDao userDao = new UserDao();
		if (username != null && !username.isEmpty()) {
			if (userDao.userExist(username)) {
				//System.out.println(username);
				User user = new User();
				user.setUsername(username);
				user.setPwd(pwd);
				user.setSex(sex);
				user.setPhoto(photo);
				user.setTel(tel);
				user.setEmail(email);
				userDao.saveUser(user);
				request.setAttribute("info", "congratulate reg successfully!");
			} else {
				request.setAttribute("info",
						"sorry: the username is exits! please reg again");
			}
		}
		request.getRequestDispatcher("../message.jsp").forward(request,response);
	}

}
