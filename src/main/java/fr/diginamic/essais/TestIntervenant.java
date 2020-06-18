package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

/** Classe éxécutable
 * @author Khalil HIMET
 *
 */
public class TestIntervenant {

	/** 
	 * @param args non utilisées ici
	 */
	public static void main(String[] args) {
		
		//Instanciation d'un salarié
		Salarie salarie = new Salarie("Dupont", "Marc", 2500);
		
		System.out.println("Salaire mensuel du salarié: " + salarie.getSalaire());
		
		//Instanciaition d'un pigiste
		Pigiste pigiste = new Pigiste("Sarran", "Eric", 14, 120);
		
		System.out.println("Salaire mensuel du pigiste: " + pigiste.getSalaire());
		
		//Test de la méthode affichageDonnees de la classe Intervenant
		System.out.println("Test de la méthode afficherDonnees");
		salarie.afficherDonnees();
		
		pigiste.afficherDonnees();

	}

}
