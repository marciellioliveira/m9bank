package br.com.marcielli.m9bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcielli.m9bank.entity.Cliente;
import br.com.marcielli.m9bank.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente salvarCliente(String nome, Long cpf) {
		//Validar os campos
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		cliente.setNome(nome);
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getClientes(){
		return clienteRepository.findAll();
	}
	

}
