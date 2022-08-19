package com.idat.EFMilagrosMurilloPizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFMilagrosMurilloPizzeria.modelo.Pizzeria;
import com.idat.EFMilagrosMurilloPizzeria.servicio.PizzeriaService;

public class PizzeriaController {

	@Autowired
	private PizzeriaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizzeria> listarClientes(){
		return service.listarPizzerias();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Pizzeria obtenerCliente(@PathVariable Integer id){
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizzeria(@RequestBody Pizzeria pizzeria) {
		service.guardarPizzerias(pizzeria);
	}
}
