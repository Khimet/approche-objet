package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.entites.ObjetGeometrique;
import fr.diginamic.entites.Rectangle;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		// Déclarer un tableau d'ObjetGeometrique de longueur 2
		ObjetGeometrique[] tableau = new ObjetGeometrique[2];
		
		tableau[0] = new Cercle(5);
		tableau[1] = new Rectangle(2, 5);
		
		for(int i =0; i < tableau.length; i++) {
			
			System.out.println("Périmetre : " + tableau[i].perimetre());
			System.out.println("Aire : " + tableau[i].surface());
		}
		

	}

}
