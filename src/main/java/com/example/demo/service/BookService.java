package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;


import com.example.demo.book.book;
import com.example.demo.repos.BookRepository;

@Service
public class BookService {
	@Autowired
	public BookRepository br;
	
	public void saveData(book bj) {
		br.save(bj);
	}
	public List<book> getAllBook(){
		return br.findAll();
	}
	
	

}
