package com.example.demo.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_beneficiario")
public class Beneficiario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_beneficiario;
	
	//ralacion de 1 a 1 con persona ,de persona a beneficiario
//	@OneToOne(cascade = CascadeType.MERGE)
//	@JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
//	@OneToOne(cascade = CascadeType.MERGE)
//	@JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
	
	

	  
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_perso", referencedColumnName = "idpersona")
	  @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Persona persona;
	
	
	
	////Esta es la relacion de banco comunal a beneficiario de 1 a muchos
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "id_banco_comunal")
//	private Banco_Comunal banco_comunal;
//
//	
	
	//Relacion de 1 a 1 de beneficiario a pedido_oracion
//	@OneToOne(mappedBy = "beneficiario", cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.LAZY)
//	private Pedido_Oracion pedido_oracion;
    @JsonIgnore
	@OneToMany(mappedBy = "beneficiario",cascade =CascadeType.ALL,orphanRemoval = true)
	
	private List<Pedido_Oracion> pedido_oracion;
	
	
	
	


}
