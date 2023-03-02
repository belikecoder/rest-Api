package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;
@Service
public class ApiService {
	@Autowired
	BookRepo repository;
	public String addBook(Book book) 
	{
		repository.save(book);
		return " Book Added";
	}
	public List<Book> getBook()
	{
		return repository.findAll();
	}
	public String updateBook(Book book)
	{
		repository.save(book);
		return " Book is Updated ";
	}
	public String deleteBookById(int id) {
	    repository.deleteById(id);
	    return "Book Removed";
	}

}
