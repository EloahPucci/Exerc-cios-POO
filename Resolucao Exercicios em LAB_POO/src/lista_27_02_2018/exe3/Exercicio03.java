package lista_27_02_2018.exe3;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new Conta();
		
		c.setTitular("Batman");
		c.setNumero(230988);
		c.setSaldo(150000.00);
		
		System.out.printf("Titular: %s\nNúmero da conta: %d\nSaldo atual: R$%.2f", c.getTitular(), c.getNumero(), c.getSaldo());
	}

}
