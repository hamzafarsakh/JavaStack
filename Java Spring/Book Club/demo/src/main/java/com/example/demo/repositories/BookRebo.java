package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Book;


public interface BookRebo extends CrudRepository<Book, Long>{
	List<Book> findAll();


}
