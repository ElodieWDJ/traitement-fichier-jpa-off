/**
 * 
 */
package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author perse
 *
 */
@Entity
@Table(name = "produit")

public class Produit {
	@Id
	private int id;
	@Column(name = "nom", nullable = false, length = 255)
	private String nom;
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private Categorie categorie;
	@ManyToOne
	@JoinColumn(name = "id_marque")
	private Marque marque;
	
	/**
	 * Constructeur
	 */
	
	public Produit() {
		
	}
}
