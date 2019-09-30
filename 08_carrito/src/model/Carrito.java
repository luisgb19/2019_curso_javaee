package model;

public class Carrito {

	String producto; 
	String unidades;
	String precio;
	
	public Carrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carrito(String producto, String unidades, String precio) {
		super();
		this.producto = producto;
		this.unidades = unidades;
		this.precio = precio;
	}
	
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getUnidades() {
		return unidades;
	}
	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
}
