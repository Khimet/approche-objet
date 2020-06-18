package fr.diginamic.formes;

/** Représente un carré avec une longueur de côté donné
 * @author Khalil HIMET
 *
 */
public class Carre extends Forme {
	
	/** longueur du côté du carré*/
	private double longueur;
	
	/** Constructeur
	 * @param longueur longueur d'un côté du carré
	 */
	public Carre(double longueur) {
		super();
		this.longueur = longueur;
	}

	@Override
	public double calculerSurface() {
		
		return longueur*longueur;
	}

	@Override
	public double calculerPerimetre() {
		return longueur*4;
	}

	/** Getter
	 * @return
	 */
	public double getLongueur() {
		return longueur;
	}

	/** Setter
	 * @param longueur
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

}
