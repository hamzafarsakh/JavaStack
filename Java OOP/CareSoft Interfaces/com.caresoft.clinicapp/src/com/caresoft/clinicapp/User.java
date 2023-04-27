package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    protected int pin;
    
    // TO DO: Getters and setters
    public void setId(Integer id) {
    	this.id = id;
    }
    public Integer getId() {
    	return this.id;
    }
	// Implement a constructor that takes an ID
    public User(Integer id) {
    	this.id = id;
    }
    
}
