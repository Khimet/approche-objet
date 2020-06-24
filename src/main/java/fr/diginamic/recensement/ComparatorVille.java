package fr.diginamic.recensement;

import java.util.Comparator;

/** Comparateur: Permet de trier les villes sur en fonction de leur population dans l'ordre décroissant
 * @author Khalil HIMET
 *
 */
public class ComparatorVille implements Comparator<Ville>{

	@Override
	public int compare(Ville ville1, Ville ville2) {
		
		if (ville1.getNbPopTotale() > ville2.getNbPopTotale()) {
			
			return -1;
		}
		
		else if (ville1.getNbPopTotale() < ville2.getNbPopTotale()) {
			
			return 1;
		}
		
		return 0;
	}

}
