package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Produit;
import com.example.demo.entities.User;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserService implements ICrudService<User, Long> {

	@Autowired
	private UserRepository userRepository;
	

	@Override
	public List<User> getAllItem() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void addItem(User entity) {
		// TODO Auto-generated method stub
		userRepository.save(entity);
		
	}

	@Override
	public void updateItem(User entity) {
		// TODO Auto-generated method stub
		userRepository.save(entity);
	}

	@Override
	public void deleteItem(Long id) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(id);
		userRepository.delete(user);
	}
	
	/*
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		// TODO Auto-generated method stub
		userRepository.save(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		// TODO Auto-generated method stub
		userRepository.save(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		Produit p = new Produit();
		p.setId(id);
		userRepository.delete(p);
	}
	*/
}
