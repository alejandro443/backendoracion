package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Persona;



public interface Spersona {
	Persona create(Persona al);
	List<Persona> readAll();
	Persona read(int id);
	void delete(int id);
	Persona update(Persona al);
}
