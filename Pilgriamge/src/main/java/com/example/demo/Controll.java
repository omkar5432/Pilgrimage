package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String register_(@ModelAttribute("r1") register r1)
	{
		se.register_data(r1);
		return "login";
	}
	
	@PostMapping("/login-1")
	public String login_()
	{
		
		return "destination";
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
}
