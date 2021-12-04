package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Pedido_Oracion;


public interface Spedido_oracion {
	Pedido_Oracion create(Pedido_Oracion al);
	List<Pedido_Oracion> readAll();
	Pedido_Oracion read(int id);
	void delete(int id);
	Pedido_Oracion update(Pedido_Oracion al);
}
