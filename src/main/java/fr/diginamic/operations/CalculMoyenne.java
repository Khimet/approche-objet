package fr.diginamic.operations;

import java.util.Arrays;

/** Calcul la moyenne des nombres contenus dans un tableau
 * @author Khalil HIMET
 *
 */
public class CalculMoyenne {
	
	/** tableau de double à partir duquel sera fait des calculs*/
	private double[] tableau = new double[0];

	/** Constructeur
	 * 
	 */
	public CalculMoyenne() {
		super();
	}
	
	/** Ajoute un double au tableau
	 * @param nb (double) nombre à ajouter
	 */
	public void ajout(double nb) {
		
		tableau = Arrays.copyOf(tableau, tableau.length + 1);
		
		tableau[tableau.length - 1] = nb;
		
	}
	
	/** Calcul la moyenne des éléments d'un tableau
	 * @return double
	 */
	public double calcul(){
		
		double sum = 0;
		double nbElements = tableau.length;
		
		for (double nb : tableau) {
			
			sum += nb;
		}
		
		return sum / nbElements;
	}

	/** Getter
	 * @return
	 */
	public double[] getTableau() {
		return tableau;
	}

	/** Setter
	 * @param tableau
	 */
	public void setTableau(double[] tableau) {
		this.tableau = tableau;
	}
	
	

}
