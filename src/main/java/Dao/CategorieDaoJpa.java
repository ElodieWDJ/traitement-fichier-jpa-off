/**
 * 
 */
package Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

import Outils.TraitementCsv;
import entities.Categorie;
import entities.Produit;

/**
 * @author perse
 *
 */
public class CategorieDaoJpa {
	
	private List<Produit> listProdCsv = Parser.traitementCsv(TraitementCsv.lireFichier());

	/**
	 * Retourne la liste des catégories
	 */
	public List<Categorie> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("open-food-facts");
		EntityManager em = emf.createEntityManager();

		List<Categorie> listCatDb = new ArrayList<>();

		if (em != null) {

			String querySelect = "SELECT cat FROM Categorie cat";

			TypedQuery<Categorie> listResultat = em.createQuery(querySelect, Categorie.class);

			if (!listResultat.getResultList().isEmpty()) {

				listCatDb = listResultat.getResultList();

			}

		}
		em.close();
		emf.close();

		return listCatDb;

	}

	/**
	 * Insere toutes les catégories du fichier csv en bdd
	 */

	
	
	public void insertCatCsv() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("open-food-facts");
		EntityManager em = emf.createEntityManager();

		for (Categorie cat : catSuppDoublons) {
			if (cat.getId() == 0) {

				em.getTransaction().begin();

				em.persist(cat);

				em.getTransaction().commit();
			}
		}
		em.close();
		emf.close();
	}
}
