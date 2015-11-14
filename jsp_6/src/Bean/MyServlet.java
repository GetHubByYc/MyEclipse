package Bean;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.server.ServerCloneException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.RepaintManager;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class MyServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws
		 IOException{
		response.setContentType("text/html");
		response.setCharacterEncoding("GBK");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<head><title>Servlet ÊµÀý</title></head>");
		out.println("<body");
		out.print("Servlet ÊµÀý");
		out.print(this.getClass());
		out.println("</body>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
