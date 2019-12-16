package com.formation.gestionContacts.dao;

import java.util.List;

import com.formation.gestionContacts.model.Personne;

public interface Idao {
 
	int savePersonne(Personne personne);
	int updatePersonne(Personne personne);
	int deletePersonne(Personne personne);
	
	Personne getPersonneById(int id);
	Personne getPersonneByPrenom(String nom, String prenom);
	List<Personne> getAll();
	
}
