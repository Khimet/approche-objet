package sets;

import fr.diginamic.enumerations.Continent;

/**
 * @author Khalil HIMET
 *
 */
public class Pays implements Comparable<Pays>{
	
	private String nom;
	private Continent continent;
	private long nbHabitants;
	private long pibHab;
	
	/** Constructeur
	 * @param nom
	 * @param nbHabitants
	 * @param pibHab
	 */
	public Pays(String nom, long nbHabitants, long pibHab, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHab = pibHab;
		this.continent = continent;
	}
	
	public String toString() {
		
		return "nom: " + nom + " Nombre d'habitants: " + nbHabitants + " PIB/hab: " + pibHab + " Continent : " + continent;
	}
	
//	@Override
//	public int compareTo(Pays paysAComparer) {
//		int result = this.nom.compareTo(paysAComparer.getNom());
//		return result;
//	}
	
	@Override
	public int compareTo(Pays paysAComparer) {
		if (this.pibHab > paysAComparer.getPibHab()) {
			return 1;
		}
		
		else if (this.pibHab < paysAComparer.getPibHab()) {
			return -1;
		}
		return 0;
	}
	
	public long getPibTotal() {
		
		return nbHabitants * pibHab;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public long getPibHab() {
		return pibHab;
	}

	public void setPibHab(long pibHab) {
		this.pibHab = pibHab;
	}

	/** Getter
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/** Setter
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	

}
