package ar.edu.unju.fi.ejercicio7.model;

import java.util.Scanner;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	
	final double salarioMinimo = (double)210000.00;
	final double aumentoMerito = (double)20000.00;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario >= salarioMinimo) {
			this.salario = salario;
		}else
			this.salario = salarioMinimo;	
	}
	
	public void mostrarDatos(Empleado empleado) {
		System.out.println("Nombre del empleado: "+empleado.nombre);
		System.out.println("Legajo: "+empleado.legajo);
		System.out.println("Salario $: "+empleado.salario);
	}
	
	public void darAumento(Empleado empleado) {
		Scanner sc = new Scanner(System.in);
		String opcion ="";
		boolean opcionInvalida;
		do {
			opcionInvalida=false;
			System.out.println("Dar aumento por meritos al empleado? S/N: ");
			opcion = sc.next();
			if (!opcion.equals("s") && !opcion.equals("s") && !opcion.equals("n")  && !opcion.equals("N")) { 
				System.out.println("Opcion invalida");
				opcionInvalida=true;
			}else
			{ if(opcion.equals("S") || opcion.equals("s") ) {
				empleado.salario = empleado.salario + aumentoMerito;
			}	
			}
		}while(opcionInvalida==true);
		sc.close();
		
	}
	
	
	
}
