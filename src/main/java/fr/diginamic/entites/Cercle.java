package fr.diginamic.entites;

public class Cercle implements ObjetGeometrique {
	
	// Initialisation des variables
	double rayon;

	/** Constructeur explicite de la classe Cercle
	 * @param rayon
	 * La classe sera instancié en entrant en paramètre la valeur de son rayon.
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	/** Méthode qui calcule le périmètre
	 * @return Le périmètre du cercle
	 */
	public double getPerimeter() {
		
		return rayon*2*Math.PI;
		
	}
	
	/** Méthode qui calcule l'aire
	 * @return L'aire du cercle
	 */
	public double getSurfaceArea() {
		
		return Math.pow(rayon, 2)*Math.PI;
	}
	
	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return rayon*2*Math.PI;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.pow(rayon, 2)*Math.PI;
	}

	public double getRayon() {
		return rayon;
	}
	

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	
	
	
	
	

}
