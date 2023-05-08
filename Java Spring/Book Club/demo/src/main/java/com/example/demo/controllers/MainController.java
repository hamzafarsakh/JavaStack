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

import com.example.demo.models.Book;
import com.example.demo.models.User;
import com.example.demo.services.MainService;
import com.example.demo.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


@Controller
public class MainController {
	 @Autowired
     private MainService mService;
	 
     @Autowired
     private UserService userServ;
	 
	 @GetMapping("/books")
	 public String books(HttpSession session, Model model) {
 		 if( session.getAttribute("user_id") == null) {
 			return "redirect:/logout";
 		 }
		 Long user_id = (Long) session.getAttribute("user_id");
		 User thisUser = userServ.findUserById(user_id);
		 model.addAttribute("thisUser", thisUser);
		 List<Book> books1 = mService.allBooks();
		 model.addAttribute("books1", books1);
 		 return "books.jsp";
	 }
	 
	 @GetMapping("/books/new")
	 public String newBook(HttpSession session, Model model,@ModelAttribute("book") Book book) {
 		 if( session.getAttribute("user_id") == null) {
 			return "redirect:/logout";
 		 }
		 return "newbooks.jsp";
	 }
	 
	 
	 @PostMapping("/books/new")
	 public String addBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            model.addAttribute("book", book);
	            return "newbooks.jsp";
	        } else {
	            mService.addBook(book);
	            return "redirect:/books/new";
	        }
	    }
	 
	 @GetMapping("/books/{bookId}")
	 public String newBook(HttpSession session, Model model,@PathVariable("bookId") Long bookId) {
 		 if( session.getAttribute("user_id") == null) {
 			return "redirect:/logout";
 		 }
 		 Book book1 = mService.findBook(bookId);
 		 model.addAttribute("book1", book1);
		 return "showOneBook.jsp";
	 }
	 
//	 /books/${book1.id}/edit
	
	 @GetMapping("/books/{id}/edit")
	 public String editBook(HttpSession session, Model model,@ModelAttribute("book") Book book,@PathVariable("id") Long id) {
 		 if( session.getAttribute("user_id") == null) {
 			return "redirect:/logout";
 		 }
 		 Book book1 = mService.findBook(id);
 		model.addAttribute("book1", book1);
		 return "editBook.jsp";
	 }
	 
	 
	 @PutMapping("/books/{id}/edit")
	 public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model,@PathVariable("id") Long id) {
	        if (result.hasErrors()) {
	            model.addAttribute("book", book);
	            return "editBook.jsp";
	        } else {
	            mService.addBook(book);
	            return "redirect:/books/"+id+"/edit";
	        }
	    }
	 
	 @GetMapping("/deleteBook/{bookId}")
	 public String delete(@PathVariable("bookId") Long bookId) {
		 Book book1 = mService.findBook(bookId);
		 mService.deleteBook(book1);
		 return "redirect:/books";
	 }

	 
}