package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	
	private String nombre;
	private Calendar fechaNacimiento;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/*
	 * Calculo de edad de la persona
	 */
	public int calcularEdad() {
		Calendar hoy = Calendar.getInstance();
		int mesNacimiento =this.fechaNacimiento.get(Calendar.MONTH);
		int mesActual= hoy.get(Calendar.MONTH);
		int diaNacimiento=this.fechaNacimiento.get(Calendar.DATE);
		int diaActual=hoy.get(Calendar.DATE);
		int edad = hoy.get(Calendar.YEAR) - this.fechaNacimiento.get(Calendar.YEAR);
		if (mesNacimiento > mesActual) {
			edad = edad-1;	
		}else {
			if( (mesActual == mesNacimiento) && (diaNacimiento > diaActual) ) {
				edad = edad-1;
			}
		}
		return edad;
	}
	/*
	 * Devolver el signo zodiacal de la persona
	 */
	public String devolverSigno() {
		String signo="";
		int mes = this.fechaNacimiento.get(Calendar.MONTH);
		int dia = this.fechaNacimiento.get(Calendar.DATE);
		switch(mes) {
		case 0: if (dia<20) {
					signo="CAPRICORNIO";
				}else {
					signo="ACUARIO";
				}break;
		case 1: if (dia<19) {
					signo="ACUARIO";
				}else {
					signo="PISCIS";
				}break;
		case 2: if (dia<21) {
					signo="PISCIS";
				}else {
					signo="ARIES";
					}break;
		case 3: if (dia<20) {
					signo="ARIES";
				}else {
					signo="TAURO";
				}break;
		case 4: if (dia<21) {
					signo="TAURO";
				}else {
					signo="GEMINIS";
				}break;
		case 5: if (dia<21) {
					signo="GEMINIS";
				}else {
					signo="CANCER";
				}break;
		case 6:	if (dia<23) {
					signo="CANCER";
				}else {
					signo="LEO";
				}break;
		case 7:	if (dia<23) {
					signo="LEO";
				}else {
					signo="VIRGO";
				}break;
		case 8:	if (dia<23) {
					signo="VIRGO";
				}else {
					signo="LIBRA";
				}break;
		case 9: if (dia<23) {
					signo="LIBRA";
				}else {
					signo="ESCORPIO";
				}break;
		case 10: if (dia<22) {
					signo="ESCORPIO";
				}else {
					signo="SAGITARIO";
				}break;
		case 11: if (dia<22) {
					signo="SAGITARIO";
				}else {
					signo="CAPRICORNIO";
				}break;
		default: System.out.println("");break;
		}
		return signo;
	}
	/*
	 * Determinar en que estacion nacio.
	 */
	public String devolverEstacion() {
		String estacion="";
		int mes = this.fechaNacimiento.get(Calendar.MONTH);
		int dia = this.fechaNacimiento.get(Calendar.DATE);
		if (mes == 0 || mes == 1 || (mes ==11 && dia >=21) || (mes == 2 && dia <= 20) ) {
			estacion ="VERANO";
		}else {
			if (mes == 3 || mes == 4 || (mes ==2 && dia >=21) || (mes == 5 && dia <= 20) ) {
				estacion ="OTOÑO";
			}else {
				if (mes == 6 || mes == 7 || (mes ==5 && dia >=21) || (mes == 8 && dia <= 20) ) {
					estacion ="INVIERNO";
				}else {
					if (mes == 9 || mes == 10 || (mes ==8 && dia >=21) || (mes == 11 && dia <= 20) ) {
						estacion ="PRIMAVERA";
					}
				}
			}
		}
		return estacion;
	}
	/*
	 * muestra de los datos de la persona
	 */
	public void mostrarDatos () {
		System.out.println("Nombre: "+this.nombre);
		int anio = this.fechaNacimiento.get(Calendar.YEAR);
		int mes = this.fechaNacimiento.get(Calendar.MONTH)+1;
		int dia = this.fechaNacimiento.get(Calendar.DATE);
		System.out.println("Fecha de nacimiento: "+dia+"/"+mes+"/"+anio);
		System.out.println("Edad: "+this.calcularEdad()+" años");
		System.out.println("Signo del zodiaco: "+this.devolverSigno());
		System.out.println("Estacion: "+this.devolverEstacion());
	}
	

}
