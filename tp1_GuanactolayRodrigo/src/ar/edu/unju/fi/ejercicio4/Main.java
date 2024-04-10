package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num, factorial;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Ingrese un valor entre 0 y 10: ");
			num = sc.nextInt();
			
		}while(num >10 || num <0);
		sc.close();
		if(num==0) {
			factorial=1;
		}else
		{
			factorial=num;
		}
		while(num>2) {
			factorial = factorial*(num-1);
			num--;
		}
		System.out.println("Su factorial es: " + factorial);
	}

}
