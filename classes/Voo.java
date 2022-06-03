package classes;

public class Voo {
	
	private String numero;
	private String diaDaSemana;
	private String horaSaida;
	private String horaChegada;
	
	private Aeroporto aeroportoOrigem;
	private Aeroporto aeroportoDestino;
	private Aviao aviao;
	
	
	public Voo() {
		
	}

	public Voo(String numero, Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino,
			String diaDaSemana, String horaSaida, String horaChegada, Aviao aviao) {
		this.numero = numero;
		this.aeroportoOrigem = aeroportoOrigem;
		this.aeroportoDestino = aeroportoDestino;
		this.diaDaSemana = diaDaSemana;
		this.horaSaida = horaSaida;
		this.horaChegada = horaChegada;
		this.aviao = aviao;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Aeroporto getAeroportoOrigem() {
		return aeroportoOrigem;
	}

	public void setAeroportoOrigem(Aeroporto aeroportoOrigem) {
		this.aeroportoOrigem = aeroportoOrigem;
	}

	public Aeroporto getAeroportoDestino() {
		return aeroportoDestino;
	}

	public void setAeroportoDestino(Aeroporto aeroportoDestino) {
		this.aeroportoDestino = aeroportoDestino;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}
	
	public Aviao getAviao() {
		return aviao;
	}
	
	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	

}
