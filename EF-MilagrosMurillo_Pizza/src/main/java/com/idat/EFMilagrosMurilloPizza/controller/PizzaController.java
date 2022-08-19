package com.idat.EFMilagrosMurilloPizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFMilagrosMurilloPizza.modelo.Pizza;
import com.idat.EFMilagrosMurilloPizza.servicio.PizzaService;

public class PizzaController {
	
	@Autowired
	private PizzaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizza> listarPizzas(){
		return service.listarPizzas();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Pizza obtenerPizzae(@PathVariable Integer id){
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizza(@RequestBody Pizza pizza) {
		service.guardarPizzas(pizza);
	}

}
