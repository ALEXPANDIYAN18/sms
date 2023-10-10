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
	
	
}
