package com.example.demo.controllers;



import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Book;
import com.example.demo.services.MainService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;




@Controller
public class MainController {
	 @Autowired
     private MainService mainService;

	
	@GetMapping("/bookmarket")
	public String bookmarket(Model model , HttpSession session) {
		List<Book> booksNotToken = mainService.findAllNullBook();
		return "bookmarket.jsp";
	}
	
	
	@GetMapping("/books/new")
	public String createBook(Model model , HttpSession session,@ModelAttribute("book") Book book) {
		return "new_book.jsp";
	}
	
	@PostMapping("/books/new")
	public String createBook1( HttpSession session,@Valid @ModelAttribute("book") Book book, BindingResult result, Model model) {
		if (result.hasErrors()) {
            model.addAttribute("book", book);
            return "new_book.jsp";
        } else {
            mainService.createBook(book);
            return "redirect:/books/new";
        }
	}
	
	
	
	
	
}
