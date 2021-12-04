package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Beneficiario;
import com.example.demo.serviImpl.BeneficiarioServiceImpl;

@RestController
@RequestMapping("/beneficiario")
public class BeneficiarioServiceV {
	@Autowired
	private BeneficiarioServiceImpl benficiarioserviceimpl;
	
	@PostMapping("/create")
	public ResponseEntity<Beneficiario> save(@RequestBody Beneficiario alum){
		try {
			Beneficiario al = benficiarioserviceimpl.create(alum);
			
			return new ResponseEntity<>(al, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	//----------------------------------------------------------------------------------------
	@GetMapping("/listar")
	public ResponseEntity<List<Beneficiario>> getAlumnos(){
		try {
			List<Beneficiario> list = new ArrayList<>();
			list = benficiarioserviceimpl.readAll();
			if(list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	//---------------------------------------------------------------------------------------------
	@PutMapping("/update/{id}")
	public ResponseEntity<Beneficiario> update(@RequestBody Beneficiario alum, @PathVariable("id") int id){
		try {
			Beneficiario ul = benficiarioserviceimpl.read(id);
			if(ul.getId_beneficiario()>0) {
			
				
				
				return new ResponseEntity<>(benficiarioserviceimpl.create(ul),HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}			

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	//---------------------------------------------------------------------------------
	@DeleteMapping("delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id){
		try {
			benficiarioserviceimpl.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
