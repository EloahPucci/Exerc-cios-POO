package Exercicio07;

public class Circulo implements FormaGeometrica{
	private double raio;	
	
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * 3.1416 * raio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 3.1416 * Math.pow(raio, 2);
	}
	
}
