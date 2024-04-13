package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public CalculadoraEspecial() {
		
	}
	
	public long calcularSumatoria (int n) {
		double sumatoria=0;
		for(int k=1;k<=n;k++) {
			sumatoria = sumatoria + Math.pow((k*(k+1)/2), 2);
		}
		long sumatorialong = (long)sumatoria;
		return sumatorialong;
	}
	
	public long calcularProductoria(int n) {
		long productoria=1;
		for(int k=1; k<=n; k++) {
			productoria = productoria * (k*(k+4));
		}
		return productoria;
	}
}
