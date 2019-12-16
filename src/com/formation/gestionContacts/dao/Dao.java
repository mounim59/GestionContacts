package com.formation.gestionContacts.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.formation.gestionContacts.model.Personne;

@Singleton
public class Dao implements Idao{

	private static final Logger LOG = Logger.getLogger("contacts");
	
	@PersistenceContext(name = "contacts")
	private EntityManager em;
	
	@Override
	public int savePersonne(Personne personne) {

		em.persist(personne);
		return 0;
	}

	@Override
	public int updatePersonne(Personne personne) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePersonne(Personne personne) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Personne getPersonneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Personne getPersonneByPrenom(String nom, String prenom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
