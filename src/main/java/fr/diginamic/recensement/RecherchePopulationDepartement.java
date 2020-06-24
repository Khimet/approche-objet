package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.exceptions.RechercheException;

/** Classe de service permettant de trouver le nombre de population 
 * pour un département donné
 * @author Khalil HIMET
 *
 */
public class RecherchePopulationDepartement extends MenuService {

	/** Constructeur
	 * 
	 */
	public RecherchePopulationDepartement() {
		
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) throws RechercheException {
		
		// Récupération du code de département à rechercher
		System.out.println("Veuillez entrer le code du departement à rechercher : ");
		String codeDepartement = scanner.nextLine();
		
		// Récupération des villes recensées
		List<Ville> villes = recensement.getVilles();
		
		// Vérification que le code de departement soit valide/existant
		int compteur = 0;
		int populationTotale = 0; // Si le code est valide, la somme des populations villes qui composent ce département
								  // sont calculés dans le même temps
		
		for (Ville ville : villes) {
			
			if (codeDepartement.equalsIgnoreCase(ville.getCodeDepartment())) {
				
				compteur++;
				populationTotale += ville.getNbPopTotale();
			}
		}
		
		if (compteur == 0) {
			
			throw new RechercheException("Le code entré est inconnu, veuillez entrer un code de department valide :");
			
		} else {
			// Affichage de la population totale du département recherché
			System.out.println("La population du département " + codeDepartement + " est de " + populationTotale + " habitants.");
		}

	}

}
