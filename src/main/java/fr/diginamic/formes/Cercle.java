package fr.diginamic.formes;

/** Représente un cercle d'un rayon donné
 * @author Khalil HIMET
 *
 */
public class Cercle extends Forme {
	
	/** rayon du cercle*/
	private double rayon;

	/** Constructeur
	 * @param rayon rayon du cercle
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		
		return Math.pow(rayon, 2)*Math.PI;
	}

	@Override
	public double calculerPerimetre() {
		return rayon*2*Math.PI;
	}

	/** Getter
	 * @return
	 */
	public double getRayon() {
		return rayon;
	}

	/** Setter
	 * @param rayon
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
