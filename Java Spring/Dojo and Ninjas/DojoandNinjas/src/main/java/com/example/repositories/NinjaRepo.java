package com.example.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Ninja;
@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>  {
	List<Ninja> findAll();
	Optional<Ninja> findById(Long id);
	
}
