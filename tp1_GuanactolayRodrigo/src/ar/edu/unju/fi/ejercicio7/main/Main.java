package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre del empleado: ");
		String nombre = sc.nextLine();
		//sc.nextLine();
		System.out.println("Ingrese legajo del empleado: ");
		int legajo = sc.nextInt();
		System.out.println("Ingrese salario: ");
		String salarioString = sc.next();
		double salario = Double.parseDouble(salarioString);
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		empleado.mostrarDatos();
		empleado.darAumento();
		empleado.mostrarDatos();
		sc.close();
	}

}
