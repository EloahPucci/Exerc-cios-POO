package Exercicio03;

public class Poupanca extends Conta {
	private int diaRendimento;
	private double saldo;

	public Poupanca(double saldo, int diaRendimento) {
		super(saldo);
		this.saldo = saldo;
		this.diaRendimento = diaRendimento;
	}

	public Poupanca() {
	}

	public void setSaldo(double valor) {
		if (valor > 0) {
			saldo = valor;
		}
	}

	@Override
	public void sacar(double valor) {
		if (saldo - valor > 0) {
			saldo -= valor;
		}
	}

}
