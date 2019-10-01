package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.DaoClientes;
import daos.DaoClientesImp;
import daos.DaoLibros;
import daos.DaoTemas;
import daos.DaoTemasImp;
import factories.FactoryDao;
import javabeans.Libro;



@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DaoClientesImp gestion=FactoryDao.getDaoClientes();
		boolean resultado=false;
		if(gestion.autenticar(request.getParameter("user"),request.getParameter("pwd"))){
			DaoTemasImp gtemas=new DaoTemas();
			request.setAttribute("temas", gtemas.obtenerTemas());
			
            resultado=true;
            

		}
		else{
			request.setAttribute("mensaje", "Usuario no registrado");
			
		}
       
        request.setAttribute("resultado",resultado);
	}
	

}
