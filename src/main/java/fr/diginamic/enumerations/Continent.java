package fr.diginamic.enumerations;

/** Représente les 5 continents
 * @author Khalil HIMET
 *
 */
public enum Continent {
	
	EURASIE("Eurasie"),
	AMERIQUE("Amérique"),
	AFRIQUE("Afrique"),
	ANTARCTIQUE("Antarctique"),
	OCEANIE("Oceanie");
	
	private String nom;

	/** Constructeur
	 * @param nom nom du continent
	 */
	private Continent(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
