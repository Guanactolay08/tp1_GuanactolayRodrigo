package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	

	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, float estatura,
			float peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}
	

	@Override
	public String toString() {
		return "Jugador [Nombre=" + nombre + " / Apellido=" + apellido + " / FechaNacimiento=" + fechaNacimiento
				+ "/ Edad="+this.calcularEdad(fechaNacimiento)+" / Nacionalidad=" + nacionalidad + " / Estatura=" + estatura + " / Peso=" + peso + " / Posicion="
				+ posicion + "]";
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

}
