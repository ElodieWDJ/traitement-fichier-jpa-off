/**
 * 
 */
package Outils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author perse
 *
 */

public class Connexion {
	EntityManagerFactory factory;
	EntityManager em;
	private static final String PERSISTENCENAME = "pu_essai";

	public void connexionBdd() {
		factory = Persistence.createEntityManagerFactory(Connexion.PERSISTENCENAME);
		em = factory.createEntityManager();

	}

	public void closeConnexion() {
		em.close();
		factory.close();
	}

}
