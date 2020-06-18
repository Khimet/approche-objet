package fr.diginamic.essais;

import java.util.Arrays;

import fr.diginamic.operations.CalculMoyenne;

/** Classe éxécutable qui permet de tester la classe CalculMoyenne
 * @author Khalil HIMET
 *
 */
public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne tableau = new CalculMoyenne();
		
		double[] array = {1, 4, 5, 7, 8, 9, 63, 47, 2};
		
		// Utilisation de la méthode ajout pour remplir le tableau en attribut d'instance
		for(double nb : array) {
			
			tableau.ajout(nb);
		}
		
		// Vérification et comparaison des deux tableaux
		System.out.println("Test si Le tableau en attribut d'instance et array sont identiques : " +
		Arrays.equals(array, tableau.getTableau()));
		System.out.println("La méthode ajout fonctionne correctement");
		
		// Teste de la méthode calcul
		System.out.println("Nous avons donc le tableau suivant: ");
		
		for(double nb : tableau.getTableau()) {
			
			System.out.print(nb + " ");
		}
		
		System.out.println('\n' + "La moyenne des éléments de ce tableau est : " + tableau.calcul());
		System.out.println("La méthode fonctionne correctement");
		
		

	}

}
