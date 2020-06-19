package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

/** Classe éxécutable qui permet de faire des manipulation sur le fichier de recensement des villes 2016
 * @author Khalil HIMET
 *
 */
public class Application {

	/**
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		
		List<String> lignes = new ArrayList<>();
		
		//Lecture du fichier recensement
		try {
			// Déclaration variable de type File qui contient l'emplacement du fichier à lire
			File file = new File("C:/Windows/Temp/recensement 2016.csv");
			// Creation d'une liste qui va contenir toutes les lignes du Fichier texte
			lignes = FileUtils.readLines(file, "UTF-8");
			
//			// Boucle sur la liste pour afficher le contenu du fichier ligne par ligne
//			for (String ligne : lignes) {
//				System.out.println(ligne);
//			}
			
//			// Affichage du nombre de lignes que contient le fichier
//			System.out.println("\n Nombre de lignes :" + lignes.size());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//Création de la liste qui va contenir toutes les villes recensées
		List<Ville> villes = new ArrayList<>();
		
		for (String ligne : lignes) {
			
			String[] split = ligne.split(";");
			String codeRegion = split[0];
			String nomRegion = split[1];
			String codeDepartement = split[2];
			String codeCommune = split[5];
			String nomCommune = split[6];
			String population = split[7];
			
			long populationTotale = Long.parseLong(population.replace(" ", "").trim());
			
			
			
			
			
		}

	}

}
