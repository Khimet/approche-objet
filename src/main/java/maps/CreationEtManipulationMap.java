package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CreationEtManipulationMap {
	public static void main(String args[]) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		// Ajout des informations pour Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		//Affichage de l'ensemble des clés contenus dans la map
		
		System.out.println("Exercice 2 TP3 maps - Affichage de l'ensemble des clés :");
		Iterator<Integer> cles =  mapVilles.keySet().iterator();
		
		while(cles.hasNext()) {
			
			int value = cles.next();
			
			System.out.print(value + " ");
		}
		
		//Affichage de l'ensemble des valeurs contenues dans la map
		System.out.println("\n\nExercice 2 TP3 maps - Affichage de l'ensemble des valeurs :");
		
		Iterator<String> valeurs = mapVilles.values().iterator();
		while(valeurs.hasNext()){
			
			String value = valeurs.next();
			
			System.out.print(value + " ");
			
		}
		
		//Affichage de la taille de la map
		System.out.println("\n\nExercice 2 TP3 maps - Affichage de la taille de map, taille = " + mapVilles.size());
		
	}
}