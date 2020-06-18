package fr.diginamic.formes;

/** Classe éxécutable de tests des formes geométriques 
 * @author Khalil HIMET
 *
 */
public class TestForme {

	/**
	 * @param args non utilisées ici
	 */
	public static void main(String[] args) {
		
		// Exercice Forme, test de la méthode afficher de la classe AffichageForme
		
		Cercle cercle = new Cercle(5);
		Rectangle rectangle = new Rectangle(8, 4);
		Carre carre = new Carre(3);
		
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rectangle);
		AffichageForme.afficher(carre);

	}

}
