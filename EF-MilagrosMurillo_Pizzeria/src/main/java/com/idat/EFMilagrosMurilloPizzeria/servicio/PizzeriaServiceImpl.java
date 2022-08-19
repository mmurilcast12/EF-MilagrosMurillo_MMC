package com.idat.EFMilagrosMurilloPizzeria.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.idat.EFMilagrosMurilloPizzeria.modelo.Pizzeria;
import com.idat.EFMilagrosMurilloPizzeria.repositorio.PizzeriaRepository;

public class PizzeriaServiceImpl implements PizzeriaService {

	@Autowired
	private PizzeriaRepository repository;
	
	@Override
	public List<Pizzeria> listarPizzerias() {
		return repository.findAll();
	}

	@Override
	public Pizzeria obtenerPizzerias() {
		
		return null;
	}

	@Override
	public void guardarPizzerias(Pizzeria pizzeria) {
		repository.save(pizzeria);

	}

}
