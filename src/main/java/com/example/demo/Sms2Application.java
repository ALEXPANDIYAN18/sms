package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.book.book;
import com.example.demo.repos.BookRepository;

@SpringBootApplication
public class Sms2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sms2Application.class, args);
	}
	
	@Autowired
	BookRepository brep;
	
	public void run(String... args) throws Exception {
		book b1=new book("kangal thedi","author","2000");
		brep.save(b1);
		
		
		
	}
}
