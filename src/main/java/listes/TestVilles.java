package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/** Classe éxécutable qui permet de manipuler des listes contenant des villes
 * @author Khalil HIMET
 *
 */
public class TestVilles {

	public static void main(String[] args) {
		
		// Création d'une ArrayList de villes:
		List<Ville> liste = new ArrayList<Ville>();
		liste.add(new Ville("Nice", 343000));
		liste.add(new Ville("Carcassonne", 47800));
		liste.add(new Ville("Narbonne", 53400));
		liste.add(new Ville("Lyon", 484000));
		liste.add(new Ville("Foix", 9700));
		liste.add(new Ville("Pau", 77200));
		liste.add(new Ville("Marseille", 850700));
		liste.add(new Ville("Tarbes", 40600));
		
		//Recherche de la Ville la plus peuplée
		ListIterator<Ville> iterator = liste.listIterator();
		
		long max = liste.get(0).getNbHabitants(); /* Initialisation de la valeur max avec la 1ere 
												   * valeur de la liste*/
		
		String nomVille = liste.get(0).getNom(); /* Initialisation de la variable nomVille qui 
												  *va nous permettre de stocker le nom de la ville 
												  *la moins peuplée.*/
		
		while(iterator.hasNext()) {
			
			Ville next = iterator.next();
			
			if (next.getNbHabitants() > max) {
				
				max = next.getNbHabitants();
				nomVille = next.getNom();
			}
			
		}
		
		System.out.println("La ville la plus peuplée est " + nomVille + " avec " + max + " habitants.");
		
		//Suppresion de la ville la moins peuplée
		ListIterator<Ville> iterator2 = liste.listIterator();
		
		long min = liste.get(0).getNbHabitants(); // Initialisation de la valeur minimale
		
		int index = 0; // Initialisation de la valeur index à partir duquel on supprimera l'élément de la liste
		
		while(iterator2.hasNext()) {
			
			Ville next = iterator2.next();
			
			if(next.getNbHabitants() < min) {
				
				min = next.getNbHabitants();
				index = iterator2.nextIndex() - 1;
			}
			
		}
		
		liste.remove(index);
		System.out.println("Liste après supression :");
		for (Ville v : liste) {
			System.out.println(v.getNom() + " " + v.getNbHabitants());
		}
		
		// Modification, mettre le nom des villes de plus de 100 000 hab en majuscules
		for(int i = 0; i < liste.size(); i++) {
			
			if (liste.get(i).getNbHabitants() > 100000) {
				
				Ville ville = liste.get(i);
				
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		//Affichage des résultats
		System.out.println("Affichage de la liste après la mise en majuscule : ");
		for(Ville v : liste) {
			
			System.out.println(v.getNom() + " " + v.getNbHabitants());
		}
		
		
		
		
	}

}
