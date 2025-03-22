package br.com.marcielli.m9bank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcielli.m9bank.entity.Cliente;
import br.com.marcielli.m9bank.service.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	private ClienteService clienteService = new ClienteService();
	
	@PostMapping("/add/{nome}/{cpf}")
	public void addCliente(@PathVariable String nome, @PathVariable Long cpf) {
		//clienteService.addCliente(nome, cpf);
		clienteService.salvarCliente(nome, cpf);
		
	}	
	
	@PostMapping("/add")
	public void addCliente(@RequestBody Cliente cliente) {
		//clienteService.addCliente(cliente.getNome(), cliente.getCpf());
		
	}
	
	@GetMapping("/all")
	public List<Cliente> getAllClientes(){
		//return clienteService.getClientes();
		return clienteService.getClientes();
	}
}
