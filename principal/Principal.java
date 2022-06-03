package principal;



import java.text.ParseException;
import java.text.SimpleDateFormat;

import classes.Aeroporto;
import classes.Atendente;
import classes.Aviao;
import classes.CiaAerea;
import classes.Cliente;
import classes.Endereco;
import classes.Reserva;
import classes.Voo;


public class Principal {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Endereco enderecoAtendente = new Endereco("Rua atendente", "200", "bairro atentende", "Tubarao", "SC", "88701-000");
		Endereco enderecoCliente = new Endereco("Rua Cliente", "100", "bairro cliente", "criciuma", "SC", "88800-000");
		
		Atendente atendente = new Atendente("Paulo", "123.123.123-5", "123456", sdf.parse("18/05/1985"), enderecoAtendente, "matricula", "carteira de trabalho");
		Cliente cliente = new Cliente("João", "111.222.333-55", "9999999", sdf.parse("09/01/1990"), enderecoCliente, "cartão de crédito");
		
		CiaAerea ciaAerea = new CiaAerea("DT", "DevTur");
		Aviao aviao = new Aviao("Boing", "747", 2000);
		ciaAerea.addAviao(aviao);
		
		Aeroporto aeroportoOrigem = new Aeroporto("Aeroporto Internacional de Florianópolis", "Florianópolis", "SC", "(048)3333-3333");
		Aeroporto aeroportoDestino = new Aeroporto("Aeroporto Internacional de Guarulhos", "Guarulhos", "SP", "(011)5555-5555");
		
		Voo voo = new Voo("1234", aeroportoOrigem, aeroportoDestino, "segunda-feira", "08:00", "09:00", aviao);
		
		Reserva reserva1 = new Reserva(voo, atendente);
		reserva1.escolherAssento(2);
		
		Reserva reserva2 = new Reserva(voo, atendente);
		reserva2.escolherAssento(5);
		
		cliente.addReserva(reserva1);
		cliente.addReserva(reserva2);
		
		System.out.println(cliente);
		

	}

}

