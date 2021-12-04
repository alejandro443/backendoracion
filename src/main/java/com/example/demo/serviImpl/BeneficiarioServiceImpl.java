package com.example.demo.serviImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Beneficiario;
import com.example.demo.repository.BeneficiarioRepository;
import com.example.demo.service.Sbeneficiario;

@Service
public class BeneficiarioServiceImpl implements Sbeneficiario{

	@Autowired
	private BeneficiarioRepository benficiariorepository;
	
	@Override
	public Beneficiario create(Beneficiario al) {
		// TODO Auto-generated method stub
		return benficiariorepository.save(al);
	}

	@Override
	public List<Beneficiario> readAll() {
		// TODO Auto-generated method stub
		return benficiariorepository.findAll();
	}

	@Override
	public Beneficiario read(int id) {
		// TODO Auto-generated method stub
		return benficiariorepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		benficiariorepository.deleteById(id);
	}

	@Override
	public Beneficiario update(Beneficiario al) {
		// TODO Auto-generated method stub
		return benficiariorepository.save(al);
	}

}
