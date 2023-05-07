package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.models.Dojo;
import com.example.models.Ninja;
import com.example.services.HomeService;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	@Autowired
	HomeService service;
	@GetMapping("/dojos/new")
	public String dojoIndex(@ModelAttribute("dojo") Dojo dojo) {
		return "index.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
        if (result.hasErrors()) {
            
            return "index.jsp";
        } else {
        	service.createDojo(dojo);
            return "redirect:/dojos/new";
        }
    }
	
	@GetMapping("/ninjas/new")
	public String nijaIndex(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos1 = service.findAllDojo();
		model.addAttribute("dojos1", dojos1);
		return "ninja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String addDojo(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
            
            return "ninja.jsp";
        } else {
        	service.createNinja(ninja);
            return "redirect:/ninjas/new";
        }
    }
	
	@RequestMapping("/dojo/{dojoId}")
	public String allIndex(Model model,@PathVariable("dojoId") Long dojoId) {
		Dojo dojo1 = service.findDojo(dojoId);
		model.addAttribute("dojo1", dojo1);
		return "all.jsp";
	}
	

}
