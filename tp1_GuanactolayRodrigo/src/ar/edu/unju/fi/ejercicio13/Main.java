package ar.edu.unju.fi.ejercicio13;
/*
 * ARRAY DE 8 ELEMENTOS
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] enteros = new int[8];
		
		int k=0;
		while(k<enteros.length) {
			System.out.println("Ingrese un valor entero: ");
			int valor = sc.nextInt();
			enteros[k]= valor;
			k++;
		}
		System.out.println("****ARRAY DE 8 ELEMENTOS****");
		for (int i = 0; i<enteros.length;i++) {
			System.out.println("Indice ["+i+"]: = "+enteros[i]);
		}
		sc.close();
		

	}

}
