package Outils;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import entities.Categorie;
import entities.Marque;
import entities.Produit;

/**
 * @author perse
 *
 */
public class TraitementCsv {

	public static List<String> lireFichier() {

		List<String> lignes = null;
		try {

			File file = new File(
					"C:/Users/perse/OneDrive/Bureau/Formation Java Full Stack/Modélisation BDD et normalisation/openFoodFacts.csv");
			lignes = FileUtils.readLines(file, "UTF-8");

			// Suppression ligne d'entête
			lignes.remove(0);

			for (String ligne : lignes) {
				ligne = ligne.replace("\\", "- ");
				ligne = ligne.replace("'", " -");
				ligne = ligne.replace("'", " ");

				// String[] morceaux = ligne.split("\\|", -1);
			}
			return lignes;
		} catch (

		IOException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * Création liste catégories
	 * 
	 * @param lignes
	 * @return setCategorie
	 */

	public static Set<Categorie> ajouterCategorie(List<String> lignes) {
		Set<Categorie> setCategorie = new HashSet<Categorie>();

		for (String ligne : lignes) {
			String[] morceaux = ligne.split("\\t", -1);

			String nomCat = morceaux[0];
			Categorie cat = new Categorie();
			cat.setNom(nomCat);
		}
		return setCategorie;
	}

	/**
	 * Création liste Marques
	 * 
	 * @param lignes
	 * @return setMarque
	 */
	public static Set<Marque> ajouterMarque (List<String> lignes){
		Set<Marque> setMarque = new HashSet<Marque>();

		for (String ligne: lignes) {
			String[] morceaux = ligne.split("\\t", -1);

			String nomMarque = morceaux[1];
			Marque marq = new Marque(nomMarque);
			marq.setNom(nomMarque);
			setMarque.add(marq);
		}
		return setMarque;
	}
	
	/**
	 * Création liste Produit
	 * 
	 * @param lignes
	 * @return setProduit
	 */
	
	public static Set<Produit> ajouterProduit (List<String> lignes){
		Set<Produit> setProduit = new HashSet<Produit>();
		
		for(String ligne: lignes) {
			String[] morceaux = ligne.split("\\t", -1);
			
			String nomCategorie = morceaux[0];
			Categorie categorie = new Categorie();
			categorie.setNom(nomCategorie);
			
			String nomMarque = morceaux[1];
			Marque marque = new Marque();
			marque.setNom(nomMarque);
			
			String nomProduit = morceaux[2];
			Produit produit = new Produit();
			produit.setNom(nomProduit);
			
			String scoreNutritionnel = morceaux[3];
			String ingredientsList = morceaux[4];
			Double energie100g = Double.parseDouble(morceaux[5]);
			Double graisse100g = Double.parseDouble(morceaux[6]);
			Double sucres100g = Double.parseDouble(morceaux[7]);
			Double fibres100g = Double.parseDouble(morceaux[8]);
			Double proteines100g = Double.parseDouble(morceaux[9]);
			Double sel100g = Double.parseDouble(morceaux[10]);
			Double vitA100g = Double.parseDouble(morceaux[11]);
			Double vitD100g = Double.parseDouble(morceaux[12]);
			Double vitE100g = Double.parseDouble(morceaux[13]);
			Double vitK100g = Double.parseDouble(morceaux[14]);
			Double vitC100g = Double.parseDouble(morceaux[15]);
			Double vitB1100g = Double.parseDouble(morceaux[16]);
			Double vitB2100g = Double.parseDouble(morceaux[17]);
			Double vitPP100g = Double.parseDouble(morceaux[18]);
			Double vitB6100g = Double.parseDouble(morceaux[19]);
			Double vitB9100g = Double.parseDouble(morceaux[20]);
			Double vitB12100g = Double.parseDouble(morceaux[21]);
			Double calcium100g = Double.parseDouble(morceaux[22]);
			Double magnesium100g = Double.parseDouble(morceaux[23]);
			Double iron100g = Double.parseDouble(morceaux[24]);
			Double fer100g = Double.parseDouble(morceaux[25]);
			Double betaCarotene100g = Double.parseDouble(morceaux[26]);
			Double presenceHuilePalme = Double.parseDouble(morceaux[27]);
			String allergenesList = morceaux[28];
			String additifsList = morceaux[29];
			
			
		}
		return setProduit;
	}
}
