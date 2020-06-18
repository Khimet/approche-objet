package listes;

/** Représente une ville avec son nom et son nombre d'habitant
 * @author Khalil HIMET
 *
 */
public class Ville {
	
	/** nom de la ville */
	private String nom;
	/** nombre d'habitants */
	private long nbHabitants;
	
	/** Constructeur
	 * @param nom nom de la ville
	 * @param nbHabitants nombre d'habitants
	 */
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	/** Getter
	 * @return String nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return long, nombre d'habitants
	 */
	public long getNbHabitants() {
		return nbHabitants;
	}

	/** Setter
	 * @param nbHabitants nombre d'habitants
	 */
	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	
	

}
