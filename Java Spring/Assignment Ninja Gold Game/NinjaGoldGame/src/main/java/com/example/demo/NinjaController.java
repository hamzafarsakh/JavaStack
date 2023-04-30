package com.example.demo;
import java.util.LinkedList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaController {
	
//	this our arr for the context and color
	
	
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("sum") == null ) {
			session.setAttribute("sum", 0);
		}
		if(session.getAttribute("goal") == null ) {
			int random = (int)((Math.random() * 50 + 1)+70);
			session.setAttribute("goal", random);
		}
		if((int)session.getAttribute("goal") < (int)session.getAttribute("sum") ) {
			return "final.jsp";
		}
			return "index.jsp";
	}
	
	
	@PostMapping("/process_money")
	public String processMoney(
			@RequestParam(value="which_form")int which_form,
			HttpSession session
			) {
		LinkedList<Par> arr = new LinkedList();
		Random rand = new Random();
//		int random = (int)(Math.random() * 50 + 1);
		if(session.getAttribute("sum") == null ) {
			session.setAttribute("sum", 0);
		}
			int sum = (int) session.getAttribute("sum");
			if(which_form == 1) {
				int random = (int)(Math.random() * 11 + 10);
				String r1 = Integer.toString(random);
				Par p1=new Par(("You entered a farm and earned "+ r1 +" gold."),"green");
				if(session.getAttribute("arr") != null) {
					arr =  (LinkedList<Par>) session.getAttribute("arr");					
				}
				arr.add(p1);
				session.setAttribute("arr", arr);
				sum +=random;	
			}
			else if(which_form == 2){
				int random = (int)(Math.random() * 6+5);
				String r1 = Integer.toString(random);
				Par p1=new Par(("You entered a cave and earned "+ r1 +" gold."),"green");
				if(session.getAttribute("arr") != null) {
					arr =  (LinkedList<Par>) session.getAttribute("arr");					
				}
				arr.add(p1);
				session.setAttribute("arr", arr);
				sum +=random;				}
			else if(which_form == 3){
				int random = (int)(Math.random() * 4 + 2);
				String r1 = Integer.toString(random);
				Par p1=new Par(("You entered a house and earned "+ r1 +" gold."),"green");
				if(session.getAttribute("arr") != null) {
					arr =  (LinkedList<Par>) session.getAttribute("arr");					
				}
				arr.add(p1);
				session.setAttribute("arr", arr);
				sum +=random;				}
			
			
			else if(which_form == 4){
				int random = (int)((Math.random() * 50 + 1)-(Math.random() * 50 + 1));
				String r1 = Integer.toString(random);
				if(session.getAttribute("arr") != null) {
					arr =  (LinkedList<Par>) session.getAttribute("arr");					
				}
				Par p1=new Par();
				if(random >= 0) {
					p1.setPar("You entered a quest and earned "+ r1 +" gold.");
					p1.setColor("green");
					
				}else {
					p1.setPar("You entered a quest and lost "+ r1 +" gold.  Ouch. ");
					p1.setColor("red");
				}
				arr.add(p1);
				session.setAttribute("arr", arr);
				sum +=random;				
				}
			
			
			session.setAttribute("sum", sum);
		return "redirect:/";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("sum", 0);
		session.setAttribute("goal", 0);
		session.setAttribute("arr", null);
		return "redirect:/";
	}
	@RequestMapping("/again")
	public String again(HttpSession session) {
		session.setAttribute("sum", null);
		session.setAttribute("goal", null);
		session.setAttribute("arr", null);
		
		return "redirect:/";
	}
}
