/**
 * 
 */
package Outils;

import java.util.ArrayList;
import java.util.List;

import entities.Categorie;
import entities.Marque;
import entities.Produit;


/**
 * @author perse
 *
 */
public class Parser {
public static List<Produit> parseFichier(List<String> lignesFichier) {
		
		List<Produit> listProduits = new ArrayList<Produit>();
		
//		Suppression de la premiere ligne car inutile
		lignesFichier.remove(0);
		
//		Parcours de chaque lignes du fichier
		for (String ligne : lignesFichier) {
			
			String ligneNet = ligne.replaceAll("'", " ");

			
//			Decoupages de la ligne en plusieurs morceaux correspondant aux attributs d'un produit
			String[] morceaux = ligneNet.split("\\|", -1);
			
			Categorie categorie = new Categorie(morceaux[0]);
			Marque marque = new Marque(morceaux[1]);
			String nom = morceaux[2];
			String grade = morceaux[3];
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
			
			Produit produit = new Produit();
			
			listProduits.add(produit);
			
		}
		
		return listProduits;
		
	}

}
