package fr.diginamic.recensement;

import java.util.Scanner;

import fr.diginamic.recensement.exceptions.RechercheException;

/** Classe abstraite dont vont hériter toutes les classes de services pour chaque option du menu
 * de l'application.
 * @author Khalil HIMET
 *
 */
public abstract class MenuService {
	
	public abstract void traiter(Recensement recensement, Scanner scanner) throws RechercheException;

}
