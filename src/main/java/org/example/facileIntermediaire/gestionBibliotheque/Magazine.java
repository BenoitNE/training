package org.example.facileIntermediaire.gestionBibliotheque;

public class Magazine extends Document implements Empruntable{
	
	private int numeroPublication;

	public int getNumeroPublication() {
		return numeroPublication;
	}

	public void setNumeroPublication(int numeroPublication) {
		this.numeroPublication = numeroPublication;
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
				" Année de publication: " + super.getAnneePublicatio() + " Numéro de publication: " + this.numeroPublication;
	}

}
