package fr.diginamic.recensement;

import java.util.Comparator;

/** Comparateur: Permet de tri les régions par rapport à leur nombre d'habitants dans l'ordre décroissant
 * @author Khalil HIMET
 *
 */
public class ComparatorRegion implements Comparator<Region> {

	@Override
	public int compare(Region region1, Region region2) {
		
		if (region1.getPopulation() > region2.getPopulation()) {
			return -1;
		}
	
	else if (region1.getPopulation() < region2.getPopulation()) {
		
		return 1;
	}
		
		return 0;	
	}
	
	

}
