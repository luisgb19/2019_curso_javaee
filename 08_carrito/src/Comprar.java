

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Carrito;

/**
 * Servlet implementation class comprar
 */
@WebServlet("/comprar")
public class Comprar extends HttpServlet {
	
    public Comprar() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String producto = (String) request.getAttribute("producto");
		String unidades = (String) request.getAttribute("unidades");
		String precio = (String) request.getAttribute("precio");
		
		Carrito miCarrito = new Carrito(producto,unidades,precio);
		
		HttpSession sesion=request.getSession();
		Vector vCarrito = new Vector();
		
		
		if(sesion.getAttribute("vCarrito")!=null){
			vCarrito = (Vector)sesion.getAttribute("vCarrito");
		}
		
		vCarrito.add(miCarrito);
		
		response.sendRedirect("comprar.html");
	}
}
