package fr.diginamic.recensement;

import java.util.Comparator;

/** Comparateur: Permet de classer les départements sur leur nombre d'habitants dans l'ordre décroissant
 * @author Khalil HIMET
 *
 */
public class ComparatorDepartement implements Comparator<Departement>{

	@Override
	public int compare(Departement departement1, Departement departement2) {
		
		if (departement1.getPopulation() > departement2.getPopulation()) {
			
			return -1;
		}
		
		else if (departement1.getPopulation() < departement2.getPopulation()) {
			return 1;
		}
		
		return 0;
	}
	
	

}
