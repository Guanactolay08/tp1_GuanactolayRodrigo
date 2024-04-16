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
	
	public float calcularDescuento() {
		float precio = this.precio-this.descuento;
		return precio;
	}
	public void mostrarDatos() {
		System.out.println("Producto: "+this.nombre);
		System.out.println("Codigo del producto: "+this.codigo);
		System.out.println("Precio: $"+this.precio);
		System.out.println("Descuento: $"+ this.descuento);
	}
}
