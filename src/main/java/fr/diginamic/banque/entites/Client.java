package fr.diginamic.banque.entites;

/**
 * @author Khalil HIMET
 *
 */
/**
 * @author Khalil HIMET
 *
 */
public class Client {
	
	protected String nom;
	protected String prenom;
	
	/** Constructeur
	 * @param nom nom du Client
	 * @param prenom prenom du Client
	 */
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	@Override
	public String toString() {
		return "Nom: " + nom + " Prénom: " + prenom;
	}

	/** Getter
	 * @return String
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom nom du client
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	

}
