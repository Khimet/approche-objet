package sets;

/**
 * @author Khalil HIMET
 *
 */
public class Pays implements Comparable<Pays>{
	
	private String nom;
	private long nbHabitants;
	private long pibHab;
	
	/** Constructeur
	 * @param nom
	 * @param nbHabitants
	 * @param pibHab
	 */
	public Pays(String nom, long nbHabitants, long pibHab) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHab = pibHab;
	}
	
	public String toString() {
		
		return "nom: " + nom + " Nombre d'habitants: " + nbHabitants + " PIB/hab: " + pibHab;
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
	
	

}
