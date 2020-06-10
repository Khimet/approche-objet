package essais;

import entites.AdressePostale;
import entites.Personne;


public class TestPersonne {

	public static void main(String[] args) {
		// Utilisation du deuxième constructeur
		Personne a = new Personne("Dupont", "Marc", new AdressePostale(4, "BD", 50000, "Nice"));
		a.nom = "Dupont";
		a.prenom = "Yann";
//		a.adresse = new AdressePostale(1, "RUE", 17, "Paris");
//		a.adresse.codePostal = 14000;
		a.adresse.numeroRue = 189;
		
		Personne b = new Personne("Bob", "Mob");
		b.nom = "Monsieur";
		b.prenom = "Jean";
		b.adresse = new AdressePostale(4, "Allée", 68, "Tourcoing");
		b.adresse.ville = "Paris";
		
		System.out.println(a.adresse.codePostal);
			
		

	}

}
