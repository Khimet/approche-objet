package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import fr.diginamic.recensement.exceptions.RechercheException;

/** Classe éxécutable qui permet de faire des manipulation sur le fichier de recensement des villes 2016
 * @author Khalil HIMET
 *
 */
public class Application {

	/**
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		
		// Déclaration variable de type File qui contient l'emplacement du fichier à lire
		File file = new File("C:/Windows/Temp/recensement 2016.csv");
		
		List<String> lignes = ParserRecensement.lireFichier(file);
		
		if (lignes == null) {
			
			System.err.println("Une erreur d'éxecution s'est produite, le fichier n'a pas pu être lu");
			System.exit(0);
		}
		
		
		List<Ville> villes = ParserRecensement.extraireVilles(lignes);
		
		Recensement recensement = new Recensement(villes);
		
		Scanner scanner = new Scanner(System.in);
		
		int choixMenu = 0;
		
		do {
			
			System.out.println("***** Recensement population *****");
			System.out.println("1. Population d’une ville donnée");
			System.out.println("2. Population d’un département donné");
			System.out.println("3. Population d’une région donnée");
			System.out.println("4. Afficher les 10 régions les plus peuplées");
			System.out.println("5. Afficher les 10 départements les plus peuplés");
			System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
			System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
			System.out.println("8. Afficher les 10 villes les plus peuplées de France");
			System.out.println("99. Sortir");
			
			String choix = scanner.nextLine();
			
			choixMenu = Integer.parseInt(choix);
			
			switch (choixMenu) {
			
			case 1:
				RecherchePopulationVille rechercheVille = new RecherchePopulationVille();
				try {
					rechercheVille.traiter(recensement, scanner);
				} catch (RechercheException e) {
					System.err.println(e.getMessage());
				}
				
				break;
				
			case 2:
				RecherchePopulationDepartement rechercheDepartement = new RecherchePopulationDepartement();
				try {
					rechercheDepartement.traiter(recensement, scanner);
				} catch (RechercheException e) {
					System.err.println(e.getMessage());
				}
				break;
				
			case 3:
				RecherchePopulationRegion rechercheRegion = new RecherchePopulationRegion();
				
				try {
					rechercheRegion.traiter(recensement, scanner);
				} catch (RechercheException e) {
					System.err.println(e.getMessage());
				}
				break;
				
			case 4:
				Afficher10RegionsPlusPeuples afficher10Regions = new Afficher10RegionsPlusPeuples();
				afficher10Regions.traiter(recensement, scanner);
				break;
				
			case 5:
				Afficher10DepartementsPlusPeuples afficher10Departements = new Afficher10DepartementsPlusPeuples();
				afficher10Departements.traiter(recensement, scanner);
				break;
				
			case 6:
				Afficher10VillesDepartement afficher10VillesDepartement = new Afficher10VillesDepartement();
				try {
					afficher10VillesDepartement.traiter(recensement, scanner);
				} catch (RechercheException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 7:
				Afficher10VillesRegion afficher10VillesRegion = new Afficher10VillesRegion();
				try {
					afficher10VillesRegion.traiter(recensement, scanner);
				} catch (RechercheException e) {
					System.err.println(e.getMessage());
				}
				break;
				
			case 8:
				Afficher10VillesPlusPeuplesFrance afficher10VillesFrance = new Afficher10VillesPlusPeuplesFrance();
				afficher10VillesFrance.traiter(recensement, scanner);
				break;	
			
			}
			
		} while (choixMenu != 99);
		
		scanner.close();
		
		

	}

}
