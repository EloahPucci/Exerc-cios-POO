package Exercicio06;

public class Natal extends CartaoWeb{
	private String destinatario;
	
	public Natal(String destinatario) {
		super(destinatario);
		this.destinatario = destinatario;
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz Natal " + destinatario + "!");		
	}	
}
