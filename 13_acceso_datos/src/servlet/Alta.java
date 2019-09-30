package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.DaoContactos;
import model.Contacto;

/**
 * Servlet implementation class Alta
 */
@WebServlet("/Alta")
public class Alta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoContactos dao=new DaoContactos();
		
		String nombre=(String)request.getParameter("nombre");
		String email=(String)request.getParameter("email");
		int edad=Integer.parseInt(request.getParameter("edad"));
		
		
		// Si no son nulo alguno de los valores recuperados
//		if(nombre!=null&&email!=null) {
		
		Contacto contacto = new Contacto(0,nombre,email,edad); 
		dao.altaContacto(contacto);
		
//		dao.altaContacto();
		request.getRequestDispatcher("resultado.html").forward(request, response);
/*
	}else {
			request.getRequestDispatcher("datos.html").forward(request, response);
		}
*/
}

}
