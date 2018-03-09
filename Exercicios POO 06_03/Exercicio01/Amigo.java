package Exercicio01;

public class Amigo extends Pessoa {
	private String diaDoAniversaio;

	public Amigo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Amigo(String nome, char sexo, int idade) {
		super(nome, sexo, idade);
		// TODO Auto-generated constructor stub
	}

	public Amigo(String diaDoAniversaio) {
		super();
		this.diaDoAniversaio = diaDoAniversaio;
	}	
	
}
