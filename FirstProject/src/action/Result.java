package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("inside Result");
		String result = (String) request.getAttribute("k");
		System.out.println(result);
		response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>Hola</title>");
		    out.println("</head>");
		    out.println("<body bgcolor=\"white\">");
		    out.print("Result = "+result);
		    out.println("</body>");
		    out.println("</html>");
	}
}
