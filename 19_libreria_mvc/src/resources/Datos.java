package resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Datos {
	// Implementacion del patrón Service Locator
	private static DataSource getDataSource(String ref) {
		DataSource ds=null;
		try {
			Context ct=new InitialContext();
			ds=(DataSource)ct.lookup("java:comp/env/"+ref);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return ds;
	}
	public static Connection getConnection(String ref) {
		
		Connection con = null;
		DataSource ds = getDataSource(ref);
		try {
			con= ds.getConnection();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
/*	
	static {
		try {
			//cargar el driver
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	static Connection obtenerConexion() {
		//crear conexión con base de datos
		Connection cn=null;
		try {
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/libros", "root", "root");
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return cn;
	}
	*/
}
