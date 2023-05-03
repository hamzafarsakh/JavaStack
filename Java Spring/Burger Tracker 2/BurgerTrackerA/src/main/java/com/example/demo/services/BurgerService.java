package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Burger;
import com.example.demo.repositories.BurgerRepository;

@Service
public class BurgerService {
	
	private final BurgerRepository burgerRepository;
	 
	 public BurgerService(BurgerRepository burgerRepository) {
	     this.burgerRepository = burgerRepository;
	 }
	 // returns all the Burger
	 public List<Burger> allBurger() {
	     return burgerRepository.findAll();
	 }
	 // creates a Burger
	 public Burger createBurger(Burger b) {
	     return burgerRepository.save(b);
	 }
	 // retrieves a Burger
	 public Burger findBurger(Long id) {
	     Optional<Burger> optionalBurger = burgerRepository.findById(id);
	     if(optionalBurger.isPresent()) {
	         return optionalBurger.get();
	     } else {
	         return null;
	     }
	 }
	public Burger updateBurger(Long id, String BurgerName, String RestName, int Rating) {
		Burger burger = findBurger(id);
		burger.setBurgerName(BurgerName);
		burger.setRestName(RestName);
		burger.setRating(Rating);
		burger=burgerRepository.save(burger);
		return burger;
	}
	public void deleteBurger(Long id) {
		burgerRepository.deleteById(id);
		
	}
}
