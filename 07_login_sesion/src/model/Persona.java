package model;

public class Persona {
	String email;
	String cargo;
	int edad;
	public Persona(String email, String cargo, int edad) {
		super();
		this.email = email;
		this.cargo = cargo;
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
