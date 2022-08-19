package com.idat.EFMilagrosMurilloCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFMilagrosMurilloCliente.modelo.Cliente;
import com.idat.MilagrosMurilloCliente.servicio.ClienteService;

public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listarClientes(){
		return service.listarClientes();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Cliente obtenerCliente(@PathVariable Integer id){
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarCliente(@RequestBody Cliente cliente) {
		service.guardarClientes(cliente);
	}
}

