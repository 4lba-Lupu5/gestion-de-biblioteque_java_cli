package bibliopack;

public class Livre {
	private String genre;
	private int nb_pages;
	private String auteur_prenom;
	private String auteur_nom;
	private String titre;
	private int isbn;
	private boolean disponibilite;
	private int id_abonne;
	
	
	public Livre(String genre, int nb_pages, String auteur_prenom, String auteur_nom, String titre, int isbn) {
		this.genre = genre;
		this.nb_pages = nb_pages;
		this.auteur_prenom = auteur_prenom;
		this.auteur_nom = auteur_nom;
		this.titre = titre;
		this.isbn = isbn;
		disponibilite = true;
		id_abonne = -1;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setNbPages(int nb) {
		nb_pages = nb;
	}
	
	public void setAuteurPrenom(String prenom) {
		auteur_prenom = prenom;
	}
	
	public void setAuteurNom(String nom) {
		auteur_nom = nom;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public void setDisponibility(boolean dis) {
		disponibilite = dis;
	}
	
	public void setIdAbonne(int id_a) {
		id_abonne = id_a;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getNbPages() {
		return nb_pages;
	}
	
	public String getAuteurPrenom() {
		return auteur_prenom;
	}
	
	public String getAuteurNom() {
		return auteur_nom;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public boolean getDisponibility() {
		return disponibilite;
	}
	
	public int getIdAbonne() {
		return id_abonne;
	}
	
	public void emprunterLivre(int ida) {
		if(disponibilite) {
		if(isbn != -1) {
			System.out.println("L'abonne a deja emprunter un livre");
		}	else {
		this.disponibilite = false;
		this.id_abonne = ida;
		System.out.println("Livre emprunte avec succes");
		}
		} else {
			System.out.println("Livre indisponible car deja emprunte");
		}
	}
	
	public void retournerLivre() {
		this.disponibilite = true;
		this.id_abonne = -1;
	}
	
	public void modifierLivre(String genre, int nb_pages, String auteur_prenom, String auteur_nom, String titre, String isbn, boolean disponibilite, int id_abonne) {
		this.genre = genre;
		this.nb_pages = nb_pages;
		this.auteur_prenom = auteur_prenom;
		this.auteur_nom = auteur_nom;
	}

}
