package fr.diginamic.salaire;

/** Représente les personnes payées à la journée
 * @author Khalil HIMET
 *
 */
public class Pigiste extends Intervenant {
	
	/** nombre de jour travaillées pour la société durant le mois */
	private int nbJourTravaillees;
	/** montant journalier de rémunération */
	private double montantRemunerationJournaliere;
	

	/** Constructeur
	 * @param nom
	 * @param prenom
	 * @param nbJourTravaillees
	 * @param montantRemunerationJournaliere
	 */
	public Pigiste(String nom, String prenom, int nbJourTravaillees, double montantRemunerationJournaliere) {
		super(nom, prenom);
		
		this.nbJourTravaillees = nbJourTravaillees;
		this.montantRemunerationJournaliere = montantRemunerationJournaliere;
	}

	@Override
	public double getSalaire() {
		return nbJourTravaillees * montantRemunerationJournaliere;
	}

	/** Getter
	 * @return the nbJourTravaillees
	 */
	public int getNbJourTravaillees() {
		return nbJourTravaillees;
	}

	/** Setter
	 * @param nbJourTravaillees the nbJourTravaillees to set
	 */
	public void setNbJourTravaillees(int nbJourTravaillees) {
		this.nbJourTravaillees = nbJourTravaillees;
	}

	/** Getter
	 * @return the montantRemunerationJournaliere
	 */
	public double getMontantRemunerationJournaliere() {
		return montantRemunerationJournaliere;
	}

	/** Setter
	 * @param montantRemunerationJournaliere the montantRemunerationJournaliere to set
	 */
	public void setMontantRemunerationJournaliere(double montantRemunerationJournaliere) {
		this.montantRemunerationJournaliere = montantRemunerationJournaliere;
	}

}
