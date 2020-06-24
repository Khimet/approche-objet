package fr.diginamic.recensement;

import java.util.List;

/** Représente une région de la France
 * @author Khalil HIMET
 *
 */
public class Region {
	
	/** Numéro de code de la région */
	private String codeRegion;
	/** Nom de la région*/
	private String nomRegion;
	/** Les villes qui composent cette région */
	private List<Ville> villes;
	/** Nombre d'habitants qui peuple la région */
	private int population;
	
	/** Constructeur
	 * @param codeRegion 
	 * @param nomRegion
	 */
	public Region(String codeRegion, String nomRegion) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
	}
	
	

	@Override
	public String toString() {
		return "Région: " + nomRegion + " Population : " + population;
	}



	/** Getter
	 * @return codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/** Setter
	 * @param codeRegion codeRegion
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/** Getter
	 * @return nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/** Setter
	 * @param nomRegion nomRegion
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/** Getter
	 * @return villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/** Setter
	 * @param population population
	 */
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	/** Getter
	 * @return population
	 */
	public int getPopulation() {
		return population;
	}

	/** Setter
	 * Determine la population d'une région en additionant le nombre d'habitants
	 * des villes qui composent cette région
	 * @param population population
	 */
	public void setPopulation() {
		
		int somme = 0;
		
		for (Ville ville : villes) {
			
			somme += ville.getNbPopTotale();
		}
		
		this.population = somme;
	}
	
	
	
	
	
	
	

}
