package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	@RequestMapping("/today")
	public String hellow() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/tomorrow")
	public String hellow1() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'";
	}
}
