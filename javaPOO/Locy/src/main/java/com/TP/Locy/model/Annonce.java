package com.TP.Locy.model;

public class Annonce {
	
	    // ID
		private int id;
		
		// Titre
		private String titre;
		
		 // Description
		private String description;
		
		// Nombre de chambres
		private int nb_chambres; 
		
		// Nombre de voyageurs 
		private int nb_voyageurs;
		
		// Prix
		private String prix;
		
		
		// Photos
		private String photo;
				
		// Adresse
		private String adresse;
		
		// Localisation
		private String localisation;
		
		
		// Constructeur custom
		public Annonce(int id, String titre, String description, int nb_chambres, int nb_voyageurs, String prix, String photo, String adresse, String localisation) {
			this.id = id;
			this.titre = titre;
			this.description = description;
			this.nb_chambres = nb_chambres;
			this.nb_voyageurs = nb_voyageurs;
			this.prix = prix;
			this.photo = photo;
			this.adresse = adresse;
			this.localisation = localisation;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitre() {
			return titre;
		}

		public void setTitre(String titre) {
			this.titre = titre;
		}
		
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
		
		public int getNb_chambres() {
			return nb_chambres;
		}

		public void setNb_chanbres(int nb_chambres) {
			this.nb_chambres = nb_chambres;
		}
		
		public int getNb_voyageurs() {
			return nb_voyageurs;
		}
		public void setNb_voyageurs(int nb_voyageurs) {
			this.nb_voyageurs = nb_voyageurs;
		}

		public String getPrix() {
			return prix;
		}
		
		public void setPrix(String prix) {
			this.prix = prix;
		}
	
		public String getPhoto() {
			return photo;
		}

		public void setPhoto(String photo) {
			this.photo = photo;
		}
		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getLocalisation() {
			return localisation;
		}

		public void setLocalisation(String localisation) {
			this.localisation = localisation;
		}

}
