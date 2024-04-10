package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Ingrese un valor entre 1 y 9: ");
			num = sc.nextInt();
			
		}while(num >9 || num <1);
		sc.close();
		System.out.println("Numero ingresado: "+num);
		for (int i=0;i<10;i++) {
			System.out.println(num+" x " + i +" = "+ num*i);
		}
	}

}
