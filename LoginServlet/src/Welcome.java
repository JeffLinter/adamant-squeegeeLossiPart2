import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Welcome() {
		super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--- Inside doPost of Welcome Servlet ----");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("Welcome dear user");
	}

}