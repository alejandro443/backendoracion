//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//
//import com.example.demo.model.Persona;
//import com.example.demo.service.PersonaService;
//
//@RestController
//@RequestMapping("/per")
//public class PersonaCRUD {
//    @Autowired
//    PersonaService personaservice;
//    
//    @GetMapping("/lista")
//    public ResponseEntity<List<Persona>> lista(){
//        List<Persona> lista = personaservice.lista();
//       return new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
//    }
//
//
//}
