package fr.diginamic.essais;

import fr.diginamic.maison.Piece;
import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

/**
 * Classe éxécutable qui permet de tester la création d'une maison
 * 
 * @author Khalil HIMET
 *
 */
public class TestMaison {

	/**
	 * @param args non utilisées ici
	 */
	public static void main(String[] args) {

		Salon salon = new Salon(12, 0);
		Chambre chambre = new Chambre(5, 2);
		Cuisine cuisine = new Cuisine(10, 0);
		SalleDeBain sdb = new SalleDeBain(3, 1);
		WC wc = new WC(2, 1);

		Piece[] pieces = { salon, chambre, cuisine, sdb, wc };

		// Création de la maison
		Maison maison = new Maison(pieces);

		System.out.println("Affichage des pièces de la maison :");
		for (Piece piece : maison.getPieces()) {

			System.out.println("Pièce : " + piece.getClass().getSimpleName() + " Superficie: " + piece.getSuperficie()
					+ " Etage n°: " + piece.getEtage());
		}

		// Ajout d'une chambre à la Maison
		Chambre chambre2 = new Chambre(7, 2);

		maison.ajouterPiece(chambre2);

		System.out.println("\nAffichage après ajout d'une pièce (chambre): ");
		for (Piece piece : maison.getPieces()) {

			System.out.println("Pièce : " + piece.getClass().getSimpleName() + " Superficie: " + piece.getSuperficie()
					+ " Etage n°: " + piece.getEtage());
		}
		
		maison.ajouterPiece(null);
		
		System.out.println("\nAffichage après ajout d'une pièce null: ");
		for (Piece piece : maison.getPieces()) {

			System.out.println("Pièce : " + piece.getClass().getSimpleName() + " Superficie: " + piece.getSuperficie()
					+ " Etage n°: " + piece.getEtage());
		}
		
		System.out.println("\nSuperficie globale des chambres de la maison : " + maison.superficiePieces(chambre));
		
		System.out.println("\nNombres de chambres de la maison : " + maison.nbPieces(chambre2));
		
		

	}

}
