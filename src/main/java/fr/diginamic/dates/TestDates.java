package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

/** Classe éxécutable pour tester les librairies de dates
 * @author Khalil HIMET
 *
 */
public class TestDates {

	/**
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		// Instanciation de la classe java.util.Date à la date du jour
		
		Date date = new Date(120, 5, 19);
		
		System.out.println(date);
		
		System.out.println("\n Affichage de l'instance au format jour/mois/année : ");
		
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(formattage.format(date));
		
		/* Création d'une instance de la classe Date à la date du 19 mai 2016 
		 * à 23h59 et 30 sec*/		
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		
		SimpleDateFormat formattage2 = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		
		System.out.println("\n Affichage de la date du 19 mai 2016 à 23h59 et 30 secondes :");
		System.out.println(formattage2.format(date2));
		
		/* Création d'une instance de Date contenant la date/heure système et affichez-la au
même format que ci-dessus. */
		
		Date dateSys = new Date();
		
		System.out.println("\nAffichage de la date système avec le même format que ci-dessus : ");
		System.out.println(formattage2.format(dateSys));
		
		

	}

}
