package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.exceptions.RechercheException;

/** Classe service qui renseigne sur le nombre de population pour une région donnée
 * @author Khalil HIMET
 *
 */
public class RecherchePopulationRegion extends MenuService {

	/** Constructeur
	 * 
	 */
	public RecherchePopulationRegion() {
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) throws RechercheException {
		
		// Récupération du code de la région recherchée
		System.out.println("Veuillez entrer le code de la région à rechercher :");
		String codeRegion = scanner.nextLine();
		
		// Récupération des villes recensées
		List<Ville> villes = recensement.getVilles();
		
		// Vérification que le code entré est bien valide
		// Si le code est valide, la population totale est calculé à partir de la somme des populations des villes
		// qui composent cette région. On récupère également à partir du numéro de code le nom de la région.
		int compteur = 0;
		int populationTotale = 0;
		String nomRegion = null;
		
		for (Ville ville : villes) {
			
			if (codeRegion.equalsIgnoreCase(ville.getCodeRegion())) {
				
				compteur++;
				populationTotale += ville.getNbPopTotale();
				nomRegion = ville.getNomRegion();
				
			}
		}
		
		if (compteur == 0) {
			
			throw new RechercheException("Le code de région entré est inconnu, entrez un code de région valide.");
			
		} else {
			// Affichage de la popluation totale de la région recherchée
			System.out.println("La population pour la région " + nomRegion + " est de " + populationTotale + " habitants.");
			
		}

	}

}
