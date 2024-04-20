package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] nombres = new String[5];
		Scanner sc = new Scanner(System.in);
		int j=0;
		byte num=0;
		for(int i=0;i<nombres.length;i++) {
			
			System.out.println("Ingrese un nombre de persona para almacenar en el arreglo: ");
			String valor = sc.nextLine();
			nombres[i]=valor;
		}
		System.out.println("");
		while(j<nombres.length) {
			System.out.println("Indice ["+j+"]: "+nombres[j]);
			j++;
		}
		
		System.out.println("TAMAÑO DEL ARRAY: "+nombres.length);
		do {
			System.out.println("Ingrese el indice del elemento que desea borrar (0..4): ");
			num = sc.nextByte();
		}while (num < 0 || num > 4);
		
		if(num == nombres.length-1) {
			nombres[num]="";
		}else
		{
			for(int i=num;i<nombres.length-1;i++) {
				nombres[i]=nombres[i+1];
			}
			nombres[nombres.length-1]="";
		}
		
		for (int i=0; i<nombres.length;i++) {
			System.out.println("Indice ["+i+"]: "+nombres[i]);
		}
		
		sc.close();

	}

}
