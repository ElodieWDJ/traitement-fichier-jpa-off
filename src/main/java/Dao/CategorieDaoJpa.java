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

import entities.Categorie;

/**
 * @author perse
 *
 */
public class CategorieDaoJpa {

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
}
