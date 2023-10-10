package com.example.demo.repos;





import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.book.book;
@Repository
public interface BookRepository extends JpaRepository<book,Integer> {

	

	


	

}
