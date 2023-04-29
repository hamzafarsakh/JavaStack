package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			Integer count = 0;
			session.setAttribute("count",count);
			return "index.jsp";
		}else {
			Integer count = (Integer) session.getAttribute("count");
			count ++;
			session.setAttribute("count",count);
			return "index.jsp";
		}
	}

	@RequestMapping("/counter")
	public String count(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count",0);
			return "counter.jsp";
		}else {
		return "counter.jsp";
	
		}
	}
	@RequestMapping("/counter2")
	public String count2(HttpSession session) {
		if (session.getAttribute("count") == null) {
			Integer count = 0;
			session.setAttribute("count",count);
			return "index.jsp";
		}else {
			Integer count = (Integer) session.getAttribute("count");
			count +=2;
			session.setAttribute("count",count);
			return "index.jsp";
		}
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "counter.jsp";
	}

}
