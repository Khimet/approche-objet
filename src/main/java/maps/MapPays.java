package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import fr.diginamic.enumerations.Continent;
import sets.Pays;

/** Classe éxécutable qui permet de manipuler des Map des objets Pays
 * @author Khalil HIMET
 *
 */
public class MapPays {

	/**
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		
		//Créer une map permettant de stocker les instances de pays (valeur) en fonction de leur nom (clé)
		HashSet<Pays> setPays = new HashSet<>();

		setPays.add(new Pays("USA", 332_639_000, 59_495, Continent.AMERIQUE));
		setPays.add(new Pays("France", 67_064_000, 43_551, Continent.EURASIE));
		setPays.add(new Pays("Allemagne", 83_149_300, 50_206, Continent.EURASIE));
		setPays.add(new Pays("UK", 66_436_000, 43_620, Continent.EURASIE));
		setPays.add(new Pays("Italie", 60_317_000, 37_970, Continent.EURASIE));
		setPays.add(new Pays("Japon", 126_010_000, 42_659, Continent.EURASIE));
		setPays.add(new Pays("Chine", 1_400_050_000, 16_624, Continent.EURASIE));
		setPays.add(new Pays("Russie", 146_748_590, 28_712, Continent.EURASIE));
		setPays.add(new Pays("Inde", 1_368_163_000, 5_174, Continent.EURASIE));
		
		HashMap<String, Pays> mapPays = new HashMap<>();
		
		Iterator<Pays> iterator = setPays.iterator();
		
		while(iterator.hasNext()) {
			
			Pays pays = iterator.next();
			
			mapPays.put(pays.getNom(), pays);
		}
		
		// Recherche et suppression du pays qui a le moins d'habitants	
		Iterator<String> cles = mapPays.keySet().iterator();
		
		String clePremiere = cles.next();
		
		while(cles.hasNext()) {
			
			String cle = cles.next();
			Pays value = mapPays.get(cle);
			
			if (value.getNbHabitants() < mapPays.get(clePremiere).getNbHabitants()) {
				
				clePremiere = cle;
			}
			
		}
		
		System.out.println("Exercice 4 TP4 maps - Le pays qui a le moins d'habitants est : " + mapPays.get(clePremiere).getNom());
		
		mapPays.remove(clePremiere);
		
		Iterator<String> cles2 = mapPays.keySet().iterator();
		
		System.out.println("\n\nAffichage de la map après suppression :");
		while(cles2.hasNext()) {
			
			String cle = cles2.next();
			Pays value = mapPays.get(cle);
			
			System.out.println("clé: " + cle + " valeur: " + value);
		}
		
		

	}

}
