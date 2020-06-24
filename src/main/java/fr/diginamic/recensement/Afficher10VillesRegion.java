package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.exceptions.RechercheException;

/** Service: affiche les 10 premières villes d'une région française donnée
 * @author Khalil HIMET
 *
 */
public class Afficher10VillesRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) throws RechercheException {
		
		// Récupération des villes rencensées
		List<Ville> villesRecensement = recensement.getVilles();
		
		// Extraction des régions françaises à partir de la liste des villes recensées
		List<Region> regions = ParserRecensement.extraireRegions(villesRecensement);
		
		// Récupération du code de la région recherchée
		System.out.println("\nVeuillez entre le numéro de code de la région recherchée :");
		
		String choixRegion = scanner.nextLine();
		
		// Vérification si le code entré est valide et/ou existant
		int compteur = 0;
		int index = 0; // On enregistre dans le même temps l'index de la région recherchée si le code entré est valide
		
		for (int i = 0; i < regions.size(); i++) {
			
			Region region = regions.get(i);
			
			if (choixRegion.equalsIgnoreCase(region.getCodeRegion())){
				
				compteur++;
				index = i;
			}
		}
		
		if (compteur == 0) {
			
			throw new RechercheException("Veuillez entrez un code de région valide :");
		} else {
			
			// Récupération de la ville recherchée
			Region region = regions.get(index);
			
			// Récupérations de la liste des villes qui composent cette région
			List<Ville> villesRegion = region.getVilles();
			
			// Tri des villes sur la population dans l'ordre décroissant
			Collections.sort(villesRegion, new ComparatorVille());
			
			// Affichage des 10 premières villes
			System.out.println("Les 10 villes les plus peuplées de la région " + region.getNomRegion() + " sont:");
			
			for(int i = 0; i <= 10; i++) {
				
				System.out.println(villesRegion.get(i));
			}
		}
		
		System.out.println("\n");

	}
	
	

}
