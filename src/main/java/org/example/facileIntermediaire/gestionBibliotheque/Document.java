package org.example.facileIntermediaire.gestionBibliotheque;

import java.time.LocalDate;

public abstract class Document {
	
	private String titre;
	private String auteur;
	private LocalDate anneePublicatio;
	

	public abstract String toString();
	



	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public LocalDate getAnneePublicatio() {
		return anneePublicatio;
	}
	public void setAnneePublicatio(LocalDate anneePublicatio) {
		this.anneePublicatio = anneePublicatio;
	}
	

}
