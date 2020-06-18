package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @author Khalil HIMET
 *
 */
public class TestSetString {

	/**
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		List<String> pays = Arrays.asList("USA", "France", "Allemagne",
				"UK", "Italie", "Japon", "Chine", "Russie", "Inde");
		
		set.addAll(pays);
		
		// Recherche du pays ayant le plus grand nombre de lettre
		Iterator<String> iterator = set.iterator();
		
		String nomPays = null;
		
		// Récuperation du premier élément de la liste
		while (iterator.hasNext()) {
			
			String value = iterator.next();
			
			nomPays = value;
			
			break;
		}
		
		while(iterator.hasNext()) {
			
			String value = iterator.next();
			
			if(value.length() > nomPays.length()) {
				
				nomPays = value;
			}
		}
		
		System.out.println("Le pays qui a le plus grand nombre de lettre est : " + nomPays);
		
		//Suppression de ce pays
		set.remove(nomPays);
		
		System.out.println("Le set après suppression : ");
		for (String str : set) {
			
			System.out.print(str + " ");
		}

	}

}
