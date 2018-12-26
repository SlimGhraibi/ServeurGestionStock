package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Produit;
import com.example.demo.repository.ProduitRepository;
/*
 * all packages should be in : com.example.demo*/
@SpringBootApplication
public class ServeurGestionStockProduitApplication {

	public static void main(String[] args) {
		//Démarrage de spring container
		SpringApplication.run(ServeurGestionStockProduitApplication.class, args);
	
	}
}
