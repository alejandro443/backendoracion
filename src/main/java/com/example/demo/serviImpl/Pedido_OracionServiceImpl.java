package com.example.demo.serviImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pedido_Oracion;
import com.example.demo.repository.Pedido_OracionRespository;
import com.example.demo.service.Spedido_oracion;

@Service
public class Pedido_OracionServiceImpl implements Spedido_oracion{
	
	@Autowired
	private Pedido_OracionRespository pediso_oracionrepository;
	
	@Override
	public Pedido_Oracion create(Pedido_Oracion al) {
		// TODO Auto-generated method stub
		return pediso_oracionrepository.save(al);
	}

	@Override
	public List<Pedido_Oracion> readAll() {
		// TODO Auto-generated method stub
		return pediso_oracionrepository.findAll();
	}

	@Override
	public Pedido_Oracion read(int id) {
		// TODO Auto-generated method stub
		return pediso_oracionrepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pediso_oracionrepository.deleteById(id);
	}

	@Override
	public Pedido_Oracion update(Pedido_Oracion al) {
		// TODO Auto-generated method stub
		return pediso_oracionrepository.save(al);
	}

}
