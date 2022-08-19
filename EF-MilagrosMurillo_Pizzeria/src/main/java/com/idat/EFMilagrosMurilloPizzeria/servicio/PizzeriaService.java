package com.idat.EFMilagrosMurilloPizzeria.servicio;

import java.util.List;
import com.idat.EFMilagrosMurilloPizzeria.modelo.Pizzeria;


public interface PizzeriaService {
		public List<Pizzeria> listarPizzerias();
		public Pizzeria obtenerPizzerias();
		public void guardarPizzerias(Pizzeria pizzeria);

}
