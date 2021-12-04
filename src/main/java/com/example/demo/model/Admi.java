//package com.example.demo.model;
//
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name="admi")
//public class Admi {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id_admi;
//	@Column(name="nombre_pastor")
//	private String nombre_pastor;
//	
//	//relacion de 1 a 1 con persona ,de persona a admi
////		@OneToOne(cascade = CascadeType.MERGE)
////		@JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
//	@OneToOne(cascade = CascadeType.MERGE)
//	@JoinColumn(name = "idpersona", referencedColumnName = "idpersona")
//		private Persona persona;
//		
//		//relacionde de uno a muchos de admi a pedido_oracion
//		@OneToMany(fetch = FetchType.LAZY, mappedBy = "admi")
//		private List<Pedido_Oracion> pedido_oracion;
//	
//	
//	
//
//}
