package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Es un numero par, se multiplica por 3: "+num*3);
		}else
		{
			System.out.println("Es un numero impar, se multiplica por 2: "+num*2);
		}
		sc.close();
	}

}
