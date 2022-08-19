package com.idat.EFMilagrosMurilloPizza.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pizza")
public class Pizza {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer idPizza;
		private String nombrePizza;
		private String descripcion;
}
