package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {
	public static void main(String args[]) {
// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();

		// Map3 doit contenir l'ensemble des données de map1 et map2 avec les mêmes clés
		// et mêmes valeurs
		Iterator<Integer> clesMap1 = map1.keySet().iterator();

		while (clesMap1.hasNext()) {

			Integer cle = clesMap1.next();
			String value = map1.get(cle);

			map3.put(cle, value);

		}

		Iterator<Integer> clesMap2 = map2.keySet().iterator();

		while (clesMap2.hasNext()) {

			Integer cle = clesMap2.next();
			String value = map2.get(cle);

			map3.put(cle, value);

		}
		
		// CORRECTIF: la methode map.putAll() est plus pratique à utiliser
		
		//Affichage de map3
		System.out.println("Exercice 3 TP3 maps - Affichage de map3 :");
		Iterator<Integer> clesMap3 = map3.keySet().iterator();
		
		while (clesMap3.hasNext()) {
			
			Integer key = clesMap3.next();
			String value = map3.get(key);
			
			System.out.println("clé: " + key + " valeur: " + value);
		}
	}
}