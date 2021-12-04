package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pedido_Oracion;
import com.example.demo.serviImpl.Pedido_OracionServiceImpl;



@RestController
@RequestMapping("/ruta")
public class HomeController {
	@Autowired
	private Pedido_OracionServiceImpl pedidooracionseviceimpl;
	
	@PostMapping("/create")
	public ResponseEntity<Pedido_Oracion> save(@RequestBody Pedido_Oracion alum){
		try {
			Pedido_Oracion al = pedidooracionseviceimpl.create(alum);
			
			return new ResponseEntity<>(al, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//----------------------------------------------------------------------------------------
		@GetMapping("/listado")
		public ResponseEntity<List<Pedido_Oracion>> getAlumnos(){
			try {
				List<Pedido_Oracion> list = new ArrayList<>();
				list = pedidooracionseviceimpl.readAll();
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
		public ResponseEntity<Pedido_Oracion> update(@RequestBody Pedido_Oracion alum, @PathVariable("id") int id){
			try {
				Pedido_Oracion ul = pedidooracionseviceimpl.read(id);
				if(ul.getId_pedido()>0) {
//					ul.setCorreo(alum.getCorreo());
//					ul.setDni(alum.getDni());
//					ul.setEstado(alum.getEstado());
//					ul.setM_apellidos(alum.getM_apellidos());
//					ul.setNombre(alum.getNombre());
//					ul.setP_apellidos(alum.getP_apellidos());
//					ul.setTelefono(alum.getTelefono());
					return new ResponseEntity<>(pedidooracionseviceimpl.create(ul),HttpStatus.OK);
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
				pedidooracionseviceimpl.delete(id);
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

}
