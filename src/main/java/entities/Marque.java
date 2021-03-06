/**
 * 
 */
package entities;

import java.util.Set;

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
	private Set<Produit> produits;

	/**
	 * 
	 * @param morceaux 
	 */
	

	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marque(String nomMarque) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Marque [id=" + id + ", nom=" + nom + ", produits=" + produits + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the produits
	 */
	public Set<Produit> getProduits() {
		return produits;
	}

	/**
	 * @param produits the produits to set
	 */
	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
}
