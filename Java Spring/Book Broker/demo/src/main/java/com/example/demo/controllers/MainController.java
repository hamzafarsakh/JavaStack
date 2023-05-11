package com.example.demo.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Reactive.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.Book;
import com.example.demo.models.User;
import com.example.demo.services.MainService;
import com.example.demo.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;




@Controller
public class MainController {
	@Autowired
	private MainService mainService;

	@Autowired
	private UserService userService;

	
	@GetMapping("/bookmarket")
	public String bookmarket(Model model , HttpSession session) {
		List<Book> booksNotToken = mainService.findAllNullBook();
		List<Book> myFavBooks = mainService.findUser((Long) session.getAttribute("user_id")).getBooksFav();
		List<Book> myBooks = mainService.findUser((Long) session.getAttribute("user_id")).getBooks();
		User user = mainService.findUser((Long) session.getAttribute("user_id"));

		session.setAttribute("user_fav_id", 0);
//		List<Book> booksNotToken = mainService.getDojosWhereIdQQ(null);
		// User user1 = mainService.findUser(null);
		System.out.println(booksNotToken);
		System.out.println(session.getAttribute("user_id"));
		 model.addAttribute("booksNotToken", booksNotToken);
		 model.addAttribute("myFavBooks", myFavBooks);
		 model.addAttribute("myBooks", myBooks);
		 model.addAttribute("user", user);

		return "bookmarket.jsp";
	}
	
	
	@GetMapping("/books/new")
	public String createBook(Model model , HttpSession session,@ModelAttribute("book") Book book) {
//		Long user_id = (Long) session.getAttribute("user_id");
//		model.addAttribute("user_id", user_id);
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
	
	
	@GetMapping("/books/{id}/edit")
	public String updateBook1(Model model , HttpSession session,@ModelAttribute("book") Book book,@PathVariable("id") Long id) {
		Book book1 = mainService.findBook(id);
//		Long user_id = (Long) session.getAttribute("user_id");
		model.addAttribute("book1", book1);
		return "updatebook.jsp";
	}
	
	@PostMapping("/books/{id}/edit")
	public String updateBook2( HttpSession session,@Valid @ModelAttribute("book") Book book, BindingResult result, Model model,@PathVariable("id") Long id) {
		if (result.hasErrors()) {
            model.addAttribute("book", book);
    		Book book1 = mainService.findBook(id);
//    		Long user_id = (Long) session.getAttribute("user_id");
    		model.addAttribute("book1", book1);
            return "updatebook.jsp";
        } else {
            mainService.createBook(book);
            return "redirect:/books/"+ id +"/edit";
        }
	}
	
	@GetMapping("/borrow/{bookId}")
	public String borrow(HttpSession session,@PathVariable("bookId") Long bookId){
		Book book1 = mainService.findBook(bookId);
		User user1 = mainService.findUser((Long) session.getAttribute("user_id"));
		List<Book> arrBook = user1.getBooksFav();
		book1.setUserFav(user1);
		mainService.createBook(book1);
		arrBook.add(book1);
		user1.setBooksFav(arrBook);
		userService.createUser(user1);
		return "redirect:/bookmarket";
	}
	
	@GetMapping("/return/{bookId}")
	public String returnBook(HttpSession session,@PathVariable("bookId") Long bookId){
		Book book1 = mainService.findBook(bookId);
		User user1 = mainService.findUser((Long) session.getAttribute("user_id"));
		List<Book> arrBook = user1.getBooksFav();
		book1.setUserFav(null);
		mainService.createBook(book1);
		arrBook.remove(book1);
		user1.setBooksFav(arrBook);
		userService.createUser(user1);
		return "redirect:/bookmarket";
	}
	
	@GetMapping("/delete/{bookId}")
	public String deleteBook(HttpSession session,@PathVariable("bookId") Long bookId){
		Book book1 = mainService.findBook(bookId);
		mainService.deleteBook(book1);
		return "redirect:/bookmarket";
	}
	
	
	
	
	
	
	
	
	
}
