package fr.diginamic.banque.entites;

public class Debit extends Operation {
	
	public Debit(String date, double montant) {
		super(date, montant);
	}

	public String afficherType() {
		return "Débit";
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public double imputerSolde() {
		return -getMontant();
	}
	
	

}
