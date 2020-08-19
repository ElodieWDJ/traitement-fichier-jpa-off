/**
 * 
 */
package entities;

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
@Table(name = "marque")

public class Marque {
	@Id
	private int id;
	@Column(name = "nom", nullable = false, length = 50)
	private String nom;
	@OneToMany(mappedBy = "marque")
	private List<Produit>produits;
	/**
	 * @param id
	 * @param nom
	 * @param produits
	 */
	public Marque() {
		
		
	}
}
