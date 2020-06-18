package fr.diginamic.salaire;

/** Représente un intervenant qui travaille pour la société du journal quotidien
 * @author Khalil HIMET
 *
 */
public abstract class Intervenant {
	
	protected String nom;
	protected String prenom;

	/** Constructeur
	 * @param nom
	 * @param prenom
	 */
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @return 
	 */
	public abstract double getSalaire();
	
	public void afficherDonnees() {
		System.out.println("Nom: " + nom + " Prenom: " + prenom + " Salaire: " + getSalaire() + 
				" Statut: " + getClass().getSimpleName());
		
	}

}
