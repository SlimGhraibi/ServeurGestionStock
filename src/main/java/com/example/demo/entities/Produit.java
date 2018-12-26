package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Produit {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id; 
private String ref;
private int quantite;
private float prixUnitaire;

public Produit() {
	super();
	// TODO Auto-generated constructor stub
}

public Produit(String ref, int quantite, float prixUnitaire) {
	super();
	this.ref = ref;
	this.quantite = quantite;
	this.prixUnitaire = prixUnitaire;
}

public String getRef() {
	return ref;
}

public void setRef(String ref) {
	this.ref = ref;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public float getPrixUnitaire() {
	return prixUnitaire;
}

public void setPrixUnitaire(float prixUnitaire) {
	this.prixUnitaire = prixUnitaire;
}

public Long getId() {
	return Id;
}

public void setId(Long id) {
	Id = id;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Id == null) ? 0 : Id.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Produit other = (Produit) obj;
	if (Id == null) {
		if (other.Id != null)
			return false;
	} else if (!Id.equals(other.Id))
		return false;
	return true;
}
}
