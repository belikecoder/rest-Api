package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Chield;
import com.example.demo.repository.ChieldRepo;
@Service
public class ApiService {
	@Autowired
	ChieldRepo repository;
	public String addBaby(Chield baby) 
	{
		repository.save(baby);
		return "Added baby";
	}
	public List<Chield> getBaby()
	{
		return repository.findAll();
	}
	public List<Chield> getBabySorted(String field)
	{
		return repository.findAll(Sort.by(Sort.Direction.ASC, field));
	}
	public List<Chield> getBabyWithPagination(@PathVariable int offset, @PathVariable int pageSize)
	{
		Page<Chield> page=repository.findAll(PageRequest.of(offset,pageSize));
		return page.getContent();
	}
	public List<Chield> getBabyWithSortingAndPagination(int offset,int pageSize,String field)
	{
		Pageable paging = PageRequest.of(offset,pageSize,Sort.by(field));
		Page<Chield> page=repository.findAll(paging);
		return page.getContent();
	}
}
	   



