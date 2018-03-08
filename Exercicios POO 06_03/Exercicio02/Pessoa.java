package Exercicio02;

public class Pessoa {
	private String nome;
	private String sobrenome;	
	
	public Pessoa(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}
}
