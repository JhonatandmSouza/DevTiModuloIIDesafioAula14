package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String rg;
	private Date dataNascimento;
	private String numeroCartaoCredito;
	
	private Endereco endereco;
	
	private List<Reserva> reservas = new ArrayList<>();
	
	public Cliente() {
		
	}

	public Cliente(String nome, String cpf, String rg, Date dataNascimento, Endereco endereco,
			String numeroCartaoCredito) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.numeroCartaoCredito = numeroCartaoCredito;
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

	public String getNumeroCartaoCredito() {
		return numeroCartaoCredito;
	}

	public void setNumeroCartaoCredito(String numeroCartaoCredito) {
		this.numeroCartaoCredito = numeroCartaoCredito;
	}

	public List<Reserva> getReserva() {
		return reservas;
	}
	
	public void addReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void removeReserva(Reserva reserva) {
		this.reservas.remove(reserva);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, dataNascimento, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(dataNascimento, other.dataNascimento)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		for (Reserva reserva : reservas) {
			if (reserva != null) {
				return "Cliente [nome=" + nome + ", reservas=" + reserva;
			}
		}
		return "sem reserva.";
				
	}
	
	
	
	
	
	
}
