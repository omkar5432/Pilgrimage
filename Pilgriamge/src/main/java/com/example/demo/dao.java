package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class dao implements service {

	@Autowired
	repo rp;
	
	@Autowired
	repo_book rb;
	
	@Override
	public void register_data(register r) {
		rp.save(r);
	}

	@Override
	public void book_data(book b) {
		rb.save(b);
	}
	
	@Override
	public List<register> show_data(register r1) {
		return rp.findAll();
	}

	@Override
	public List<book> show_data() {
		
		return rb.findAll();
	}
}
