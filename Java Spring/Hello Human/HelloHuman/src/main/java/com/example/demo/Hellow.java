package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellow {
	@RequestMapping("/")
	public String human() {
		return "Hello Human";
	}
	@RequestMapping("/s")
	public String fName(@RequestParam(value="q", required = false) String name, 
			@RequestParam(value="q2", required = false) String lname,
			@RequestParam(value="times", required = false) String x) {
		if(x != null) {
			int xx=Integer.parseInt(x); 
			String z="";
			for(int i =0; i<=xx;i++) {
				z +=(name + lname);
			}
			return z;
		}
		else {
			if(lname == null) {
				return "Hello " + name;
			}
			else {
				return "Hello " + name + lname;
	}}}

}
