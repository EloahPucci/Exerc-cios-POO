package Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Pessoa pessoa1 = new Pessoa("João", "Medeiros");
		Funcionario pessoa2 = new Funcionario("Leonardo", "Messias", 100, 1000.00);
		Professor pessoa3 = new Professor("Antônio", "Silva", 200, 1500.00);

		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
		System.out.printf("Primeira parcela: R$%.2f Segunda parcela: R$%.2f\n", pessoa2.getSalarioPrimeiraParcela(), pessoa2.getSalarioSegundaParcela());
		System.out.println(pessoa3.getNomeCompleto());
		System.out.printf("Primeira parcela: R$%.2f Segunda parcela: R$%.2f", pessoa3.getSalarioPrimeiraParcela(), pessoa3.getSalarioSegundaParcela());
	}

}
