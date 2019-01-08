package com.example.demo.restcontroller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.example.demo.service.ICrudService;

/* Creation d'un cotrolleur générique */
public class CrudController<T, ID>  {

	public CrudController() {	
	}

	@Autowired
	private ICrudService<T, ID> service;
	
	@GetMapping
	public List<T> getAllItem(){
		return service.getAllItem();
	}
	
	@PostMapping
	public void addItem(@RequestBody T entity) {
		// TODO Auto-generated method stub
		service.addItem(entity);
	}
	
	@PutMapping
	public void updateItem(@RequestBody T entity) {
		// TODO Auto-generated method stub
		service.updateItem(entity);		
	}
	
	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable ID id) {
		// TODO Auto-generated method stub
		service.deleteItem(id);
	}	
}
