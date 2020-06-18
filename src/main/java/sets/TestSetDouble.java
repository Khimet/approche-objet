package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author Khalil HIMET
 *
 */
public class TestSetDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashSet<Double> set = new HashSet<Double>();
		
		Double[] array = {1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01};
		
		List<Double> liste = Arrays.asList(array);
		
		set.addAll(liste);
		
		//Affichage de tous les éléments de la collection
		for (Double nb : set) {
			
			System.out.print(nb + " ");
		}
		
		//Recherche du plus grand élément de la collection
		Double max = Double.MIN_VALUE;
		
		for (Double nb : set) {
			
			if (nb > max) {
				
				max = nb;
			}
		}
		
		System.out.println('\n' + "Le plus grand élément de la collection est : " + max);
		
		//Suppression du plus petit élément de la collection
		Double min = Double.MAX_VALUE;
		for (Double nb : set) {
			
			if (nb < min) {
				
				min = nb;
			}
			
		}
		
		System.out.println("Le plus petit élément est : " + min);
		
		set.remove(min);
		
		System.out.println("Le set après suppression : ");
		for (Double nb : set) {
			
			System.out.print(nb + " ");
		}
		

	}

}
