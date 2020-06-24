package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.exceptions.RechercheException;

/** Service: Affiche le nombre d'habitant d'une ville française donnée
 * @author Khalil HIMET
 *
 */
public class RecherchePopulationVille extends MenuService {

	/** Constructeur
	 * 
	 */
	public RecherchePopulationVille() {
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) throws RechercheException{
		
		
		System.out.println("Entrez le nom de la ville à rechercher :");
		
		List<Ville> villes = recensement.getVilles();
		
		// Récupération du nom de la ville recherchée
		String villeRequete = scanner.nextLine();
		// Vérification si la ville entrée est connu du fichier de recensement
		// Si le nom est valide, le nombre d'habitant de cette ville est récupéré
		int compteur = 0;
		int populationTotale = 0;
		
		for (Ville ville : villes) {
			
			if (villeRequete.toLowerCase().equals(ville.getNomCommune().toLowerCase())) {
				
				populationTotale = ville.getNbPopTotale();
				
				compteur++;
			}
		}
		
		if (compteur == 0) {
			
			throw new RechercheException("Le nom de la ville que vous avez entré n'est pas recensé ou n'existe pas.");
		} else {
			// Affichage du nombre d'habitant pour cette ville
			System.out.println("La ville de " + villeRequete + " a une population de "
					+ populationTotale + " habitants.");
			
		}
		

	}

}
