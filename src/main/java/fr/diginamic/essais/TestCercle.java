package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/** Classe éxécutable
 * @author Khalil HIMET
 *
 */
public class TestCercle {

	/** Méthode éxécutable
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		
		// Instanciation de 2 cercles et affichage de leur périmètre et surface
		Cercle cercle1 = new Cercle(5);
		
		System.out.println("Perimètre cercle 1 = " + cercle1.getPerimeter());
		System.out.println("Aire cercle 1 = " + cercle1.getSurfaceArea());
		
		Cercle cercle2 = new Cercle(12);
		
		System.out.println("Perimètre cercle 2 = " + cercle2.getPerimeter());
		System.out.println("Aire cercle 2 = " + cercle2.getSurfaceArea());
		
		// Utilisation d'une classe Factory pour créer les cercles
		Cercle cercle3 = CercleFactory.créerCercle(5);
		
		System.out.println("Perimètre cercle 3 = " + cercle3.getPerimeter());
		System.out.println("Aire cercle 3 = " + cercle3.getSurfaceArea());
		
		Cercle cercle4 = CercleFactory.créerCercle(12);
		System.out.println("Perimètre cercle 4 = " + cercle4.getPerimeter());
		System.out.println("Aire cercle 4 = " + cercle4.getSurfaceArea());
		
	}

}
