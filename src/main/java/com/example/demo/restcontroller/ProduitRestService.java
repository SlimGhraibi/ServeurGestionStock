package com.example.demo.restcontroller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Produit;
import com.example.demo.service.ICrudService;


@RestController
@RequestMapping("/api/produit")
@CrossOrigin

public class ProduitRestService extends CrudController<Produit, Long> {
	
	/* on a crer une super class CrudController */
	
	/*
	public ProduitRestService() {	
	}

	@Autowired
	private ICrudService<Produit, Long> produitService;
	
	@GetMapping
	public List<Produit> getProduits(){
		return produitService.getAllItem();
	}
	
	@PostMapping
	public void addProduit(@RequestBody Produit produit) {
		// TODO Auto-generated method stub
		produitService.addItem(produit);
	}
	
	@PutMapping
	public void updateProduit(@RequestBody Produit produit) {
		// TODO Auto-generated method stub
		produitService.updateItem(produit);		
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id) {
		// TODO Auto-generated method stub
		produitService.deleteItem(id);
	}
	*/	
}
