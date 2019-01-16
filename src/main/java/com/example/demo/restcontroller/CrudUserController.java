package com.example.demo.restcontroller;

import java.util.Arrays;
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

import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.ICrudService;
import com.example.demo.util.RoleEnum;

@RestController
@RequestMapping("/crud_user")
public class CrudUserController extends CrudController<User, Long>  {
    
	@Autowired
	private RoleRepository rolerepository;

	/* Redéfinir la méthode get pour seter les mot de passe à null */
	public List<User> getAllItem(){
		List<User> users = super.getAllItem();
		users.forEach(user->{
			user.setPassword(null);
		});
		return users;
	}
	
	/* Redéfinir la méthode add pour la creation des roles d'un nouveau utilisateur */
	public void addItem(@RequestBody User user) {
		// TODO Auto-generated method stub
		Role role = rolerepository.findByName(RoleEnum.ROLE_USER.getName());
		user.setRoles(Arrays.asList(role));
        user.setEnable(true);
		super.addItem(user);
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
