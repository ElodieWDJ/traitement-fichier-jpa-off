package Outils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * @author perse
 *
 */
public class TraitementCsv {
	public void lireFichier() throws IOException{
		File file = new File("C:/Users/perse/OneDrive/Bureau/Formation Java Full Stack/Modélisation BDD et normalisation/openFoodFacts.csv");
		List<String> lignes = FileUtils.readLines(file, "UTF-8");
		
		for (String ligne : lignes ) {
			String[] morceaux = ligne.split("\\|", -1);
		}
	}
}
