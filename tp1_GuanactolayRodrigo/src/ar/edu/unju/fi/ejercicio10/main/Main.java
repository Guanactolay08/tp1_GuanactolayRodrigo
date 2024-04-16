package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		int cantidadPizza=1,diametro=0;
		String ingredientesEspecialesString="";
		boolean ingredientesEspeciales;
		Pizza pizza = new Pizza();
		Scanner sc = new Scanner(System.in);
		while(cantidadPizza<=3) {
			do {
				System.out.println("Ingrese el diametro de la pizza " +cantidadPizza+ " (20/30/40): ");
				diametro=sc.nextInt();
			}while(diametro != 20 && diametro !=30 && diametro !=40);
			do {
				System.out.println("Tiene ingredientes especiales? (Ingrese true o false) : ");
				ingredientesEspecialesString = sc.next();
				ingredientesEspeciales = Boolean.parseBoolean(ingredientesEspecialesString);
			}while(!ingredientesEspecialesString.equals("true") && !ingredientesEspecialesString.equals("false"));
			
			pizza.setDiametro(diametro);
			pizza.setIngredientesEspeciales(ingredientesEspeciales);
			pizza.calcularPrecio();
			pizza.calcularArea();
			System.out.println("*** PIZZA "+cantidadPizza+" ***");
			pizza.mostrarDatos();
			cantidadPizza++;
		}
		sc.close();
	}

}
