package ar.edu.unju.fi.ejercicio9.model;


public class Producto {
	private String nombre;
	private int codigo;
	private float precio;
	private int descuento;
	
	public Producto() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	public float calcularDescuento(Producto producto) {
		float precio = producto.precio-producto.descuento;
		return precio;
	}
	public void mostrarDatos(Producto producto) {
		System.out.println("Producto: "+producto.nombre);
		System.out.println("Codigo del producto: "+producto.codigo);
		System.out.println("Precio: $"+producto.precio);
		System.out.println("Descuento: $"+ producto.descuento);
	}
}
