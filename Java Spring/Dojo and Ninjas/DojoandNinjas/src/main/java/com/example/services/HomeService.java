package com.example.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Dojo;
import com.example.models.Ninja;
import com.example.repositories.DojoRepo;
import com.example.repositories.NinjaRepo;

@Service
public class HomeService {
	@Autowired
	NinjaRepo ninjaRepo;
	@Autowired
	DojoRepo dojoRepo;
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
	     if(optionalNinja.isPresent()) {
	         return optionalNinja.get();
	     } else {
	         return null;
	     }
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
	     if(optionalDojo.isPresent()) {
	         return optionalDojo.get();
	     } else {
	         return null;
	     }
	}
	
	public List<Dojo> findAllDojo(){
		return dojoRepo.findAll();
	}
	
	public List<Ninja> findAllNinja(){
		return ninjaRepo.findAll();
	}
	
	public void createDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	
	public void createNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
	
	
}
