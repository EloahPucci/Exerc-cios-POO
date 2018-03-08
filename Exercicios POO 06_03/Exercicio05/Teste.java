package Exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double valorFolha;
		
		List<Funcionario> listaFunc = new ArrayList<Funcionario>();
		listaFunc.add(new Gerente("Eloah", "09876", 5000.00));
		listaFunc.add(new Assistente("Jose", "45901", 3000.00));
		listaFunc.add(new Vendedor("Fulano", "23100", 2000.00, 500.00));
		
		for(Funcionario aux: listaFunc) {
			System.out.printf("Nome: %s Matrícula: %s Salário: R$%.2f\n", aux.getNome(), aux.getMatricula(), aux.calculaSalario());
		}
	}
}
