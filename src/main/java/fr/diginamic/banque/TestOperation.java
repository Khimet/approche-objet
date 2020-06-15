package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		
		Operation[] operations = new Operation[4];
		
		operations[0] = new Credit("25/01/2013", 145690);
		operations[1] = new Credit("16/08/2019", 154885);
		operations[2] = new Debit("12/05/2019", 1236000);
		operations[3] = new Debit("18/06/2020", 4899);
		
		for (int i = 0; i < operations.length; i++) {
			System.out.println(operations[i]);
			
		}
		
		//Calcul du montant global des opérations
		double total = 0;
		for (int i =0; i < operations.length; i++) {
			
			total += operations[i].imputerSolde();
			
//			if (operations[i].afficherType() == "Débit") {
//				total = total - operations[i].getMontant();
//			} else if (operations[i].afficherType() == "Crédit") {
//				total = total + operations[i].getMontant();
//			}
		}
		
		System.out.println("Le montant global des opérations est de : " + total);
		

	}

}
