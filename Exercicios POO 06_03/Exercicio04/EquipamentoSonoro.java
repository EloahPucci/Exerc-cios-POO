package Exercicio04;

public class EquipamentoSonoro extends Equipamento{
	private int volume;
	private boolean stereo;
	
	public void mono() {
		this.stereo = false;
	}
	
	public void stereo() {
		this.stereo = true;
	}

	@Override
	public void liga() {
		super.liga();
		this.volume = 5;
	}
	
	
}
