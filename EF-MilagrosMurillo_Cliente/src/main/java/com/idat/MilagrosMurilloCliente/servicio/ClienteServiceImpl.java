package com.idat.MilagrosMurilloCliente.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EFMilagrosMurilloCliente.modelo.Cliente;
import com.idat.MilagrosMurilloCliente.repositorio.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listarClientes() {
		return repository.findAll();
	}

	@Override
	public Cliente obtenerClientes() {
		return null;
	}

	@Override
	public void guardarClientes(Cliente cliente) {
		repository.save(cliente);
	}

}
