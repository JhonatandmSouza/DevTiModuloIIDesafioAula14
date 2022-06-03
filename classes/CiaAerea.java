package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CiaAerea {
	
	private String sigla;
	private String nome;
	
	private List<Aviao> avioes = new ArrayList<>();
	
	public CiaAerea() {
		
	}

	public CiaAerea(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aviao> getAvioes() {
		return avioes;
	}
	
	public void addAviao(Aviao aviao) {
		this.avioes.add(aviao);
	}
	
	public void removeAviao(Aviao aviao) {
		this.avioes.remove(aviao);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, sigla);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CiaAerea other = (CiaAerea) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(sigla, other.sigla);
	}
	
	

}
