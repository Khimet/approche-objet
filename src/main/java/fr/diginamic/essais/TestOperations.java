package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/** Classe éxécutable qui va permettre de tester les 4 opérations
 * définies dans la classe Operations
 * @author Khalil HIMET
 *
 */
public class TestOperations {

	public static void main(String[] args) {
		
		double addition = Operations.calcul(5, 5, '+');
		
		System.out.println("Resultat de l'addition = " + addition);
		
		double soustraction = Operations.calcul(5, 5, '-');
		
		System.out.println("Resultat de la soustraction = " + soustraction);
		
		double division = Operations.calcul(5, 5, '/');
		
		System.out.println("Résultat de la division = " + division);
		
		double multiplication = Operations.calcul(5, 5, '*');
		
		System.out.println("Résultat de la multiplication = " + multiplication);
		
		

	}

}
