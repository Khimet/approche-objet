package fr.diginamic.recensement;

/** Représente une ville
 * @author Khalil HIMET
 *
 */

public class Ville {
	
	/** Numéro de code de la région*/
	private String codeRegion;
	/** nom de la région */
	private String nomRegion;
	/** Numéro de code du department*/
	private String codeDepartment;
	/** Numéro de code de la commune*/
	private String codeCommune;
	/** Nom de la commune*/
	private String nomCommune;
	/** nombre de la population totale*/
	private long nbPopTotale;
	
	/** Constructeur
	 * @param codeRegion Numéro de code de la région
	 * @param nomRegion nom de la région
	 * @param codeDepartment Numéro de code du department
	 * @param codeCommune Numéro de code de la commune
	 * @param nomCommune Nom de la commune
	 * @param nbPopTotale Nombre de la population totale
	 */
	public Ville(String codeRegion, String nomRegion, String codeDepartment, String codeCommune, String nomCommune,
			long nbPopTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartment = codeDepartment;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.nbPopTotale = nbPopTotale;
	}

	/** Getter
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/** Setter
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/** Getter
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/** Setter
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/** Getter
	 * @return the codeDepartment
	 */
	public String getCodeDepartment() {
		return codeDepartment;
	}

	/** Setter
	 * @param codeDepartment the codeDepartment to set
	 */
	public void setCodeDepartment(String codeDepartment) {
		this.codeDepartment = codeDepartment;
	}

	/** Getter
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/** Setter
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/** Getter
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/** Setter
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/** Getter
	 * @return the nbPopTotale
	 */
	public long getNbPopTotale() {
		return nbPopTotale;
	}

	/** Setter
	 * @param nbPopTotale the nbPopTotale to set
	 */
	public void setNbPopTotale(long nbPopTotale) {
		this.nbPopTotale = nbPopTotale;
	}
	
	
	
	

}
