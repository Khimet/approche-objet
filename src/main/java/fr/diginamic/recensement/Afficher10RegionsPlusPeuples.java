package fr.diginamic.recensement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.exceptions.RechercheException;
import tri.ComparatorHabitant;

/** Service: Affiche les 10 régions les plus peuplées à partir des données des villes recensées
 * @author Khalil HIMET
 *
 */
public class Afficher10RegionsPlusPeuples extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner){
		
		System.out.println("Les 10 régions les plus peuplées sont :");
		
		// Récupération des villes recensées
		List<Ville> villes = recensement.getVilles();
		
		// Extraction des regions à partir de la liste des villes recensées
		List<Region> regions = ParserRecensement.extraireRegions(villes);
		
		// Tri des régions à partir de leur nombre d'habitants dans l'ordre décroissant
		Collections.sort(regions, new ComparatorRegion());
		
		// Affichage des 10 premières régions
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(regions.get(i));
		}
		
		System.out.println("\n");
		
		
		
		

	}

}
