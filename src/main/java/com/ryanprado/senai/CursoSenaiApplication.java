package com.ryanprado.senai;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ryanprado.senai.domain.Cidade;
import com.ryanprado.senai.domain.Cliente;
import com.ryanprado.senai.domain.Endereco;
import com.ryanprado.senai.domain.Estado;
import com.ryanprado.senai.domain.enums.TipoCliente;
import com.ryanprado.senai.repositories.CidadeRepository;
import com.ryanprado.senai.repositories.ClienteRepository;
import com.ryanprado.senai.repositories.EnderecoRepository;
import com.ryanprado.senai.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner {

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private ClienteRepository clienteRespository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "Sao Paulo");

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		
		Cidade c1 = new Cidade(null, "Uberlãndia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		cidadeRepository.saveAll(Arrays.asList(c1, c2));

		Cliente cli1 = new Cliente(null, "Danilo Araújo", "12345678901", "danilo@gmail.com", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("34900000000", "98765432112"));

		Cliente cli2 = new Cliente(null, "Felipe", "09876543211", "felipe@gmail.com", TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("34998765429", "98765432113"));

		Cliente cli3 = new Cliente(null, "Karina", "12345678904", "kaka@hotmail.com", TipoCliente.PESSOAFISICA);
		cli3.getTelefones().addAll(Arrays.asList("34984567555", "98765442112"));

		Cliente cli4 = new Cliente(null, "Fabio", "12432456123", "fabio@outlook0.com", TipoCliente.PESSOAFISICA);
		cli4.getTelefones().addAll(Arrays.asList("34999876543", "98775432112"));

		Cliente cli5 = new Cliente(null, "Lenin", "12345677901", "lenis@gmail.com.br", TipoCliente.PESSOAFISICA);
		cli5.getTelefones().addAll(Arrays.asList("34990706500", "98465432112"));

		Cliente cli6 = new Cliente(null, "Sabrina", "12345678981", "brina@gmail.com", TipoCliente.PESSOAFISICA);
		cli6.getTelefones().addAll(Arrays.asList("34990550088", "98765432612"));

		Cliente cli7 = new Cliente(null, "Danilo Araújo Martins", "14797928612", "danilo.martins.ara@gmail.com",
				TipoCliente.PESSOAFISICA);
		cli7.getTelefones().addAll(Arrays.asList("34984354866	", "98421209121"));

		Cliente cli8 = new Cliente(null, "Andressa", "54345668901", "andressa@outlook.com", TipoCliente.PESSOAFISICA);
		cli8.getTelefones().addAll(Arrays.asList("34998564632", "987654332"));

		Cliente cli9 = new Cliente(null, "Joao Lucas", "12345558431", "joao@gmail.com", TipoCliente.PESSOAFISICA);
		cli9.getTelefones().addAll(Arrays.asList("34984567783", "98765448812"));

		Cliente cli10 = new Cliente(null, "Igor", "14567832511", "igoro@gmail.com", TipoCliente.PESSOAFISICA);
		cli10.getTelefones().addAll(Arrays.asList("34984567433", "98765432777"));
		clienteRespository.saveAll(Arrays.asList(cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10));

		

		Endereco e1 = new Endereco(null, "Rua das  Freiras", "55b", "Ap 310", "Jardim", "38447587", cli1, c1);
		Endereco e2 = new Endereco(null, "Rua dos Tucanos", "1077", null, "Centro", "35697888", cli2, c2);
		Endereco e3 = new Endereco(null, "Rua dos Canarinho", "257", null, "Aparecida", "65657898", cli3, c1);
		Endereco e4 = new Endereco(null, "Rua das Andorinhas", "108", null, "Magalhaes", "10000009", cli4, c1);
		Endereco e5 = new Endereco(null, "Rua das Orquideas", "752", null, "Betim", "88888889", cli5, c1);
		Endereco e6 = new Endereco(null, "Rua da Palestra", "52", null, "Gameleira", "77777779", cli6, c1);
		Endereco e7 = new Endereco(null, "Rua do Algodao", "902", null, "Alvorada", "66666669", cli7, c2);
		Endereco e8 = new Endereco(null, "Rua das Silveiras", "332", null, "Ypiranga", "55555559", cli8, c1);
		Endereco e9 = new Endereco(null, "Rua Coronel Antonio", "25", null, "Afonso Silva", "44444449", cli9, c1);
		Endereco e10 = new Endereco(null, "Rua Amelia", "665", null, "Afonso Silva", "44444449", cli10, c1);

		cli1.getEnderecos().addAll(Arrays.asList(e1));
		cli2.getEnderecos().addAll(Arrays.asList(e2));
		cli3.getEnderecos().addAll(Arrays.asList(e3));
		cli4.getEnderecos().addAll(Arrays.asList(e4));
		cli5.getEnderecos().addAll(Arrays.asList(e5));
		cli6.getEnderecos().addAll(Arrays.asList(e6));
		cli7.getEnderecos().addAll(Arrays.asList(e7));
		cli8.getEnderecos().addAll(Arrays.asList(e8));
		cli9.getEnderecos().addAll(Arrays.asList(e9));
		cli10.getEnderecos().addAll(Arrays.asList(e10));

		enderecoRepository.saveAll(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));
	}

}
