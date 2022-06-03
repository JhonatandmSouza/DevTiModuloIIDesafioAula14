package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aviao {
	
	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private String numeroIdentificacao;
	
	private List<Assento> assentos = new ArrayList<>();

	public Aviao(String marca, String modelo, Integer anoFabricacao) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		
		this.numeroIdentificacao = Integer.toString((int)(Math.random()*10000));
		
		for(int i = 0; i < 10; i++) {
			Assento assento = new Assento(this.numeroIdentificacao + "-" + (i+1));
			addAssento(assento);
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(String numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public List<Assento> getAssentos() {
		return assentos;
	}
	
	public void addAssento(Assento assento) {
		this.assentos.add(assento);
	}
	
	public void removeAssento(Assento assento) {
		this.assentos.remove(assento);
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoFabricacao, marca, modelo, numeroIdentificacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aviao other = (Aviao) obj;
		return Objects.equals(anoFabricacao, other.anoFabricacao) && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo)
				&& Objects.equals(numeroIdentificacao, other.numeroIdentificacao);
	}
	
	

}
