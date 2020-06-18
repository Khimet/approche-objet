package fr.diginamic.salaire;

/** Représente un salarié du journal, i.e ceux qui ont un CDI ou un CDD.
 * @author Khalil HIMET
 *
 */
public class Salarie extends Intervenant {
	
	/** salaire mensuel percu par le salarié*/
	protected double salaireMensuel;


	/** Constructeur
	 * @param nom
	 * @param prenom
	 */
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}




	@Override
	public double getSalaire() {
		return salaireMensuel;
	}




	/** Getter
	 * @return
	 */
	public double getSalaireMensuel() {
		return salaireMensuel;
	}




	/** Setter
	 * @param salaireMensuel
	 */
	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}

}
