package maps;

import java.util.HashMap;

/**
 * @author Khalil HIMET
 *
 */
public class CreationMap {

	/**
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		// Création d'une map pour stocker les informations de salaire en fonction du prénom de la personne
		
		HashMap<String, Double> mapSalaires = new HashMap<>();
		
		mapSalaires.put("Paul", (double) 1750);
		mapSalaires.put("Hicham", (double) 1825);
		mapSalaires.put("Yu", (double) 2250);
		mapSalaires.put("Ingrid", (double) 2015);
		mapSalaires.put("Chantal", (double) 2418);
		
		System.out.println("Exercice 1 TP3 maps - La taille de la map est : " + mapSalaires.size());
		
		

	}

}
