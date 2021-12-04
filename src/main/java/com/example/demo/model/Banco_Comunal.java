package com.example.demo.model;





//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import javax.persistence.Table;
//
//
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name="banco_comunal")
//public class Banco_Comunal {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id_banco_comunal;
//	@Column(name="nombre")
//	private String nombre;
//	
//	
//	//Esta es la relacion de sede a banco comunal de 1 a muchos
////	@ManyToOne()
////	@JoinColumn(name = "idsede")
////	private Sede sede;
//
//	
//	//Esta es la relacion de banco comunal a beneficiario de 1 a muchos
////	@OneToMany(mappedBy = "banco_comunal",cascade =CascadeType.ALL,orphanRemoval = true)
////	private List<Beneficiario> beneficiario;
//}
