package listes;

import java.util.ArrayList;
import java.util.List;

/** Classe éxécutable qui permet de faire de la fusion de listes
 * @author Khalil HIMET
 *
 */
public class FusionListe {
	public static void main(String args[]) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
//TODO Développements à réaliser ci-dessous
		
		// Création d'une liste3 qui contient l'ensemble des données des 2 listes précédentes
		
		List<String> liste3 = new ArrayList<String>();
		
		for (String couleur : liste1) {
			
			liste3.add(couleur);
		}
		
		for (String couleur : liste2) {
			
			liste3.add(couleur);
		}
		
		System.out.println("La taille de la liste3 est de : " + liste3.size());
	}
	
}