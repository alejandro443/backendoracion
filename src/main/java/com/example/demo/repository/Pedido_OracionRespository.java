package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pedido_Oracion;

@Repository
public interface Pedido_OracionRespository extends JpaRepository<Pedido_Oracion, Integer>{

}
