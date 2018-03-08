package Exercicio02;

public class Professor extends Funcionario{
	private double salario;

	public Professor(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome, matricula, salario);
		this.salario = salario;
		// TODO Auto-generated constructor stub
	}

	public double getSalarioPrimeiraParcela() {
		return salario;
	}
	
	public double getSalarioSegundaParcela() {
		return 0;
	}
}
