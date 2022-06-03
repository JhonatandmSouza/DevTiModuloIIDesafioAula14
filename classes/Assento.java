package classes;

public class Assento {
	
	private String numeroAssento;
	private Boolean reservado = false;
	
	public Assento() {
		
	}
	
	public Assento(String numeroAssento) {
		this.numeroAssento = numeroAssento;
	}

	public String getNumeroAssento() {
		return numeroAssento;
	}

	public void setNumeroAssento(String numeroAssento) {
		this.numeroAssento = numeroAssento;
	}

	public Boolean getReservado() {
		return reservado;
	}

	public void setReservado(Boolean reservado) {
		this.reservado = reservado;
	}
	
	

}
