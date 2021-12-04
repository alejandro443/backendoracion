package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Beneficiario;


public interface Sbeneficiario {
	Beneficiario create(Beneficiario al);
	List<Beneficiario> readAll();
	Beneficiario read(int id);
	void delete(int id);
	Beneficiario update(Beneficiario al);
}
