package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class MyServlet extends HttpServlet{
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  request.getRequestDispatcher("WEB-INF/views/registration.jsp").forward(request, response);
		  
		 }

		
}
