package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Daikichi {

	@RequestMapping("/daikichi/{name1}/{name2}/{num}")
	public String index(@PathVariable("name1") String name1, 
			@PathVariable("name2") String name2, 
			@PathVariable("num") String num) {
		if(num != null) {
			int xx = Integer.parseInt(num);
			if(xx%2 == 0) {
				return "You will take a grand journey in the near future, but be weary of tempting offers";
			}
			else {
				return "ou have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
			}
		}
		
		return "Congratulations! You will soon "+name1+" to " + name2;
	}
	
	
}
