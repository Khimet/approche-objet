package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** Classe éxécutable pour manipuler la classe Calendar
 * @author Khalil HIMET
 *
 */
public class TestCalendar {

	/**
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		/* Création d'une instance de Date à la date du 19 mai 2016 à 23h59 et 30 
		 * secondes
		 */
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 19);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 30);
		
		Date date = cal.getTime();
		
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Affichage de la date au format jour/mois/année : ");
		System.out.println(formattage.format(date));
		
		SimpleDateFormat formattage2 = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		
		Date dateJour = Calendar.getInstance().getTime();
		
		System.out.println("\nAffichage de la date du jour au format année/mois/jour heure:minute:seconde");
		System.out.println(formattage2.format(dateJour));
		
		
	}

}
