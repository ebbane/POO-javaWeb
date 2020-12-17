package com.locy.Locy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Annonce {
	private Long id;
    private String titre;
    private String description;
    private int nb_voyageurs;
    private int nb_chambres;
    private String ville;
    private String adresse;
    private float prix;
    private String image;
    private String type;
    
    public Annonce() {
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }


	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the nb_voyageurs
	 */
	public int getNb_voyageurs() {
		return nb_voyageurs;
	}

	/**
	 * @param nb_voyageurs the nb_voyageurs to set
	 */
	public void setNb_voyageurs(int nb_voyageurs) {
		this.nb_voyageurs = nb_voyageurs;
	}

	/**
	 * @return the nb_chambres
	 */
	public int getNb_chambres() {
		return nb_chambres;
	}

	/**
	 * @param nb_chambres the nb_chambres to set
	 */
	public void setNb_chambres(int nb_chambres) {
		this.nb_chambres = nb_chambres;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param localisation the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
