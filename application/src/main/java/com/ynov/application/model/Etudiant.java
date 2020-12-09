package com.ynov.SpringBootLiveCoding.model;
 
public class Etudiant {
	 
	// Nom
	private String nom;
	
	// Prénom
	private String prenom;
	
	// Constructeur custom
	public Etudiant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
 
}