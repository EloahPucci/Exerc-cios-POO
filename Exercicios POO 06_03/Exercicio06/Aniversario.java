package Exercicio06;

public class Aniversario extends CartaoWeb{
	private String destinatario;
	
	public Aniversario(String destinatario) {
		super(destinatario);
		this.destinatario = destinatario;
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz aniversário " + destinatario + "!");		
	}	
}
