import java.util.ArrayList;
import java.util.List;

public class Leilao {
	private String bem;
	private double valorInicial;
	private boolean status;
	private Lance lance;
	private Lance lanceVencedor;
	List<Lance> listaLances = new ArrayList<Lance>();

	public void registrarLance() {
		int i = listaLances.size();

		if (status == true) {
			if (i == 0) {
				if (lance.getValorDoLance() > valorInicial) {
					listaLances.add(lance);
					lanceVencedor = lance;
				} else {
					System.out.println("Lance Rejeitado! Valor menor que o lance mínimo.");
				}
			} else {
				if (lance.getValorDoLance() > lanceVencedor.getValorDoLance()) {
					listaLances.add(lance);
					lanceVencedor.setNome(lance.getNome());
					lanceVencedor.setValorDoLance(lance.getValorDoLance());
				} else {
					System.out.println("Lance Rejeitado! Valor menor que o lance vencedor atual.");
				}
			}
		} else {
			System.out.println("Este leilão já foi finalizado!");
		}

	}

	public void finalizar() {
		status = false;
		
		System.out.println("Bem: " + bem);
		System.out.println("Nome do vencedor: " + lanceVencedor.getNome());
		System.out.printf("Arrematado por: %.2f", lanceVencedor.getValorDoLance());
	}

	public Leilao(String bem, double valorInicial) {
		super();
		this.bem = bem;
		this.valorInicial = valorInicial;
	}
	
	

	public Lance getLance() {
		return lance;
	}

	public void setLance(Lance lance) {
		this.lance = lance;
	}

	public Lance getLanceVencedor() {
		return lanceVencedor;
	}

	public void setLanceVencedor(Lance lanceVencedor) {
		this.lanceVencedor = lanceVencedor;
	}

	public List<Lance> getListaLances() {
		return listaLances;
	}

	public void setListaLances(List<Lance> listaLances) {
		this.listaLances = listaLances;
	}

	public String getBem() {
		return bem;
	}

	public void setBem(String bem) {
		this.bem = bem;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
