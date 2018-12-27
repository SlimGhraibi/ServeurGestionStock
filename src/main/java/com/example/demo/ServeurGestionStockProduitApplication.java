package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
/*
 * all packages should be in : com.example.demo*/
@SpringBootApplication
public class ServeurGestionStockProduitApplication {

	public static void main(String[] args) {
		
	//Démarrage de spring container
	SpringApplication.run(ServeurGestionStockProduitApplication.class, args);
	
	/**
	 * 
	 * 
	 * **/
    //ConfigurableApplicationContext ctx = SpringApplication.run(ServeurGestionStockProduitApplication.class, args);
	/* creer un bean du repository UserRepository qui est annoté @Repository*/	
	//RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
	
	/* creation des deux roles */
	//Role roleUser = new Role("ROLE_USER");
	//Role roleAdmin = new Role("ROLE_ADMIN");
	
	/* persister les deux roles */
	//roleRepository.save(roleUser);
	//roleRepository.save(roleAdmin);
	
	/* creer un bean du repository UserRepository */
	//UserRepository userRepository = ctx.getBean(UserRepository.class);
	
	/* creation des deux utilisateurs */
	//User user = new User("user", "user",true);
	//User admin = new User("admin", "admin",true);
	
	/* affectation des roles au utilisateurs creés */
	//user.setRoles(Arrays.asList(roleUser));
	//userRepository.save(user);
	
	//admin.setRoles(Arrays.asList(roleAdmin));
	//userRepository.save(admin);
	}
}
