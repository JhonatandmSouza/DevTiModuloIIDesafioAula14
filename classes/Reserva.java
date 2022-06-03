package classes;

import javax.swing.JOptionPane;

public class Reserva {
	
	private Voo voo;
	private Assento assento;
	private Atendente atendente;
	
	public Reserva() {
		
	}

	public Reserva(Voo voo, Atendente atendente) {
		this.voo = voo;
		this.atendente = atendente;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}
	
	public void escolherAssento(int num) {
		Assento assentoEscolhido = voo.getAviao().getAssentos().get(num);
		
		while(assentoEscolhido.getReservado()) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Assento já reservado. Escolha novo assento."));
			assentoEscolhido = voo.getAviao().getAssentos().get(num);
		}
		
		voo.getAviao().getAssentos().get(num).setReservado(true);
	}

	@Override
	public String toString() {
		return "Reserva [voo=" + voo + ", assento=" + assento + ", atendente=" + atendente + "]";
	}
	
	
	
	


}
