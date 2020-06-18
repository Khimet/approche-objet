package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/** Classe éxécutable qui permet de manipuler des listes contenant des noms de villes
 * @author Khalil HIMET
 *
 */
public class TestListeString {

	public static void main(String[] args) {
		
		List<String> liste = new ArrayList<String>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");
		
		
		// Recherche de la ville dans cette liste qui a le plus grand nombre de lettres
		int max = 0;
		String result = null;
		
		for (String ville : liste) {
			
			
			if(ville.length() > max) {
				
				max = ville.length();
				
				result = ville;
			}
		}
		
		System.out.println("La ville de cette liste qui a le plus grand nombre de lettres est : " + result);
		
		//Modification de la liste pour mettres tous les noms de villes en majuscules
		ListIterator<String> iterator = liste.listIterator();
		while(iterator.hasNext()) {
			
			String next = iterator.next();
			
			iterator.set(next.toUpperCase());
			
		}
		
		//Vérification de la modification
		System.out.println("Liste après la mise en majuscule : ");
		for(String ville : liste) {
			
			System.out.print(ville + " ");
		}
		
		

	}

}
