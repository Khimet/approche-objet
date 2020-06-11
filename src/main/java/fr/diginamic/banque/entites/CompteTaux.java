package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private float tauxRemuneration;

	public CompteTaux(String numeroCompte, double soldeCompte, float tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
		
	}

	@Override
	public String toString() {
		
		return super.toString() + ", tauxRemuneration=" + tauxRemuneration;
	}
	
	
	
	

}
