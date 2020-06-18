package fr.diginamic.formes;

/**
 * @author Khalil HIMET
 *
 */
public class AffichageForme {

	public static void afficher(Forme forme) {
		
		System.out.println("Périmètre : " + forme.calculerPerimetre() + " Surface : " + forme.calculerSurface());
		
	}
}
