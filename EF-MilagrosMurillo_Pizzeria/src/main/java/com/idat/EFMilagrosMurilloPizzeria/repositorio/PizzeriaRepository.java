package com.idat.EFMilagrosMurilloPizzeria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFMilagrosMurilloPizzeria.modelo.Pizzeria;

@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria,Integer>{

}
