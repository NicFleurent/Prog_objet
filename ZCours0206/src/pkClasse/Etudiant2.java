package pkClasse;

public class Etudiant2 {
	
	private String prenom;
	private String nom;
	private Adresse adresseEcole;
	private Adresse adresseMaison;
	
	public Etudiant2() {
		prenom = "test";
		nom = "test";
		adresseEcole = new Adresse();
		adresseMaison = new Adresse();
	}

	public Etudiant2(String prenom, String nom, Adresse adresseEcole, Adresse adresseMaison) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresseEcole = adresseEcole;
		this.adresseMaison = adresseMaison;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresseEcole() {
		return adresseEcole;
	}

	public void setAdresseEcole(Adresse adresseEcole) {
		this.adresseEcole = adresseEcole;
	}

	public Adresse getAdresseMaison() {
		return adresseMaison;
	}

	public void setAdresseMaison(Adresse adresseMaison) {
		this.adresseMaison = adresseMaison;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresseEcole == null) ? 0 : adresseEcole.hashCode());
		result = prime * result + ((adresseMaison == null) ? 0 : adresseMaison.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	
	//Ne jamais utiliser le equals généré automatiquement
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant2 other = (Etudiant2) obj;
		if (adresseEcole == null) {
			if (other.adresseEcole != null)
				return false;
		} else if (!adresseEcole.equals(other.adresseEcole))
			return false;
		if (adresseMaison == null) {
			if (other.adresseMaison != null)
				return false;
		} else if (!adresseMaison.equals(other.adresseMaison))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Etudiant2 [prenom=" + prenom + ", nom=" + nom + ", adresseEcole=" + adresseEcole + ", adresseMaison="
				+ adresseMaison + "]";
	}
	
	
	
	

}
