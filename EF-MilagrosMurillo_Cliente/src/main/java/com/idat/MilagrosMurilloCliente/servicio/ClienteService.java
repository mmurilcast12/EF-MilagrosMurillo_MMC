package com.idat.MilagrosMurilloCliente.servicio;

import java.util.List;

import com.idat.EFMilagrosMurilloCliente.modelo.Cliente;

public interface ClienteService {
	public List<Cliente> listarClientes();
	public Cliente obtenerClientes();
	public void guardarClientes(Cliente cliente);

}
