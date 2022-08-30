package org.example.vendas.service;

import org.example.vendas.model.Cliente;
import org.example.vendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	private ClienteRepository clienteRepository;

	@Autowired
	public ClienteService ( ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public void salvar(Cliente cliente) {
		this.validar(cliente);
		this.clienteRepository.persistir(cliente);
	}

	public void validar(Cliente cliente) {

	}
}
