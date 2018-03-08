package Exercicio03;

public class Conta {
	private double saldo;	
	
	public double getSaldo() {
		return saldo;
	}

	public Conta() {
	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	void depositar(double valor) {
		this.saldo += valor;
	}
	
	void sacar (double valor) {
		this.saldo = saldo - valor;
	}
}
