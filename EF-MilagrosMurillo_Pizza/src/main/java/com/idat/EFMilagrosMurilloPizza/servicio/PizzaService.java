package com.idat.EFMilagrosMurilloPizza.servicio;

import java.util.List;

import com.idat.EFMilagrosMurilloPizza.modelo.Pizza;

public interface PizzaService {
	public List<Pizza> listarPizzas();
	public Pizza obtenerPizzas();
	public void guardarPizzas(Pizza pizza);

}
