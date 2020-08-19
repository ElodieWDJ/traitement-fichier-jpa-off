/**
 * 
 */
package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author perse
 *
 */

@Entity
@Table(name = "categorie")

public class Categorie {
	@Id
	private int id;
	@Column(name = "nom", nullable = false, length = 50)
	private String nom;
	@OneToMany(mappedBy = "categorie")
	private List<Produit>produits;
	
	/**
	 * Constructeur
	 */
	public Categorie() {
		produits = new ArrayList<>();
	}

}
