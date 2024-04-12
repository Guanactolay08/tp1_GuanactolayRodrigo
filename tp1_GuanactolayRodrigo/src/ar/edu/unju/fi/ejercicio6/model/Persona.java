package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int calcularEdad(LocalDate fecha) {
		LocalDate fechaActual = LocalDate.now();
		int añoActual = fechaActual.getYear();
		int edad = añoActual - fecha.getYear();
		if (fecha.getMonthValue() > fechaActual.getMonthValue()) {
				edad=edad-1;
		}else {
			if(fecha.getMonthValue() == fechaActual.getMonthValue() && (fecha.getDayOfMonth()>fechaActual.getDayOfMonth()) ) {	
					edad=edad-1;
			}
		}
			
		return edad;
	}
	public boolean mayorDeEdad(int edad) {
		boolean mayor=false;
		if (edad>=18) {
			mayor=true;
		}
		return mayor;
	}
	public void mostrarDatos(Persona persona, int edad, boolean mayor) {
		System.out.println("Nombre: "+persona.nombre);
		System.out.println("DNI: "+persona.dni);
		System.out.println("Fecha de nacimiento: "+persona.fechaNacimiento);
		System.out.println("Provincia: "+persona.provincia);
		System.out.println("Edad: "+edad);
		if(mayor==true) {
			System.out.println("La persona es mayor de edad");
		}else
		{
			System.out.println("La persona es menor de edad");
		}
	}
}
