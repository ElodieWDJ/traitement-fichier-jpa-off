package controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Outils.Connexion;
import Outils.TraitementCsv;
import entities.Produit;

public class IntegrationOpenFoodFacts {

	public IntegrationOpenFoodFacts() {
		List<String> produits = TraitementCsv.lireFichier();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = factory.createEntityManager();
		
		Connexion.insertion(produits, factory);
		
		em.close();
		factory.close();
		
	
	}

}
