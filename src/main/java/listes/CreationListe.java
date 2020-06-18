package listes;

import java.util.ArrayList;
import java.util.List;

/** Classe éxécutable qui permet de créer une liste
 * @author Khalil HIMET
 *
 */
public class CreationListe {

	public static void main(String[] args) {
		
		// Creation d'une ArrayList d'entiers et stockage de tous les nombres de 1 à 100
		List<Integer> liste = new ArrayList<Integer>();
		for (int i = 1; i <=100; i++) {
			
			liste.add(i);
			
		}
		
		System.out.println("La taille de la liste est de : " + liste.size());
		
		

	}

}
