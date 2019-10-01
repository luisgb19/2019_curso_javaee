package daos;

import java.util.List;

import javabeans.Libro;

public interface DaoLibrosImp {

	List<Libro> recuperarLibros();

	List<Libro> recuperarLibros(int idTema);

}