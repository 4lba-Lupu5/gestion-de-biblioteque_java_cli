package bibliopack;

public class Abonne {
	private int id_abonne;
	private String abonne_prenom;
	private String abonne_nom;
	private int age;
	private int isbn;
	
	public Abonne (int id, String prenom, String nom, int age) {
		this.id_abonne = id;
		this.abonne_prenom = prenom;
		this.abonne_nom = nom;
		this.age = age;
		this.isbn = (-1);
	}
	
	public void Afficher (int id_ab) {
		
	}
	
	public void setIdAbonne (int id_s) {
		id_abonne = id_s;
	}
	
	public void setAbonnePrenom(String prenom_set) {
		abonne_prenom = prenom_set;
	}
	
	public void setAbonneNom(String nom_set) {
		abonne_nom = nom_set;
	}
	
	public void setAge(int age_s) {
		age = age_s;
	}
	
	public void setIsbn(int isbn_s) {
		isbn = isbn_s;
	}
	
	public int getIdAbonne() {
		return id_abonne;
	}
	
	public String getAbonnePrenom() {
		return abonne_prenom;
	}
	
	public String getAbonneNom() {
		return abonne_nom;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getIsbn() {
		return isbn;
	}

}
