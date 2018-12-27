package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.User;
import com.example.demo.service.ICrudService;

@RestController
@RequestMapping("/crud_user")
public class CrudUserController {

	@Autowired
	private ICrudService<User, Long> userService;
	
	@GetMapping
	public List<User> getProduits(){
		return userService.getAllItem();
	}
	
	@PostMapping
	public void addProduit(@RequestBody User user) {
		// TODO Auto-generated method stub
		userService.addItem(user);
	}
	
	@PutMapping
	public void updateProduit(@RequestBody User user) {
		// TODO Auto-generated method stub
		userService.updateItem(user);		
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id) {
		// TODO Auto-generated method stub
		userService.deleteItem(id);
	}	
	
}
