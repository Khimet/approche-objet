package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

/** Représente toutes les villes du fichier de recensement contenues dans une liste
 * @author Khalil HIMET
 *
 */
public class Recensement {
	
	/** Villes contenues dans le fichier recensement */
	private List<Ville> villes = new ArrayList<>();
	
	

	/** Constructeur
	 * @param villes villes contenus dans le fichier de recensment
	 */
	public Recensement(List<Ville> villes) {
		super();
		this.villes = villes;
	}

	/** Getter
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/** Setter
	 * @param villes the villes to set
	 */
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	

}
