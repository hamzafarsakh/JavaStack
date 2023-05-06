package com.example.savetravels.controllers;

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

import com.example.savetravels.models.Expense;
import com.example.savetravels.services.HomeService;

import jakarta.validation.Valid;



@Controller
public class HomeController {
	@Autowired
	HomeService service; 
	
	@GetMapping("/")
	public String index (@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> all = service.findAll();
		model.addAttribute("all", all);
		return "index.jsp";
	}
	@PostMapping("/addExpense")
	public String addExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
        	service.create(expense);
            return "redirect:/";
        }
	}
	
	@GetMapping("/delete/{expenseId}")
	public String delete(@PathVariable("expenseId") Long expenseId) {
		Expense expense = service.findById(expenseId);
		service.delete(expense);
		return "redirect:/";
	}

	@GetMapping("/edit/{expenseId}")
	public String edit(@PathVariable("expenseId") Long expenseId,Model model){
		Expense expense = service.findById(expenseId);
		model.addAttribute("expense",expense);
		return "edit.jsp";
	}
	
	@PutMapping("/editExpense/{id}")
    public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("expense", expense);
            return "edit.jsp";
        } else {
            service.create(expense);
            return "redirect:/";
        }
    }


}
