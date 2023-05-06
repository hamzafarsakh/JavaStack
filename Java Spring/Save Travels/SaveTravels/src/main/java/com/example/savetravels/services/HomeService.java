package com.example.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.savetravels.models.Expense;
import com.example.savetravels.repositories.ExpenseRebo;


@Service
public class HomeService {

	@Autowired
	ExpenseRebo expenseRebo;
	
	public List<Expense> findAll(){
		return expenseRebo.findAll();
	}

	public Expense findById(Long id){
		Optional<Expense> optionalExpense = expenseRebo.findById(id);
	     if(optionalExpense.isPresent()) {
	         return optionalExpense.get();
	     } else {
	         return null;
	     }
	}
	
	public void delete(Expense entity) {
		expenseRebo.delete(entity);
	}
	public void create(Expense entity) {
		expenseRebo.save(entity);
	}
	
}
