package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private int precio;
	private double area;
	private boolean ingredientesEspeciales;
	private final int ingredientesEspeciales2 = 500;
	private final int ingredientesEspeciales3 = 750;
	private final int ingredientesEspeciales4 = 1000;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}


	public void calcularPrecio(Pizza pizza) {
		
		if (pizza.diametro == 20 && !pizza.ingredientesEspeciales) {
			pizza.precio = 4500;
		}else
		{	if(pizza.diametro == 20 && pizza.ingredientesEspeciales) {
				pizza.precio= 4500+pizza.ingredientesEspeciales2;
			}else
			{	if(pizza.diametro == 30 && !pizza.ingredientesEspeciales) {
					pizza.precio = 4800;
				}else
				{	if(pizza.diametro == 30 && pizza.ingredientesEspeciales) {
						pizza.precio = 4800+pizza.ingredientesEspeciales3;	
					}else
					{	if(pizza.diametro == 40 && !pizza.ingredientesEspeciales) {
							pizza.precio = 5500;
						}else
						{	if(pizza.diametro == 40 && pizza.ingredientesEspeciales) {
								pizza.precio = 5500+pizza.ingredientesEspeciales4;
							}
						}
					}
				}
			}
		}
		 
	}
	
	public void calcularArea(Pizza pizza) {
		pizza.area= Math.PI * (Math.pow((pizza.diametro/2),2));
	}
	
	public void mostrarDatos(Pizza pizza) {
		System.out.println("Diametro: "+pizza.diametro);
		System.out.println("Ingredientes especiales: "+pizza.ingredientesEspeciales);
		System.out.println("Precio pizza: $"+pizza.precio);
		System.out.println("Area de la pizza: "+pizza.area);
		System.out.println("");
	}
}
