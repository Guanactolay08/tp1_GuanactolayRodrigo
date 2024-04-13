package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero entero: ");
		int n = sc.nextInt();
		calculadora.setN(n);
		long sumatoria= calculadora.calcularSumatoria(n);
		long productoria=calculadora.calcularProductoria(n);
		System.out.println("Sumatoria especial: "+sumatoria);
		System.out.println("Productoria especial: "+productoria);
		sc.close();
	}

}
