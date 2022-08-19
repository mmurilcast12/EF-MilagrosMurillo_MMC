package com.idat.EFMilagrosMurilloPizza.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFMilagrosMurilloPizza.modelo.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza,Integer>{

}
