package fr.diginamic.banque.entites;

public class Compte {
	
	private String numeroCompte;
	private double soldeCompte;
	
	public Compte(String numeroCompte, double soldeCompte) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", soldeCompte=" + soldeCompte + "]";
	}
	
	
	
	

}
