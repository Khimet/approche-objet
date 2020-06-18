package tri;

import java.util.Comparator;

import sets.Pays;

/**
 * @author Khalil HIMET
 *
 */
public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays pays1, Pays pays2) {
		
		if (pays1.getNbHabitants() > pays2.getNbHabitants()) {
			
			return 1;
		}
		
		else if (pays1.getNbHabitants() < pays2.getNbHabitants()) {
			return -1;
		}
		
		return 0;
	}
	
	

}
