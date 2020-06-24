package fr.diginamic.testexceptions;

import fr.diginamic.enumerations.Continent;
import sets.Pays;

/** Classe éxécutable qui permet de manipuler les gestions d'exceptions
 * @author Khalil HIMET
 *
 */
public class TestReflectionUtils {

	/**
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		// Création d'instance de Pays et tests de la méthode afficherAttributs de la classe ReflectionUtils
		Pays pays = new Pays("France", 60_000_000, 40_000, Continent.EURASIE);
		
		try {
			
			ReflectionUtils.afficherAttributs(null);
			
		} catch (IllegalAccessException | IllegalArgumentException | ReflectionException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

}
