package Exercicio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		List<FormaGeometrica> listaFormas = new ArrayList<FormaGeometrica>();
		listaFormas.add(new Retangulo(3, 4));
		listaFormas.add(new Circulo(5));
		
		for(FormaGeometrica aux: listaFormas) {
			System.out.printf("Área: %.2f Perímetro: %.2f\n", aux.calcularArea(), aux.calcularPerimetro());
		}

	}

}
