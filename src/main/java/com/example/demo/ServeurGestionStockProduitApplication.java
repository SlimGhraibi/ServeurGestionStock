package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Produit;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.RoleEnum;
/*
 * all packages should be in : com.example.demo*/
@SpringBootApplication
public class ServeurGestionStockProduitApplication {

	public static void main(String[] args) {
		
	//Démarrage de spring container
	SpringApplication.run(ServeurGestionStockProduitApplication.class, args);
	/*
	ConfigurableApplicationContext ctx = SpringApplication.run(ServeurGestionStockProduitApplication.class, args);
	
	ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
	
	produitRepository.save(new Produit("Livre", 50, 20));
	produitRepository.save(new Produit("Cahier", 200, 5.25f));
	produitRepository.save(new Produit("Stylo", 500, 2.10f));
	
	RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
	
	Role roleUser = new Role(RoleEnum.ROLE_USER);
	Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
	
	roleRepository.save(roleUser);
	roleRepository.save(roleAdmin);
	
	UserRepository userRepository = ctx.getBean(UserRepository.class);
	
	User user = new User("user", "user", true);
	user.setRoles(Arrays.asList(roleUser));
	
	userRepository.save(user);
	
	User admin = new User("admin", "admin", true);
	admin.setRoles(Arrays.asList(roleUser, roleAdmin));
	
	userRepository.save(admin);
	*/
	}
}
