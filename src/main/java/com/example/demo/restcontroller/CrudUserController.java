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
public class CrudUserController extends CrudController<User, Long>  {
    
/* le problème dans la récupération des users c'est q'on récupère le mot de passe, 
 * on va fixer ca avec la redéfinition de cette méthode est fixé le passeword à null */
	
	public List<User> getAllItem(){
		List<User> users = super.getAllItem();
		users.forEach(user->{
			user.setPassword(null);
		});
		return users;
	}
	
	/* on a crer une super class CrudController */
	
	/*
	@Autowired
	private ICrudService<User, Long> userService;
	
	@GetMapping
	public List<User> getUsers(){
		return userService.getAllItem();
	}
	
	@PostMapping
	public void addUsers(@RequestBody User user) {
		// TODO Auto-generated method stub
		userService.addItem(user);
	}
	
	@PutMapping
	public void updateUsers(@RequestBody User user) {
		// TODO Auto-generated method stub
		userService.updateItem(user);		
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserst(@PathVariable Long id) {
		// TODO Auto-generated method stub
		userService.deleteItem(id);
	}	
	*/
}
