package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, double montant) {
		super(date, montant);
	}

	public String afficherType() {
		return "Crédit";
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public double imputerSolde() {
		return getMontant();
	}
	
	
	
	
	
	

}
