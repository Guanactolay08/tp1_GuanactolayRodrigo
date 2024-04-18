package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanio = 0;
		do {
			System.out.println("Ingrese tamaño del arreglo (entre 5 y 10): ");
			tamanio= sc.nextInt();
		}while(tamanio < 5 || tamanio >10);
		String[] nombres = new String[tamanio];
		sc.nextLine();
		for(int i=0;i<tamanio;i++) {
			
			System.out.println("Ingrese un nombre de persona para almacenar en el arreglo: ");
			String valor = sc.nextLine();
			nombres[i]=valor;
		}
		System.out.println("***ARRAY DE "+tamanio+" ELEMENTOS****");
		System.out.println("ORDEN NORMAL:");
		for(int i=0; i<tamanio; i++) {
			System.out.println("Indice ["+i+"]: "+nombres[i]);
		}
		System.out.println("ORDEN INVERTIDO:");
		for(int i=tamanio-1; i>=0; i--) {
			System.out.println("Indice ["+i+"]: "+nombres[i]);
		}
		
		sc.close();
	}

}
