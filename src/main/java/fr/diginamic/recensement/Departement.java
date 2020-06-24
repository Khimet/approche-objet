package fr.diginamic.recensement;

import java.util.List;

/** Représente un département français
 * @author Khalil HIMET
 *
 */
public class Departement {
	
	/** Numero de code du département*/
	private String codeDepartement;
	/** Villes qui composent le département*/
	private List<Ville> villesDepartement;
	/** nombre d'habitants dans le département*/
	private int population;
	
	/** Constructeur
	 * @param codeDepartement numéro de code du département
	 */
	public Departement(String codeDepartement) {
		super();
		this.codeDepartement = codeDepartement;
	}
	
	

	@Override
	public String toString() {
		return "Departement: " + codeDepartement + " Population: " + population;
	}



	/** Getter
	 * @return codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/** Setter
	 * @param codeDepartement codeDepartement
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/** Getter
	 * @return villesDepartement
	 */
	public List<Ville> getVillesDepartement() {
		return villesDepartement;
	}

	/** Setter
	 * @param villesDepartement villesDepartement
	 */
	public void setVillesDepartement(List<Ville> villesDepartement) {
		this.villesDepartement = villesDepartement;
	}

	/** Getter
	 * @return population
	 */
	public int getPopulation() {
		return population;
	}

	/** Setter
	 * @param population population
	 */
	public void setPopulation() {
		
		int somme = 0;
		
		for (Ville ville : villesDepartement) {
			
			somme += ville.getNbPopTotale();
		}
		
		this.population = somme;
	}
	
	
	
	
	
	
	
	
	

}
