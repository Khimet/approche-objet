package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.io.FileUtils;

/** Classe qui permet de lire le fichier de recensement et en extraire les infos utiles
 * @author Khalil HIMET
 *
 */
public class ParserRecensement {
	
	/** Lit un fichier texte ligne par ligne
	 * @param file Objet File contenant le chemin de ce fichier
	 * @return (List<String>) les lignes du fichier ou null si erreur de lecture (IOException)
	 * @throws IOException
	 */
	public static List<String> lireFichier(File file) {
		
		try {
			
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			return lignes;
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
			return null;
		}
		
		
		
	}
	
	/** Extrait les villes et les informations utiles au recensement
	 * @param lignes lignes du fichier de recensement
	 * @return (List<Ville>) Une liste d'objets Ville contenant les informations utiles au recensement: le numéro de code de Région,
	 * le nom de la Région, le numéro de code de Département, le numéro de code de la Commune, le nom de la Commune,
	 * le nombre de population totale.
	 */
	public static List<Ville> extraireVilles(List<String> lignes){
		
		List<Ville> villes = new ArrayList<>();
		
		for (int i = 1; i < lignes.size() - 1; i++) {
			// On split les lignes en utilisant ";" comme séparateur
			String[] split = lignes.get(i).split(";");
			String codeRegion = split[0];
			String nomRegion = split[1];
			String codeDepartement = split[2];
			String codeCommune = split[5];
			String nomCommune = split[6];
			String population = split[split.length-1];
			
			// Conversion du string en long pour le nombre de population totale
			int populationTotale = Integer.parseInt(population.replace(" ", "").trim());
			
			// Instanciation de la ville
			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
			
			// Ajout de chaque ville dans la liste
			villes.add(ville);
				
		}
		
		return villes;
		
	}
	
	public static List<Region> extraireRegions(List<Ville> villes){
		// Création d'un set qui contiendra les numéros de code des régions
		HashSet<String> codeRegions = new HashSet<>();
		
		// Remplissage du set à partir des code des régions renseignés dans les objets Ville
		for (Ville ville : villes) {
			
			codeRegions.add(ville.getCodeRegion());
		}
		
		// Création d'une liste où seront stocker les objets Region
		List<Region> regions = new ArrayList();
		
		// Remplissage de la liste regions, instanciation des objets Region
		for (String codeRegion : codeRegions) {
			
			List<Ville> villesRegion = new ArrayList<>();
			
			for (Ville ville : villes) {
				
				if (codeRegion.equalsIgnoreCase(ville.getCodeRegion())) {
					
					villesRegion.add(ville);
				}
			}
			
			Ville villeRegion = villesRegion.get(0);
			
			Region region = new Region(villeRegion.getCodeRegion(), villeRegion.getNomRegion());
			
			region.setVilles(villesRegion);
			region.setPopulation();
			
			regions.add(region);
			
		}
		
		return regions;
	}
	
	public static List<Departement> extraireDepartement(List<Ville> villes){
		
		HashSet<String> codesDepartements = new HashSet<>();
		
		for (Ville ville : villes) {
			
			codesDepartements.add(ville.getCodeDepartment());
		}
		
		List<Departement> departements = new ArrayList<>();
		
		for (String codeDepartement : codesDepartements) {
			
			List<Ville> villesDepartement = new ArrayList<>();
			
			for (Ville ville : villes) {
				
				if (codeDepartement.equalsIgnoreCase(ville.getCodeDepartment())) {
					
					villesDepartement.add(ville);
				}
			}
			
			Departement departement = new Departement(codeDepartement);
			
			departement.setVillesDepartement(villesDepartement);
			departement.setPopulation();
			
			departements.add(departement);
		}
		
		return departements;
	}

}
