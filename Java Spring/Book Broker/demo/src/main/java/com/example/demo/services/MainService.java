package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.BookRepo;
import com.example.demo.repositories.UserRepo;


@Service
public class MainService {
	
	@Autowired
    private UserRepo userRepo;
	
	@Autowired
    private BookRepo bookRepo;
	
	
	
	

}
