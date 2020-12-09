package com.ynov.SpringBootLiveCoding.form;

public class EtudiantForm {
	 
    private String nom;
    private String prenom;
	
    /**
     * Getter du nom d'un étudiant.
     * @return : Le nom de l'étudiant.
     */
    public String getNom() {
		return nom;
	}
    
    /**
     * Setter du nom d'un étudiant.
     * @param nom : Le nom de l'étudiant.
     */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
    
	
}