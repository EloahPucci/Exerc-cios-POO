package Exercicio06;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		List<CartaoWeb> listaMensagens = new ArrayList<CartaoWeb>();
		listaMensagens.add(new DiaDosNamorados("Fulano"));
		listaMensagens.add(new Natal("Ciclano"));
		listaMensagens.add(new Aniversario("Beltrano"));
		
		for(CartaoWeb aux: listaMensagens) {
			aux.showMessage();
		}

	}

}
