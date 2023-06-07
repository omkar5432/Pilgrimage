package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Controll 
{
	@Autowired
	service se;
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@RequestMapping("/blog")
	public String blog()
	{
		return "blog";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/destination")
	public String destination()
	{
		return "destination";
	}
	
	@RequestMapping("/guide")
	public String guide()
	{
		return "guide";
	}
	
	@RequestMapping("/package")
	public String pack()
	{
		return "package";
	}
	
	@RequestMapping("/service")
	public String service()
	{
		return "service";
	}
	

	@RequestMapping("/single")
	public String single()
	{
		return "single";
	}
	
	@RequestMapping("/testimonial")
	public String testimonial()
	{
		return "testimonial";
	}
	
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@PostMapping("/register-1")
	public String register_(@ModelAttribute("r1") register r1, ModelMap m1)
	{
		se.register_data(r1);
		List<register>lr=se.show_data(r1);
		m1.addAttribute("lr", lr);
		return "destination";
	}
	
	
	
	@PostMapping("/login-1")
	public String login_(ModelMap m)
	{
		List<book>r=se.show_data();
		m.addAttribute("r", r);
		return "passenger_data";
	}
	
	@RequestMapping("/north_india")
	public String north_india()
	{
		return "north_india";
	}
	
	@RequestMapping("/south_india")
	public String south_india()
	{
		return "south_india";
	}
	
	@RequestMapping("/east_india")
	public String east_india()
	{
		return "east_india";
	}
	
	@RequestMapping("/west_india")
	public String west_india()
	{
		return "west_india";
	}
	
	@RequestMapping("/central_india")
	public String central_india()
	{
		return "central_india";
	}
	
	@RequestMapping("/international")
	public String International()
	{
		return "international";
	}
	
	@RequestMapping("/book")
	public String book()
	{
		return "book";
	}
	
	@PostMapping("/book_1")
	public String book_1(@ModelAttribute("b1") book b1)
	{
		se.book_data(b1);
		return "redirect:/final";
	}
	
	@RequestMapping("/final")
	public String final_(ModelMap m)
	{
		List<book>r=se.show_data();
		m.addAttribute("r",r);
		return "final";
	}
	

	@RequestMapping("/payment")
	public String payment()
	{
		return "payment";
	}
	
}
