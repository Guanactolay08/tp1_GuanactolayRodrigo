package ar.edu.unju.fi.ejercicio6.main;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Constructor por defecto
		Persona persona = new Persona();
		System.out.println("Iingresar DNI: ");
		String dni = sc.nextLine();
		System.out.println("Iingresar nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Iingresar fecha de nacimiento (dd/mm/yyyy): ");
		String fechaNaciString = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNaciString,formatter);
		System.out.println("Ingrese provincia: ");
		String provincia = sc.nextLine();
		persona.setNombre(nombre);
		persona.setDni(dni);
		persona.setFechaNacimiento(fechaNac);
		persona.setProvincia(provincia);
		int edad = persona.calcularEdad(fechaNac);
		boolean mayor = persona.mayorDeEdad(edad);
		persona.mostrarDatos(persona, edad, mayor);
		
		//constructor parametrizado
		System.out.println("Iingresar DNI: ");
		String dni2 = sc.nextLine();
		System.out.println("Iingresar nombre: ");
		String nombre2 = sc.nextLine();
		System.out.println("Iingresar fecha de nacimiento (dd/mm/yyyy): ");
		String fechaNaciString2 = sc.nextLine();
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac2 = LocalDate.parse(fechaNaciString2,formatter2);
		System.out.println("Ingrese provincia: ");
		String provincia2 = sc.nextLine();
		Persona persona2 = new Persona(dni2, nombre2, fechaNac2, provincia2);
		int edad2 = persona.calcularEdad(fechaNac2);
		boolean mayor2 = persona.mayorDeEdad(edad2);
		persona.mostrarDatos(persona2, edad2, mayor2);
		
		//constructor con inicializacion en provincia = jujuy
		System.out.println("Iingresar DNI: ");
		String dni3 = sc.nextLine();
		System.out.println("Iingresar nombre: ");
		String nombre3 = sc.nextLine();
		System.out.println("Iingresar fecha de nacimiento (dd/mm/yyyy): ");
		String fechaNaciString3 = sc.nextLine();
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac3 = LocalDate.parse(fechaNaciString3 ,formatter3);
		Persona persona3 = new Persona(dni3, nombre3, fechaNac3);
		int edad3 = persona.calcularEdad(fechaNac3);
		boolean mayor3 = persona.mayorDeEdad(edad3);
		persona.mostrarDatos(persona3, edad3, mayor3);
		sc.close();

	}

}
