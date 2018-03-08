package Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Conta c = new Conta();
		Poupanca cp = new Poupanca();
		
		c.depositar(10000.00);
		c.sacar(15000.00);
		cp.depositar(15000.00);
		cp.sacar(20000.00);
		
		System.out.println("Saldo Conta: R$" + c.getSaldo());
		System.out.printf("Saldo Poupança: R$ %.2f", cp.getSaldo());

	}
}
