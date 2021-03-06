package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PROFILEsevlet
 */
@WebServlet("/PROFILEsevlet")
public class PROFILEsevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		request.getRequestDispatcher("Link.html").include(request, response);

		Cookie ck[] = request.getCookies();
		if (ck != null)
		{
			String name = ck[0].getValue();
			if (!name.equals("") || name != null) 
			{
				out.print("<b>Welcome to Profile</b>");
				out.print("<br>Welcome, " + name);
			}
		} else 
		{
			out.print("Please login first");
			request.getRequestDispatcher("Login.html").include(request, response);
		}
		out.close();

	}

}
