package com.example.demo.control;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.book.book;
import com.example.demo.repos.BookRepository;
import com.example.demo.service.BookService;



@Controller
public class studentController {
	@Autowired
	private BookService service;
	@Autowired
	private BookRepository service1;


	@GetMapping("/sms")
	public String run(Model model) {
		
		return "students";
	}
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
	@GetMapping("/available_book")
	public ModelAndView booklist() {
		List<book> list=service.getAllBook();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("bookList");
		mv.addObject("book",list);
		return new ModelAndView("bookList","book",list);
	}
	@PostMapping("/save")
	public String addBooking(Model model, @ModelAttribute book b) {
		service.saveData(b);
		return "redirect:/available_book";
	}



	
	
		
		

}
