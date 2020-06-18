package fr.diginamic.chaines;

import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Compte;

/** Classe éxécutable qui permet de faire de la manipulation de chaîne de caractère
 * @author Khalil HIMET
 *
 */
public class ManipulationChaine {

	/**
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		//Affichage du premier caractère de la chaine de caractères
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		int tailleChaine = chaine.length();
		System.out.println("Taille de la chaîne de caractères : " + tailleChaine);
		
		
		int indexPremierSemicolon = chaine.indexOf(";");
		System.out.println("Index du premier \";\" contenu dans la chaîne de caractères : " +
		chaine.indexOf(";"));
		
		// Extraction du nom de famille de la Personne
		String nom = chaine.substring(0, indexPremierSemicolon);
		System.out.println("Nom de la personne : " + nom);
		
		System.out.println("Nom en majuscules : " + nom.toUpperCase());
		
		System.out.println("Nom en minuscules : " + nom.toLowerCase());
		
		//Utilisation de la méthode split
		String[] split = chaine.split(";");
		System.out.println("Résultat de la chaîne de caractères après le split avec \";\" : " );
		
		for (String str : split) {
			
			System.out.print(str + " ");
		}
		
		
		// Instanciation des classes Client et Compte à partir du split
		
		//Supression de l'espace dans le nombre "1 523.5"
		split[split.length - 1] = split[split.length - 1].replace(" ", "");
		
		Client client = new Client(split[0], split[1]);
		
		Compte compte = new Compte(split[2], Double.parseDouble(split[3]));
		
		System.out.println("\n\nExercice Manipulation Chaine TPs autoformation J1 à J4 :");
		System.out.println("Client : " + client);
		System.out.println("Compte : " + compte);

	}
	
	

}
