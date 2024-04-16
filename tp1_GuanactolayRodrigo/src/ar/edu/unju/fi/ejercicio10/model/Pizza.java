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


	public void calcularPrecio() {
		
		if (this.diametro == 20 && !this.ingredientesEspeciales) {
			this.precio = 4500;
		}else
		{	if(this.diametro == 20 && this.ingredientesEspeciales) {
				this.precio= 4500+this.ingredientesEspeciales2;
			}else
			{	if(this.diametro == 30 && !this.ingredientesEspeciales) {
					this.precio = 4800;
				}else
				{	if(this.diametro == 30 && this.ingredientesEspeciales) {
						this.precio = 4800+this.ingredientesEspeciales3;	
					}else
					{	if(this.diametro == 40 && !this.ingredientesEspeciales) {
							this.precio = 5500;
						}else
						{	if(this.diametro == 40 && this.ingredientesEspeciales) {
								this.precio = 5500+this.ingredientesEspeciales4;
							}
						}
					}
				}
			}
		}
		 
	}
	
	public void calcularArea() {
		this.area= Math.PI * (Math.pow((this.diametro/2),2));
	}
	
	public void mostrarDatos() {
		System.out.println("Diametro: "+this.diametro);
		System.out.println("Ingredientes especiales: "+this.ingredientesEspeciales);
		System.out.println("Precio pizza: $"+this.precio);
		System.out.println("Area de la pizza: "+this.area);
		System.out.println("");
	}
}
