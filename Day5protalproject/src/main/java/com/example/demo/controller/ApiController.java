package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.ApiService;
@RestController
public class ApiController {
	@Autowired
	ApiService service;
	
	@PostMapping("/book")
	public String add(@RequestBody Book book)
	{
		return service.addBook(book);
	}
	
	@GetMapping("/book")
	public List<Book> get()
	{
		return service.getBook();
	}
	@PutMapping("/book")
	public String update(@RequestBody Book book)
	{
		return service.updateBook(book);
	}
	
	@DeleteMapping("/book")
		public String delete(@RequestParam int id)
		{
		return service.deleteBookById(id);
		}
	



}
