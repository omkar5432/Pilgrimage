package com.example.demo;

import java.util.List;

public interface service {
	
	public void register_data(register r);
	
	public void book_data(book b);
	
	List<register> show_data(register r1);
	
	List<book> show_data();

}
