package fr.diginamic.enumerations;

import java.util.ArrayList;
import java.util.List;

import sets.Pays;

/** Classe éxécutable qui teste l'énumération Continent
 * @author Khalil HIMET
 *
 */
public class TestPaysAvecEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Pays> pays = new ArrayList<>();
		
		pays.add(new Pays("France", 60_000_000, 40_000, Continent.EURASIE));
		pays.add(new Pays("Allemagne", 80_000_000, 80_000, Continent.EURASIE));
		pays.add(new Pays("USA", 350_000_000, 80_000, Continent.AMERIQUE));
		
		System.out.println("Affichage de l'ensemble des pays : ");
		for(Pays p : pays) {
			
			System.out.println(p);
		}
		
		System.out.println("\nComptage du nombre de pays par continent");
		
		Continent[] valeurs = Continent.values();
		
		for (Continent conti : valeurs) {
			
			int compteur = 0;
			
			for (Pays p : pays) {
				
				if (conti.equals(p.getContinent())){
					
					compteur++;
				}
				
			}
			
			System.out.println(conti.getNom() + ": " + compteur);
		}
		
		
		
		
		
		

	}

}
