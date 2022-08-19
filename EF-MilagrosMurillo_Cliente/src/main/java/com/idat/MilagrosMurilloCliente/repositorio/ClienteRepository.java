package com.idat.MilagrosMurilloCliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.idat.EFMilagrosMurilloCliente.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
