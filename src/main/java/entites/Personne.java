package entites;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	/* Dans la classe Personne, ajoutez une méthode qui permet
	 *  d’afficher le nom et le 
prénom avec le nom de famille en majuscules. */
	public void afficherNomPrenom() {
		
		System.out.println(nom.toUpperCase() + " " + prenom);
	}
	
	/*Dans la classe Personne, ajoutez une méthode qui prend
	 *  un argument en paramètre et 
permet de modifier la variable d’instance nom de Personne.*/
	public void changerNom(String nvNom) {
		nom = nvNom;
	}
	
	/*Dans la classe Personne, ajoutez une méthode similaire
	 *  pour modifier le prénom.*/
	public void changerPrenom(String nvPrenom) {
		prenom = nvPrenom;
	}
	
	/* Dans la classe Personne, ajoutez une méthode similaire 
	 * pour modifier l’adresse.
	 */
	public void changerAdresse(AdressePostale nvAdresse) {
		adresse = nvAdresse;
	}
	
	/*Dans la classe Personne, 
	 * ajoutez une méthode qui retourne le nom.
	 */
	public String getNom() {
		return nom;
	}
	
	/*Dans la classe Personne, ajoutez une méthode
	 *  qui retourne le prénom.*/
	public String getPrenom() {
		return prenom;
	}
	 
	/*Dans la classe Personne, ajoutez 
	 * une méthode qui retourne l’adresse.
	 */
	public AdressePostale getAdresse() {
		return adresse;
	}
	
	

}
