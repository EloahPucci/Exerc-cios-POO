package lista_27_02_2018.exe4;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c1 = new Conta();
		Conta c2 = new Conta("Roberto");
		
		//Quando o construtor com argumentos � criado ele
		//for�a a cria��o do objeto usando estes argumentos e
		//ignora o contrutor padr�o, quando crio outro
		//construtor sem argumentos ele me d� a op��o de
		//criar o objeto das duas formas, com ou sem argumentos.
		
		System.out.println("Titular conta 01: " + c1.getTitular());
		System.out.println("Titular conta 02: " + c2.getTitular());

	}

}
