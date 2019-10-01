package daos;

import javabeans.Cliente;

public interface DaoClientesImp {

	boolean autenticar(String user, String pass);

	void registrar(Cliente c);

}