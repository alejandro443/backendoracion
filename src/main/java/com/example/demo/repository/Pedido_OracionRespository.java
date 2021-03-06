package com.example.demo.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pedido_Oracion;

@Repository
public interface Pedido_OracionRespository extends JpaRepository<Pedido_Oracion, Integer>{
    @Query(value = "{ CALL SP_LISTA_COMENTARIO}", nativeQuery   = true)
    List<Map<String, Object>>  SP_LISTA_COMENTARIO();
}
