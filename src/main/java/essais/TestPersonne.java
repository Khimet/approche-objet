package essais;

import entites.AdressePostale;
import entites.Personne;


public class TestPersonne {

	public static void main(String[] args) {
		Personne a = new Personne();
		a.nom = "Dupont";
		a.prenom = "Yann";
		a.adresse = new AdressePostale();
		a.adresse.codePostal = 14000;
		a.adresse.numeroRue = 189;
		
		Personne b = new Personne();
		b.nom = "Monsieur";
		b.prenom = "Jean";
		b.adresse = new AdressePostale();
		b.adresse.ville = "Paris";
			
		

	}

}
