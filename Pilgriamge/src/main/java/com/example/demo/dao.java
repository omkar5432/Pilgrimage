package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class dao implements service {

	@Autowired
	repo rp;
	
	@Override
	public void register_data(register r) {
		rp.save(r);
		
	}

}
