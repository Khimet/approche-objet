package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.exceptions.RechercheException;

/** Service: Affiche les 10 villes les plus peuplées de France
 * @author Khalil HIMET
 *
 */
public class Afficher10VillesPlusPeuplesFrance extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		// Récupération des villes recensées
		List<Ville> villesRecensement = recensement.getVilles();
		
		// Tri des villes sur la population par ordre décroissant
		Collections.sort(villesRecensement, new ComparatorVille());
		
		// Affichage des 10 premières villes
		System.out.println("Les 10 villes les plus peuplées de France sont :");
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(villesRecensement.get(i));
		}
		
		System.out.println("\n");

	}

}
