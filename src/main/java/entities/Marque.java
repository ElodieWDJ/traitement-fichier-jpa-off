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
@Table(name = "marque")

public class Marque {
	@Id
	private int id;
	@Column(name = "nom", nullable = false, length = 50)
	private String nom;
	@OneToMany(mappedBy = "marque")
	private List<Produit> produits;

	/**
	 * Constructeur
	 * @param morceaux 
	 */
	public Marque(String morceaux) {
		produits = new ArrayList<Produit>();

	}

	public Marque() {
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
	public List<Produit> getProduits() {
		return produits;
	}

	/**
	 * @param produits the produits to set
	 */
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
}
