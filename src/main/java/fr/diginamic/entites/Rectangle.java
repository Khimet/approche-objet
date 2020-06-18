package fr.diginamic.entites;

/** Représente un rectangle d'une longueur et une largeur donnée
 * @author Khalil HIMET
 *
 */
public class Rectangle implements ObjetGeometrique {
	
	/** longueur du rectangle */
	private double longueur;
	/** largeur du rectangle*/
	private double largeur;

	
	/** Constructeur
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return (longueur+largeur)*2;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur*largeur;
	}
	
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
