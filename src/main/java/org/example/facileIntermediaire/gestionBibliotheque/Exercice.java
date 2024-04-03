package org.example.facileIntermediaire.gestionBibliotheque;

import java.time.LocalDate;

/*
Vous devez concevoir un système de gestion pour une bibliothèque. Les fonctionnalités à implémenter sont les suivantes :

Créer une classe abstraite Document avec des propriétés communes telles que le titre, l'auteur, et l'année de publication.
Implémenter des classes Livre et Magazine qui étendent la classe Document.
Chaque classe doit avoir des propriétés spécifiques telles que le nombre de pages pour le livre
et le numéro de publication pour le magazine.
Ajouter une interface Empruntable avec des méthodes pour emprunter et retourner un document.
Implémenter l'interface Empruntable dans les classes Livre et Magazine pour permettre l'emprunt
et le retour de ces documents.
 */
public class Exercice {
	
	public static void main(String[] args) {
		Document livre = new Livre();
		((Livre) livre).setNbrPage(425);
		livre.setTitre("Un Super Livre");
		livre.setAuteur("Toto");
		livre.setAnneePublicatio(LocalDate.of(1988, 11, 7));
		
		Document magazine = new Magazine();
		((Magazine) magazine).setNumeroPublication(12884);
		magazine.setTitre("Un Super Magazine");
		magazine.setAuteur("Titi");
		magazine.setAnneePublicatio(LocalDate.of(1988, 11, 7));
		
		((Livre) livre).emprunter();
		((Livre) livre).retourner();
		System.out.println("");
		((Magazine) magazine).emprunter();
		((Magazine) magazine).retourner();
	}
	
}
