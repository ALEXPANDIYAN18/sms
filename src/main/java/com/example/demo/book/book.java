package com.example.demo.book;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class book {
	
	
		
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Id
		private int id;
		@Column(name="Name")
		private String name;
		@Column(name="Author")
		private String author;
		@Column(name="price")
		private String price;

		public book(String name, String author, String price) {
			super();
			
			this.name = name;
			this.author = author;
			this.price = price;
		}
		
		public book() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		
		
	}



