package Exercicio02;

public class Funcionario extends Pessoa {
	private int matricula;
	private double salario;

	public Funcionario(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome);
		this.matricula = matricula;
		this.salario = salario;
	}

	public void setSalario(double salario) {
		if (salario > 0.0) {
			this.salario = salario;
		}
	}

	public double getSalarioPrimeiraParcela() {
		return salario * 0.6;
	}
	
	public double getSalarioSegundaParcela() {
		return salario * 0.4;
	}
}
