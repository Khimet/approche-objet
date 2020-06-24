package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.exceptions.RechercheException;

/** Service: Affiche les 10 villes les plus peuplés pour un département français donné
 * @author Khalil HIMET
 *
 */
public class Afficher10VillesDepartement extends MenuService {
	

	@Override
	public void traiter(Recensement recensement, Scanner scanner) throws RechercheException {
		
		// Récupération des villes recensées
		List<Ville> villesRecensement = recensement.getVilles();
		
		// Extraction des départments français à partir de la liste des villes recensées
		List<Departement> departements = ParserRecensement.extraireDepartement(villesRecensement);
		
		System.out.println("\nVeuillez entrer un numéro de code du département :");
		
		// Récupération du code de départment entré par l'utilisateur
		String choixDepartement = scanner.nextLine();
		
		// Vérification si le code entré est valide ou existant
		int compteur = 0;
		int index = 0; // Si le code est valide on enregistre dans le même temps l'index dans la liste du département correspondant
		
		for (int i = 0; i < departements.size(); i++) {
			
			Departement departement = departements.get(i);
			
			if (choixDepartement.equalsIgnoreCase(departement.getCodeDepartement())) {
				
				compteur++;
				index = i;
			}
		}
		
		if (compteur == 0) {
			
			throw new RechercheException("\nVeuillez entrez un code de departement valide :");
		} else {
			
			// Récupération du département recherché
			Departement departement = departements.get(index);
			
			// Récupération des villes de ce département
			List<Ville> villesDepartement = departement.getVillesDepartement();
			
			// Tri des villes par rapport à leur nombre d'habitants dans l'ordre décroissant
			Collections.sort(villesDepartement, new ComparatorVille());
			
			// Affichage des 10 premières villes
			System.out.println("\nLes 10 villes les plus peuplées du département " + choixDepartement + " sont:");
			
			for (int i =0; i <= 10; i++) {
				
				System.out.println(villesDepartement.get(i));
			}
			
			
		}
		
		System.out.println("\n");


	}

}
