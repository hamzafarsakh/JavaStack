package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRebo;


@Service
public class MainService {
	
	@Autowired
    private BookRebo bookRepo;
	
	public List<Book> allBooks(){
		return  bookRepo.findAll();
	}
	
	
	public Book addBook(Book book){
		return  bookRepo.save(book);
	}
	
	public Book findBook(Long id){
		Optional<Book> optionalBook = bookRepo.findById(id);
	     if(optionalBook.isPresent()) {
	         return optionalBook.get();
	     } else {
	         return null;
	     }
	}
	
	public void deleteBook(Book book){
		bookRepo.delete(book);
	}
	
	
	
	
	

}
