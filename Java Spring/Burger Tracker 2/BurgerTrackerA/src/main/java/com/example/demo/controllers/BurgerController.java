package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Burger;
import com.example.demo.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	
	@Autowired
	BurgerService burgerService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("burger") Burger burger,
			Model model) {
		List<Burger> burgers = burgerService.allBurger();
		model.addAttribute("burgers", burgers);
		return "index.jsp";
	}
	@GetMapping("/addBurger")
	public String index2(@ModelAttribute("burger") Burger burger,
			Model model) {
		List<Burger> burgers = burgerService.allBurger();
		model.addAttribute("burgers", burgers);
		return "index.jsp";
	}
	
	@PostMapping("/addBurger")
	public String addBurger(Model model,@Valid @ModelAttribute("burger") Burger burger,
			BindingResult result) {
			if (result.hasErrors()) {
				List<Burger> burgers = burgerService.allBurger();
				model.addAttribute("burgers", burgers);
				return "index.jsp";
	        } else {
	        	burgerService.createBurger(burger);
	            return "redirect:/";
	        }
		
	}
	@GetMapping("/burgers/edit/{burgerId}")
	public String edit(@PathVariable("burgerId") Long burgerId,
			Model model) {
		Burger burger = burgerService.findBurger(burgerId);
		model.addAttribute("burger", burger);
		return "edit.jsp";
	}
	@PutMapping("/updateBurger/{id}")
	public String update(Model model,@Valid @ModelAttribute("burger") Burger burger,
			BindingResult result) {
		if (result.hasErrors()) {
			List<Burger> burgers = burgerService.allBurger();
			model.addAttribute("burgers", burgers);
			return "index.jsp";
        } else {
        	burgerService.createBurger(burger);
            return "redirect:/";
        }
	
	}
	}
