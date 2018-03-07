package Exercicio01;

public class Amigo extends Pessoa{
	private String diaDoAniversario;

	public Amigo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Amigo(String nome, char sexo, int idade) {
		super(nome, sexo, idade);
		// TODO Auto-generated constructor stub
	}

	public Amigo(String diaDoAniversario) {
		super();
		this.diaDoAniversario = diaDoAniversario;
	}
	
}
