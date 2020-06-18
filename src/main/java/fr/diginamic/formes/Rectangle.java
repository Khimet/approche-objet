package fr.diginamic.formes;

/** Représente un rectangle de longueur et largeur données
 * @author Khalil HIMET
 *
 */
public class Rectangle extends Forme {
	
	/** longueur du rectangle*/
	private double longueur;
	/** largeur du rectangle*/
	private double largeur;

	/** Constructeur
	 * @param longueur longueur du rectangle
	 * @param largeur largeur du rectangle
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return longueur*largeur;
	}

	@Override
	public double calculerPerimetre() {

		return (longueur+largeur)*2;
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

	/** Getter
	 * @return
	 */
	public double getLargeur() {
		return largeur;
	}

	/** Setter
	 * @param largeur
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	

}
