package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanio = 0, suma=0;
		do {
			System.out.println("Ingrese tamaño del arreglo (entre 3 y 10): ");
			tamanio= sc.nextInt();
		}while(tamanio < 3 || tamanio >10);
		int[] enteros = new int[tamanio];
		
		for(int i=0;i<tamanio;i++) {
			System.out.println("Ingrese un numero entero para almacenar en el arreglo: ");
			int valor= sc.nextInt();
			enteros[i]=valor;
		}
		System.out.println("***ARRAY DE "+tamanio+" ELEMENTOS****");
		for(int i=0; i<tamanio;i++) {
			System.out.println("Indice ["+i+"]: "+enteros[i]);
			suma=suma+enteros[i];
		}
		System.out.println("La suma de sus elementos es: "+suma);
		sc.close();
	}

}
