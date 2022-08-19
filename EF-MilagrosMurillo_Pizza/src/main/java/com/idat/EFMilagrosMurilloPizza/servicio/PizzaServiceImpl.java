package com.idat.EFMilagrosMurilloPizza.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.idat.EFMilagrosMurilloPizza.modelo.Pizza;
import com.idat.EFMilagrosMurilloPizza.repositorio.PizzaRepository;

public class PizzaServiceImpl implements PizzaService {

	@Autowired
	private PizzaRepository repository;
	
	@Override
	public List<Pizza> listarPizzas() {
		return repository.findAll();
	}

	@Override
	public Pizza obtenerPizzas() {
		return null;
	}

	@Override
	public void guardarPizzas(Pizza pizza) {
		repository.save(pizza);

	}

}
