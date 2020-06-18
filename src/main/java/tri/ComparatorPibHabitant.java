package tri;

import java.util.Comparator;

import sets.Pays;

/**
 * @author Khalil HIMET
 *
 */
public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays pays1, Pays pays2) {
if (pays1.getPibHab() > pays2.getPibHab()) {
			
			return 1;
		}
		
		else if (pays1.getPibHab() < pays2.getPibHab()) {
			return -1;
		}
		return 0;
	}
	
	

}
