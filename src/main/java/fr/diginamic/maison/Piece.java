package fr.diginamic.maison;

/** Représente la pièce d'une maison
 * @author Khalil HIMET
 *
 */
public abstract class Piece {
	
	/** superficie de la pièce */
	private double superficie;
	/** numéro de l'étage dans lequel se trouve la pièce */
	private int etage;
	
	/** Constructeur
	 * @param superficie superficie de la pièce
	 * @param numEtage numéro de l'étage
	 */
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}

	/** Getter
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/** Setter
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/** Getter
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/** Setter
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	
	
	
	
	

}
