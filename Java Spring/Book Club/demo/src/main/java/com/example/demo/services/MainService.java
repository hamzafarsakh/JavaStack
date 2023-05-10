package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.demo.models.Book;
import com.example.demo.models.LoginUser;
import com.example.demo.models.User;
import com.example.demo.repositories.BookRebo;
import com.example.demo.repositories.UserRepo;

@Service
public class MainService {
	
	
	@Autowired
	private BookRebo bookRepo;
	
	@Autowired
    private UserRepo userRepo;

	public User register(User newUser, BindingResult result) {
        if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email", "Unique", "This email is already in use!");
        }
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(hashed);
            return userRepo.save(newUser);
        }
    }

	public User login(LoginUser newLogin, BindingResult result) {
        if(result.hasErrors()) {
            return null;
        }
        Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
        if(!potentialUser.isPresent()) {
            result.rejectValue("email", "Unique", "Unknown email!");
            return null;
        }
        User user = potentialUser.get();
        if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            return user;
        }
    }

    public User findUserById(Long id) {
    	Optional<User> u = userRepo.findById(id);

    	if(u.isPresent()) {
			return u.get();
			} else {
			return null;
    	}
	}
//	------------------------------
	

	
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
