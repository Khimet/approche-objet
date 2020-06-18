package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

/** Classe éxécutable qui permet la lecture de fichier .csv
 * @author Khalil HIMET
 *
 */
public class LectureFichier {

	/**
	 * @param args non utilisées ici
	 */
	public static void main(String[] args) {
		
		
		
		//Gestion de l'exception bloc Try-Catch:
		try {
			// Déclaration variable de type File qui contient l'emplacement du fichier à lire
			File file = new File("D:/Java-Devops_DIGINAMIC/7 - Java objet/TP/recensement 2016.csv");
			// Creation d'une liste qui va contenir toutes les lignes du Fichier texte
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			// Boucle sur la liste pour afficher le contenu du fichier ligne par ligne
			for (String ligne : lignes) {
				System.out.println(ligne);
			}
			
			// Affichage du nombre de lignes que contient le fichier
			System.out.println("\n Nombre de lignes :" + lignes.size());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		

	}

}
