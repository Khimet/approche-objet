package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import tri.ComparatorHabitant;
import tri.ComparatorPibHabitant;

/**
 * @author Khalil HIMET
 *
 */
public class TestPays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Création d'un HashSet de pays
		
		HashSet<Pays> setPays = new HashSet<>();
		
		setPays.add(new Pays("USA", 332_639_000, 59_495));
        setPays.add(new Pays("France", 67_064_000, 43_551));
        setPays.add(new Pays("Allemagne", 83_149_300, 50_206));
        setPays.add(new Pays("UK", 66_436_000, 43_620));
        setPays.add(new Pays("Italie", 60_317_000, 37_970));
        setPays.add(new Pays("Japon", 126_010_000, 42_659));
        setPays.add(new Pays("Chine", 1_400_050_000, 16_624));
        setPays.add(new Pays("Russie", 146_748_590, 28_712));
        setPays.add(new Pays("Inde", 1_368_163_000, 5_174));
        
        //Recherche du pays avec le PIB/hab le plus important
        long max = Long.MIN_VALUE;
        
        String nomPays = null;
        
        for (Pays pays : setPays) {
        	
        	if(pays.getPibHab() > max) {
        		
        		max = pays.getPibHab();
        		nomPays = pays.getNom();
        	}
        }
        
        System.out.println("Le pays avec le PIB/hab le plus important est : " + nomPays);
        
        //Recherche du pays avec le PIB total le plus important
        long pibTotal = 0;
        for (Pays pays : setPays) {
        	
        	pibTotal = pays.getNbHabitants() * pays.getPibHab();
        	nomPays = pays.getNom();
        	break;
        }
        
        for (Pays pays : setPays) {
        	
        	long pibTot = pays.getNbHabitants() * pays.getPibHab();
        	
        	if (pibTot > pibTotal) {
        		
        		pibTotal = pibTot;
        		nomPays = pays.getNom();
        	}
        }
        
        System.out.println("Le pays avec le PIB total le plus important est : " + nomPays);
        
        //Modification du HashSet pour mettre en masjuscule le pays qui a le PIB total le plus petit
        
        for (Pays pays : setPays) {
        	
        	long pibTot = pays.getNbHabitants() * pays.getPibHab();
        	
        	if (pibTot < pibTotal) {
        		
        		nomPays = pays.getNom();
        	}
        }
        
        for (Pays pays : setPays) {
        	
        	if(pays.getNom() == nomPays) {
        		
        		pays.setNom(nomPays.toUpperCase());
        	}
        }
        
        System.out.println("Set avec le pays qui a le PIB total le plus petit en majuscule : ");
        for (Pays pays : setPays) {
        	
        	System.out.println(pays);
        }
        
        setPays.remove(nomPays);
        
        System.out.println("HashSet des pays après modifications");
        for (Pays pays : setPays) {
        	
        	System.out.println("Pays: " + pays.getNom() + " Nombre d'habitants: " + pays.getNbHabitants() + " PIB Total: " + pays.getNbHabitants() * pays.getPibHab());
        }
        
        // Exercice 1 - TP4 sur les Tri
        
        List<Pays> liste = new ArrayList<Pays>();
        
        liste.addAll(setPays);
        
        Collections.sort(liste);
        
        System.out.println("\nExercice 1 TP4 - Liste triée par nom de pays dans l'ordre alphabétique");
        for(Pays pays : liste) {
        	
        	System.out.println(pays);
        }
        
        // Exercice 2 - Tri sur le PIB/hab
        Collections.sort(liste);
        
        System.out.println("\nExercice 2 TP4 - Liste tirée par le PIB/hab : ");
        for(Pays pays : liste) {
        	System.out.println(pays);
        }
        
        //Exercice 3 TP4 - implémentation de l'interface Comparator
        Collections.sort(liste, new ComparatorHabitant());
        
        System.out.println("\nExercice 3 TP4 - Liste triée sur le nombre d'habitants");
        for(Pays pays : liste) {
        	System.out.println(pays);
        }
        
        Collections.sort(liste, new ComparatorPibHabitant());
        
        System.out.println("\nExercice 3 TP4 - Liste triée sur le PIB/hab");
        for(Pays pays : liste) {
        	
        	System.out.println(pays);
        }

	}

}
