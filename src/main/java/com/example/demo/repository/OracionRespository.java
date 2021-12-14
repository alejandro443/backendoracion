//package com.example.demo.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import com.example.demo.dto.OrdenResponde;
//import com.example.demo.model.Pedido_Oracion;
//
//public interface OracionRespository  extends JpaRepository<Pedido_Oracion, Integer>{
//	   @Query("SELECT new com.javatechie.jpa.dto.OrdenResponde(p.oracion , b.id_perso ) FROM Pedido_Oracion p JOIN c.Beneficiario b")
//	   
//	    public List<OrdenResponde> getJoinInformation();
//}
