package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	private static Scanner sc;
	private static List<Pais> paises;
	private static List<DestinoTuristico> destinosTuristicos;
	public static void main(String[] args) {
		int opcion=0;
		precargarPaises();
		do {
			opcion=generarMenu();
			switch(opcion) {
				case 1: agregarDestinosTuristicos();break;
				case 2: mostrarDestinos();break;
				case 3: modificarPais();break;
				case 4: limpiarArraylist();break;
				case 5: eliminarDestino();break;
				case 6: mostrarDestinosOrdenados();break;
				case 7: mostrarPaises();break;
				case 8: mostrarDestinosEspecificos();break;
				case 9:System.out.println("FIN DEL PROGRAMA.");break;
				default: System.out.println("OPCION INCORRECTA.");break;		
			}
		}while(opcion != 9);
		sc.close();
	}
	/*
	 * CONSTRUCCION DEL MENU PRINCIPAL.
	 */
	
	public static int generarMenu() {
		boolean correcto=false;
		int opcion=0;
		sc=new Scanner(System.in);
		do {
			System.out.println("****************************MENU DE OPCIONES****************************");
			System.out.println("1 - Alta de destino turistico.");
			System.out.println("2 - Mostrar todos los destinos turisticos.");
			System.out.println("3 - Modificar el pais de un destino turistico.");
			System.out.println("4 - Limpiar arraylist de destinos turisticos.");
			System.out.println("5 - Eliminar destino turistico.");
			System.out.println("6 - Mostrar destinos turisticos ordenados por nombre.");
			System.out.println("7 - Mostrar todos los paises.");
			System.out.println("8 - Mostrar los destinos turisticos que pertenecen a un pais.");
			System.out.println("9 - Salir.");
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
	 * AGREGADO DE OBJETOS AL ARRAYLIST PAISES
	 */
	public static void precargarPaises() {
		if (paises == null ) {
			paises = new ArrayList<>();
		}
		paises.add(new Pais("1A", "ARGENITNA"));
		paises.add(new Pais("1B", "BRASIL"));
		paises.add(new Pais("2E", "ESPAÑA"));
		paises.add(new Pais("2F", "FRANCIA"));
		paises.add(new Pais("3I", "INDIA"));
		paises.add(new Pais("3J", "JAPON"));	
	}
	/*
	 * Agregar nuevos objetos al arraylist de DestinosTuristicos
	 */
	public static void agregarDestinosTuristicos() {
	
		if ( destinosTuristicos == null) {
			destinosTuristicos = new ArrayList<>();
		}
		System.out.println("Ingrese codigo del destino: ");
		String codigo = sc.next();
		System.out.println("Ingrese nombre del destino: ");
		String nombre = sc.next();
		float precio = pedirPrecio();
		Pais pais = pedirPais();
		int cantidadDias = pedirCantDias();
		destinosTuristicos.add(new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias));
		System.out.println("=======================================");
		System.out.println("DESTINO TURISTICO AGREGADO EXITOSAMENTE.");
		System.out.println("=======================================");
	}
	/*
	 * PIDE Y VERIFICA QUE EL DATO INGRESADO SEA UN NUMERO REAL
	 */
	public static float pedirPrecio() {
		boolean correcto = false;
		float num = 0;
		do {
			System.out.println("Ingrese precio del destino: ");
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
	 * DEVUELVE UN OBJETO PAIS DE ACUERDO AL CODIGO INGRESADO POR EL USUARIO.
	 */
	public static Pais pedirPais() {
		Pais paisEncontrado=null;
		do {
			mostrarPaises();
			System.out.println("Ingrese codigo del pais: ");
			String codigo = sc.next();
			for(Pais pais : paises ) {
				if(pais.getCodigo().equals(codigo)) {
					paisEncontrado = pais;
				}
			}
			if (paisEncontrado == null) {
				System.out.println("EL CODIGO DE PAIS NO EXISTE!");
			}
		}while(paisEncontrado == null);
		return paisEncontrado;
	}
	/*
	 * CONTROLA QUE EL DATO INGRESADO SEA UN NUMERO ENTERO
	 */
	public static int pedirCantDias() {
		boolean correcto = false;
		int num = 0;
		do {
			System.out.println("Ingrese la cantidad de dias: ");
			try {
				num = sc.nextInt();
				if (num < 0) {
					System.out.println("INGRESE UN NUMERO MAYOR A '0'");
				}else {
					correcto = true;
				}
				
				} catch (InputMismatchException ex) {
				System.out.println("POR FAVOR INGRESE UN NUMERO ENTERO!! ");
				sc.next();
				}
		}while(correcto == false);	
		return num;
	}
	/*
	 * MUESTRA LOS OBJETOS DEL ARRAYLIS DESTINOS TURISTICOS
	 */
	public static void mostrarDestinos() {
		if(destinosTuristicos == null) {
			System.out.println("===================================");
			System.out.println("LISTA DE DESTINOS TURISTICOS VACIA.");
			System.out.println("===================================");
		}else {
			System.out.println("===========LISTA DE DESTINOS TURISTICOS===========");
			destinosTuristicos.forEach(d->System.out.println(d));
		}	
	}
	/*
	 * BUSCA Y RETORNA UN OBJETO DE LA ARRAYLIST DE DETINOS TURISTICOS 
	 * MEDIANTE SU CODIGO DE DESTNO.
	 */
	public static DestinoTuristico buscarDestino() {
		System.out.println("Ingrese codigo del destino turistico: ");
		String codigo = sc.next();
		DestinoTuristico destinoEncontrado=null;
		for(DestinoTuristico destinoTuristico : destinosTuristicos ) {
			if(destinoTuristico.getCodigo().equals(codigo) ) {
				destinoEncontrado = destinoTuristico;
			}
		}
		return destinoEncontrado;
	}
	/*
	 * MODIFICA EL PAIS DE UN DESTINO TURISTICO
	 * POR CODIGO DE DESTINO INGRESADO POR EL USUARIO
	 */
	public static void modificarPais() {
		if(destinosTuristicos == null) {
			System.out.println("===================================");
			System.out.println("LISTA DE DESTINOS TURISTICOS VACIA.");
			System.out.println("===================================");
		}else {
			DestinoTuristico destinoEncontrado = buscarDestino();
			if (destinoEncontrado == null) {
				System.out.println("========================================");
				System.out.println("EL CODIGO DE DESTINO TURISTICO NO EXISTE.");
				System.out.println("========================================");
			}else {
				Pais pais = pedirPais();
				destinoEncontrado.setPais(pais);
				System.out.println("=================================");
				System.out.println("EL PAIS SE MODIFICO EXITOSAMENTE.");
				System.out.println("=================================");
			}
		}
	}
	/*
	 * ELIMINA UN OBJETO DEL ARRALIST DESTINOS TURISTICOS 
	 * PIDIENTO AL USUARIO EL CODIGO DEL DESTINO.
	 */
	public static void eliminarDestino() {
		if (destinosTuristicos == null) {
			System.out.println("===================================");
			System.out.println("LISTA DE DESTINOS TURISTICOS VACIA.");
			System.out.println("===================================");
		}else {
			DestinoTuristico destinoEncontrado = buscarDestino();
			if(destinoEncontrado == null) {
				System.out.println("========================================");
				System.out.println("EL CODIGO DE DESTINO TURISTICO NO EXISTE.");
				System.out.println("========================================");
			}else {
				Iterator<DestinoTuristico> iterator = destinosTuristicos.iterator();
				while(iterator.hasNext()) {
					DestinoTuristico destinoTuristico = iterator.next();
					if(destinoTuristico.getCodigo().equals(destinoEncontrado.getCodigo())) {
						iterator.remove();
						System.out.println("==========================================");
						System.out.println("DESTINO TURISTICO ELIMINADO CORRECTAMENTE.");
						System.out.println("==========================================");
					}	
				}
			}
		}
	}
	
	/*
	 * MUESTRA LOS OBJETOS DEL ARRAYLIST PAISES
	 */
	public static void mostrarPaises() {
		System.out.println("===========LISTA DE PAISES===========");
		paises.forEach(p->System.out.println(p));
		System.out.println("=====================================");
	}
	/*
	 * MUESTRA LOS OBJETOS DE ARRAYLIST DESTINOS TURISTICOS
	 * OREDENADOS POR SU NOMBRE
	 */
	public static void mostrarDestinosOrdenados() {
		if(destinosTuristicos == null) {
			System.out.println("===================================");
			System.out.println("LISTA DE DESTINOS TURISTICOS VACIA.");
			System.out.println("===================================");
		}else {
			System.out.println("===========LISTA DE DESTINOS TURISTICOS===========");
			destinosTuristicos.sort(Comparator.comparing(DestinoTuristico::getNombre));
			destinosTuristicos.forEach(d->System.out.println(d));
		}
		
	}
	/*
	 * MUESTRA LOS DESTNOS TURISTICOS POR CODIGO DE PAIS 
	 * INGRESADO POR EL USUARIO
	 */
	public static void mostrarDestinosEspecificos() {
		if(destinosTuristicos == null) {
			System.out.println("===================================");
			System.out.println("LISTA DE DESTINOS TURISTICOS VACIA.");
			System.out.println("===================================");
		}else {
			mostrarPaises();
			System.out.println("Ingrese el codigo de un pais: ");
			String codigo = sc.next();
			for(DestinoTuristico destinoTuristico : destinosTuristicos ) {
				if(destinoTuristico.getPais().getCodigo().equals(codigo)) {
					System.out.println(destinoTuristico);
				}
			}
		}
	}
	/*
	 * LIMPIA EL ARRRAYLIST DE DESTINOS TURISTICOS
	 */
	public static void limpiarArraylist() {
		if(destinosTuristicos == null) {
			System.out.println("===================================");
			System.out.println("LISTA DE DESTINOS TURISTICOS VACIA.");
			System.out.println("===================================");
		}else {
			destinosTuristicos.clear();
			System.out.println("================================");
			System.out.println("LIMPIEZA REALIZADA CORRECTAMENTE.");
			System.out.println("================================");	
		}
	}
	

}
