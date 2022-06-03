package classes;

import java.util.Date;
import java.util.Objects;

public class Atendente {
	
	private String nome;
	private String cpf;
	private String rg;
	private Date dataNascimento;
	private String matricula;
	private String numeroCarteiraTrabalho;
	
	private Endereco endereco;
	
	public Atendente() {
		
	}

	public Atendente(String nome, String cpf, String rg, Date dataNascimento, Endereco endereco, String matricula,
			String numeroCarteiraTrabalho) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.matricula = matricula;
		this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNumeroCarteiraTrabalho() {
		return numeroCarteiraTrabalho;
	}

	public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
		this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, dataNascimento, matricula, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atendente other = (Atendente) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(matricula, other.matricula) && Objects.equals(nome, other.nome);
	}
	
	
	
	

}
