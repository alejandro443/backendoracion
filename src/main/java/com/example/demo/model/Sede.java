//package com.example.demo.model;
//
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name="sede")
//public class Sede {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int idsede;
//	@Column(name="nombre")
//	private String nombre;
//	@Column(name="estado")
//	private String estado;
//	
//	//ESTA ES LA RECLACION DE 1 A MUCHOS DE SEDE A BANCO COMUNAL
//	@OneToMany(mappedBy = "sede",cascade =CascadeType.ALL,orphanRemoval = true)
//	private List<Banco_Comunal> banco_comunal;
//
//}
