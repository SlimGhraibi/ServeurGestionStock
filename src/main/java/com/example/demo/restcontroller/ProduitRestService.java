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
import com.example.demo.service.IProduitService;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin

public class ProduitRestService  {

	public ProduitRestService() {	
	}

	@Autowired
	private IProduitService produitService;
	
	@GetMapping
	public List<Produit> getProduits(){
		return produitService.getProduits();
	}
	
	@PostMapping
	public void addProduit(@RequestBody Produit produit) {
		// TODO Auto-generated method stub
		produitService.addProduit(produit);
	}
	
	@PutMapping
	public void updateProduit(@RequestBody Produit produit) {
		// TODO Auto-generated method stub
		produitService.updateProduit(produit);		
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id) {
		// TODO Auto-generated method stub
		produitService.deleteProduit(id);
	}	
}
