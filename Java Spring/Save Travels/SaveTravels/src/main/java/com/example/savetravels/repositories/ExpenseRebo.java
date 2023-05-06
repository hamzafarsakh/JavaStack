package com.example.savetravels.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.savetravels.models.Expense;


@Repository
public interface ExpenseRebo extends CrudRepository<Expense, Long>{
	List<Expense> findAll();
	Optional<Expense> findById(Long id);
	void delete(Expense entity);
}
