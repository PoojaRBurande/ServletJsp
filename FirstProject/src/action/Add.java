package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Add extends HttpServlet {	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a=Integer.parseInt(request.getParameter("input1"));
		int b=Integer.parseInt(request.getParameter("input2"));
		a = a+b;
		request.setAttribute("k", a);
		RequestDispatcher rd=request.getRequestDispatcher("Result");
		rd.forward(request, response);
	}


}
