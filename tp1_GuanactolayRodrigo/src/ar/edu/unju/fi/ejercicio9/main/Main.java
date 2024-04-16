package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Producto producto = new Producto();
		int cantidadProductos=1, descuento=0;
		while(cantidadProductos <= 3) {
			System.out.println("Ingrese nombre del producto : ");
			String nombre = sc.next();
			System.out.println("Ingrese codigo del producto: ");
			int codigo = sc.nextInt();
			System.out.println("Ingrese precio del producto: ");
			String precioString = sc.next();
			float precio = Float.parseFloat(precioString);
			do {
				System.out.println("Ingrese el valor del descuento (entre 0 y 50): ");
				descuento = sc.nextInt();
			}while(descuento > 50 || descuento <0);	
			producto.setNombre(nombre);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);
			producto.setDescuento(descuento);
			float precioFinal = producto.calcularDescuento();
			producto.mostrarDatos();
			System.out.println("Precio con descuento: "+precioFinal);
			System.out.println("");
			cantidadProductos++;
		}
		sc.close();
		
	}
	
	
	
	
}
