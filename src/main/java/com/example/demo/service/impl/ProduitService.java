package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Produit;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.service.ICrudService;

@Service
public class ProduitService implements ICrudService<Produit, Long> {

	@Autowired
	private ProduitRepository produitRepository;


	@Override
	public List<Produit> getAllItem() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public void addItem(Produit entity) {
		// TODO Auto-generated method stub
		produitRepository.save(entity);
		
	}

	@Override
	public void updateItem(Produit entity) {
		// TODO Auto-generated method stub
		produitRepository.save(entity);
	}

	@Override
	public void deleteItem(Long id) {
		// TODO Auto-generated method stub
		Produit p = new Produit();
		p.setId(id);
		produitRepository.delete(p);
	}
	
	/*
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		// TODO Auto-generated method stub
		produitRepository.save(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		// TODO Auto-generated method stub
		produitRepository.save(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		Produit p = new Produit();
		p.setId(id);
		produitRepository.delete(p);
	}

*/
	
}
