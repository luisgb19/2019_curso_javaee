package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Producto;

/**
 * Servlet implementation class Agregar
 */
@WebServlet("/Agregar")
public class Agregar extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Producto p=new Producto(request.getParameter("nombre"), 
				Double.parseDouble(request.getParameter("precio")), 
				Integer.parseInt(request.getParameter("unidades")));
		HttpSession s=request.getSession();
		//obtenemos el carrito que est� almacenado en la sesi�n
		List<Producto> productos=(List<Producto>)s.getAttribute("carrito");
		//tanto si es nuevo carrito como uno ya existente, se a�ade el nuevo producto
		//al mismo
		productos.add(p);
		
		
		request.getRequestDispatcher("nuevo.html").forward(request, response);
		
	}

}
