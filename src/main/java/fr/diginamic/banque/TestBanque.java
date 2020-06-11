package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte a = new Compte("AC1478956", 156);
		
		System.out.println("Résultats TP 6: " + '\n' + a);
		
		// TP 7 Création d'un tableau de comptes
		Compte[] comptes = new Compte[2];
		
		comptes[0] = new Compte("AC4569875", 1800);
		comptes[1] = new CompteTaux("AC459892", 1950, 2.3f);
		
		System.out.println("Résultats TP 7: ");
		
		for (int i = 0; i < comptes.length; i++) {
			
			System.out.println(comptes[i]);
		}

	}

}
