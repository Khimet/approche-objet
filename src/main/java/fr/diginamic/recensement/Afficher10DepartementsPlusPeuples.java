package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.exceptions.RechercheException;

/** Service: Affiche les 10 département français les plus peuplés
 * @author Khalil HIMET
 *
 */
public class Afficher10DepartementsPlusPeuples extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner){
		
		System.out.println("Les 10 départements les plus peuplés sont : ");
		
		// Récupération des villes recensées
		List<Ville> villes = recensement.getVilles();
		
		// Extraction des départements à partir de la liste des villes recensées
		List<Departement> departements = ParserRecensement.extraireDepartement(villes);
		
		// Tri des départements par leur nombre d'habitant dans l'ordre decroissant
		Collections.sort(departements, new ComparatorDepartement());
		
		// Affichage des 10 premiers départements
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(departements.get(i));
		}
		
		
		
		

	}

}
