package org.example.facileIntermediaire.gestionBibliotheque;

public class Livre extends Document implements Empruntable{
	
	private int nbrPage;
	
	public Livre() {
		super();
	}

	public int getNbrPage() {
		return nbrPage;
	}

	public void setNbrPage(int nbrPage) {
		this.nbrPage = nbrPage;
	}

	@Override
	public void emprunter() {
		
		System.out.println("Emprunter : " + toString());
		
	}

	@Override
	public void retourner() {
		
		System.out.println("Retourner : " + toString());
		
	}

	@Override
	public String toString() {
		return "Titre: " + super.getTitre() + " Auteur: " +  super.getAuteur() + 
				" Année de publication: " + super.getAnneePublicatio() + " Nombre de pages: " + this.nbrPage;
	}
	
	

}
