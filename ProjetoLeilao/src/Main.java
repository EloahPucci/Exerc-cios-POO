import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		Leilao leilao = new Leilao("Espelho raro", 1200.00);
		leilao.setStatus(true);
		
		Lance l1 = new Lance("Eloah", 1300.00);
		Lance l2 = new Lance("Maria", 1200.00);
		leilao.setLance(l1);
		leilao.setLance(l2);
		
		leilao.registrarLance();
		leilao.finalizar();
		
		

	}

}
