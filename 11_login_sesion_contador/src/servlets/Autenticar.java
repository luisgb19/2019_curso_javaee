package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Persona;

/**
 * Servlet implementation class Autenticar
 */
@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd;
		model.Persona per = new Persona("admin@admin.org", "Presidente", 18);
		if(user.equals("admin")&&pwd.equals("admin")) {
		HttpSession sesion=request.getSession();
		sesion.setAttribute("persona", per);
		
//		int i = (Integer)sesion.getAttribute("contador");
//		sesion.setAttribute("contador", i++);
		
			rd=request.getRequestDispatcher("preferencias.html");
			rd.forward(request, response);
		}else {
			//rd=request.getRequestDispatcher("Error");
			response.sendRedirect("error.jsp?user="+user+"&pwd="+pwd);
		}
		
		
	}

	
}
