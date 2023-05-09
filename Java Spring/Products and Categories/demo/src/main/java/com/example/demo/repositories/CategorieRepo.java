package com.example.demo.repositories;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Categorie;
import com.example.demo.models.Product;


public interface CategorieRepo  extends CrudRepository<Categorie, Long>{

    List<Categorie> findByProductsNotContains(Product product);
    
    List<Categorie> findAllByProducts(Product product);
    
	List<Categorie> findAll();


}
