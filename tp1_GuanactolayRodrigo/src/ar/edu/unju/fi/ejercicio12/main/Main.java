package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Calendar fecha = Calendar.getInstance();
		Persona persona = new Persona();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre de la persona: ");
		String nombre = sc.nextLine();
		System.out.println("Ingrese año de nacimineto (yyyy): ");
		int anio = sc.nextInt();
		System.out.println("Ingrese mes de nacimineto (mm) : ");
		int mes = sc.nextInt();
		System.out.println("Ingrese dia de nacimiento (dd) : ");
		int dia = sc.nextInt();
		fecha.set(anio, mes-1, dia);
		persona.setNombre(nombre);
		persona.setFechaNacimiento(fecha);
		persona.mostrarDatos();
		sc.close();
	}

}
