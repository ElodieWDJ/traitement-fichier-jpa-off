/**
 * 
 */
package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author perse
 *
 */
@Entity
@Table(name = "ingredient")

public class Ingredient {
	@Id
	private int id;
	
	@Column(name = "nom", nullable = false, length = 255)
	private String nom;
	
	@ManyToMany
	@JoinTable(name="compo",
			joinColumns = @JoinColumn(name="id_ingr",referencedColumnName="id"),
	        inverseJoinColumns=@JoinColumn(name="id_produit", referencedColumnName="id")
	   )
	   private Set<Produit> produits;
	
	public Ingredient() {
		super();
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", nom=" + nom + ", produits=" + produits + "]";
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
