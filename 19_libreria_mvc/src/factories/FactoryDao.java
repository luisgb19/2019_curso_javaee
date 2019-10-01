package factories;

import daos.DaoClientes;
import daos.DaoLibros;
import daos.DaoTemas;

public class FactoryDao {
	
	public static DaoClientes getDaoClientes() {
		return new DaoClientes();
	}
	public static DaoLibros getDaoLibros() {
		return new DaoLibros();
	}
	public static DaoTemas getDaoTemas() {
		return new DaoTemas();
	}
	

}
