package fr.diginamic.formes;

/** Classe abstraite dont vont hériter toutes les formes géométriques
 * @author Khalil HIMET
 *
 */
public abstract class Forme {
	
	/** 
	 * @return (double) la surface de chaque forme géométrique
	 */
	public abstract double calculerSurface();
	
	/**
	 * @return (double) le périmètre de chaque forme géometrique
	 */
	public abstract double calculerPerimetre();
	
	

}
