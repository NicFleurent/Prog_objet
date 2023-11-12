package etudiant;

public class Etudiant {

	private     String    nom;
	private     String    prenom;
	private   	Adresse   AdresseMaison;
	private   	Adresse   AdresseEcole;
	
	
	public Etudiant() {
		
		nom = "Doe";
		prenom = "John";
		AdresseMaison = new Adresse();
		AdresseEcole = new Adresse();
	}
	
	public Etudiant(String _nom, String _prenom, Adresse _adresseMaison, Adresse _adresseEcole) {
		
		nom = _nom;
		prenom = _prenom;
		AdresseMaison = _adresseMaison;
		AdresseEcole = _adresseEcole;
	}
	
	
	public Adresse getAdresseMaison() {
		return AdresseMaison;
	}



	public void setAdresseMaison(Adresse _adresseMaison) {
		AdresseMaison = _adresseMaison;
	}



	public Adresse getAdresseEcole() {
		return AdresseEcole;
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

	public void setAdresseEcole(Adresse _adresseEcole) {
		AdresseEcole = _adresseEcole;
	}


	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", AdresseMaison=" + AdresseMaison + ", AdresseEcole="
				+ AdresseEcole + "]";
	}



	
	
	
	
	
}
