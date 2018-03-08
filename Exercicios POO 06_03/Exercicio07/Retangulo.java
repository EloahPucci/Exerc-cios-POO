package Exercicio07;

public class Retangulo implements FormaGeometrica{	
	private double base;
	private double altura;	

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * base + 2 * altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}
	
}
