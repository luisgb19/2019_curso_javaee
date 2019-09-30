package factories;

import daos.DaoContactos;
import daos.DaoContactosImp;

public class FactoryDao {
	public static DaoContactos getDaoContactos() {
		return new DaoContactosImp();
	}
}
