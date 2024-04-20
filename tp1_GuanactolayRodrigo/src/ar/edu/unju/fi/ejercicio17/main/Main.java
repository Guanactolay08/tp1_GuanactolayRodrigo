package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	private static Scanner sc;
	private static List<Jugador> jugadores;
	
	public static void main(String[] args) {
		int opcion=0;
		do {
			opcion=generarMenu();
			switch(opcion) {
				case 1: agregarJugadores();break;
				case 2: mostrarJugador();break;
				case 3: mostrarJugadores();break;
				case 4: modificarJugador();break;
				case 5: eliminarJugador();break;
				case 6: int cantidad= jugadores.size();
						System.out.println("=========================");
						System.out.println("CANTIDAD DE JUGADORES: "+cantidad);
						System.out.println("=========================");
						break;
				case 7: calcularCantidadNacionalidad();break;
				case 8:System.out.println("FIN DEL PROGRAMA.");break;
				default: System.out.println("OPCION INCORRECTA.");break;
					
			}
		}while(opcion != 8);
		sc.close();
		
	}
	/*
	 * Metodo que contiene los datos del menu.
	 */
	
	public static int generarMenu() {
		boolean correcto=false;
		int opcion=0;
		sc=new Scanner(System.in);
		do {
			System.out.println("****************************MENU DE OPCIONES****************************");
			System.out.println("1 - Alta de jugador.");
			System.out.println("2 - Mostrar los datos de un jugador.");
			System.out.println("3 - Mostrar todos los jugadores ordenados por apellido.");
			System.out.println("4 - Modificar los datos de un jugador.");
			System.out.println("5 - Eliminar un jugador.");
			System.out.println("6 - Mostrar la cantidad total de jugadores que tiene el Arraylist.");
			System.out.println("7 - Mostrar la cantidad de jugadores que perteneces a una nacionalidad.");
			System.out.println("8 - Salir.");
			System.out.println("Ingrese opcion: ");
			try {
				opcion = sc.nextInt();
				correcto=true;
			} catch (InputMismatchException e) {
				System.out.println("OPCION INCORRECTA.");
				sc.next();
			}
		}while(correcto == false);
		return opcion;
	}
	/*
	 * Agregar nuevos objetos al arraylist de jugadores
	 */
	public static void agregarJugadores() {
	
		if ( jugadores == null) {
			jugadores = new ArrayList<>();
		}
		System.out.println("Ingrese nombre del jugador: ");
		String nombre = sc.next();
		System.out.println("Ingrese apellido del jugador: ");
		String apellido = sc.next();
		LocalDate fechaNac = pedirFecha();
		System.out.println("Ingrese nacionalidad del jugador: ");
		String nacionalidad = sc.next();
		float estatura = pedirEstatura();
		float peso = pedirPeso();
		String posicion = devolverPosicion();
		jugadores.add(new Jugador(nombre, apellido, fechaNac, nacionalidad, estatura, peso, posicion));
		System.out.println("==============================");
		System.out.println("JUGADOR AGREGADO EXITOSAMENTE.");
		System.out.println("==============================");
	}
	/*
	 * solicitar al usuario una fecha con formato correcto
	 */
	public static LocalDate pedirFecha() {
		LocalDate fechaNac=null;
		boolean fechaCorrecta=false;
		do {
			System.out.println("Ingrese fecha de nacimiento del jugador (dd/mm/yyyy): ");
			String fechaNaciString = sc.next();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			try {
				fechaNac = LocalDate.parse(fechaNaciString,formatter);
				fechaCorrecta = true;
			} catch (Exception e) {
				System.out.println("FORMATO DE FECHA INCORRECTO!!!");
			}
		}while (fechaCorrecta == false);
		return fechaNac;
	}
	/*
	 * retorna la estura del jugador con verificacion de excepciones
	 */
	public static float pedirEstatura() {
		boolean correcto = false;
		float num = 0;
		do {
			System.out.println("Ingrese estatura del jugador: ");
			try {
				num = sc.nextFloat();
				correcto = true;
				} catch (InputMismatchException ex) {
				System.out.println("POR FAVOR INGRESE UN NUMERO REAL SEPARANDO DECIMALES CON ','!! ");
				sc.next();
				}
		}while(correcto == false);
		
		return num;
	}
	/*
	 * retorna el peso del jugador con verificacion de excepciones
	 */
	public static float pedirPeso() {
		boolean correcto = false;
		float num = 0;
		do {
			System.out.println("Ingrese peso del jugador: ");
			try {
				num = sc.nextFloat();
				correcto = true;
				} catch (InputMismatchException ex) {
				System.out.println("POR FAVOR INGRESE UN NUMERO REAL SEPARANDO DECIMALES CON ','!! ");
				sc.next();
				}
		}while(correcto == false);
		
		return num;
	}
	/*
	 * pedir y devolver la posicion de jugador.
	 */
	
	public static String devolverPosicion() {
		String posicion="";
		do {
			System.out.println("Ingrese posicion (arquero/delantero/defensor/medio): ");
			posicion = sc.next();
			
		}while(!posicion.equals("arquero") && !posicion.equals("delantero") && !posicion.equals("defensor") && !posicion.equals("medio"));
		return posicion;
	}
	/*
	 * busca un jugador especifico por nombre y apellido
	 */
	public static Jugador buscarJugador() {
		System.out.println("Ingrese nombre del jugador: ");
		String nombre = sc.next();
		System.out.println("Ingrese apellido del jugador: ");
		String apellido = sc.next();
		Jugador jugadorEncontrado=null;
		
		for(Jugador jugador : jugadores ) {
			if(jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
				jugadorEncontrado = jugador;
			}
		}
		return jugadorEncontrado;
	}
	/*
	 * busca y muestra un objeto especifico del arraylist.
	 */
	public static void mostrarJugador() {
		if(jugadores == null) {
			System.out.println("LISTA DE JUGADORES VACIA.");
		}else {
			Jugador jugadorEncontrado = buscarJugador();
			if (jugadorEncontrado == null) {
				System.out.println("EL JUGADOR NO EXISTE");
			}else {
				System.out.println(jugadorEncontrado);
			}
		}	
	}
	/*
	 * muestra los objetos del arraylist
	 */
	public static void mostrarJugadores() {
		if ( jugadores == null) {
			System.out.println("LISTA DE JUGADORES VACIA.");
		}else {
			System.out.println("=============LISTA DE JUGADORES=============");
			jugadores.sort(Comparator.comparing(Jugador::getApellido));
			jugadores.forEach(j->System.out.println(j));
		}
	}
	/*
	 * modifica los datos de un jugador ingresado por el usuario
	 * tomando solo aquellos datos que considero pueden ser modificados.
	 */
	public static void modificarJugador() {
		if(jugadores == null) {
			System.out.println("LISTA DE JUGADORES VACIA.");
		}else {
			Jugador jugadorEncontrado = buscarJugador();
			if (jugadorEncontrado == null) {
				System.out.println("EL JUGADOR NO EXISTE.");
			}else {
				System.out.println("Ingrese nacionalidad del jugador: ");
				String nacionalidad = sc.next();
				System.out.println("Ingrese estatura del jugador: ");
				float estatura = sc.nextFloat();
				System.out.println("Ingrese peso del jugador: ");
				float peso = sc.nextFloat();
				String posicion = devolverPosicion();
				jugadorEncontrado.setNacionalidad(nacionalidad);
				jugadorEncontrado.setEstatura(estatura);
				jugadorEncontrado.setPeso(peso);
				jugadorEncontrado.setPosicion(posicion);
			}
		}
	}
	/*
	 * Elinicion de un jugador especifico
	 */
	public static void eliminarJugador() {
		if (jugadores == null) {
			System.out.println("LISTA DE JUGADORES VACIA.");
		}else {
			Jugador jugadorEncontrado = buscarJugador();
			if(jugadorEncontrado == null) {
				System.out.println("EL JUGADOR NO EXISTE.");
			}else {
				Iterator<Jugador> iterator = jugadores.iterator();
				while(iterator.hasNext()) {
					Jugador jugador = iterator.next();
					if(jugador.getNombre().equals(jugadorEncontrado.getNombre()) && jugador.getApellido().equals(jugadorEncontrado.getApellido() )) {
						iterator.remove();
						System.out.println("================================");
						System.out.println("JUGADOR ELIMINADO CORRECTAMENTE.");
						System.out.println("================================");
					}	
				}
			}
		}
	}
	
	/*
	 * calcular la cantidad de jugadores de una
	 * determinada nacionalidad solicitada por le usuario
	 */
	public static void calcularCantidadNacionalidad() {
		int cantidad = 0;
		if(jugadores == null) {
			System.out.println("LISTA DE JUGADORES VACIA.");
		}else {
			System.out.println("Ingrese una nacionalidad: ");
			String nacionalidad = sc.next();
			for(Jugador jugador : jugadores ) {
				if(jugador.getNacionalidad().equals(nacionalidad)) {
					cantidad++;
				}
			}
			System.out.println("==================================================================");
			System.out.println("CANTIDAD DE JUGADORES CON NACIONALIDAD "+nacionalidad+": "+cantidad);
			System.out.println("==================================================================");
		}
	}
	
}
