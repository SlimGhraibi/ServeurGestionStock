package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Produit;
/* creation d'une interface génériqe pour toute les service : c'est pas la peine de creer une interface spécifique pour chaque service */
public interface ICrudService<T, ID> {
	
	List<T> getAllItem();
	void addItem(T entity);
	void updateItem(T entity);
	void deleteItem(Long id);

}
