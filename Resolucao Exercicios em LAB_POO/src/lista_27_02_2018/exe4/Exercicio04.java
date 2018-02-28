package lista_27_02_2018.exe4;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c1 = new Conta();
		Conta c2 = new Conta("Roberto");
		
		//Quando o construtor com argumentos é criado ele
		//força a criação do objeto usando estes argumentos e
		//ignora o contrutor padrão, quando crio outro
		//construtor sem argumentos ele me dá a opção de
		//criar o objeto das duas formas, com ou sem argumentos.
		
		System.out.println("Titular conta 01: " + c1.getTitular());
		System.out.println("Titular conta 02: " + c2.getTitular());

	}

}
