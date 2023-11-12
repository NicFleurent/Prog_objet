package pkClasse;

public class Etudiant {
	
	private String prenom;
	private String nom;
	private Adresse adresseEcole;
	private Adresse adresseMaison;
	
	public Etudiant()
	{
		prenom = "Nicolas";
		nom = "Fleurent";
		adresseEcole = new Adresse();
		adresseMaison = new Adresse();
	}
	
	public Etudiant(String _prenom, String _nom, Adresse adrE, Adresse adrM)
	{
		prenom = _prenom;
		nom = _nom;
		adresseEcole = adrE;
		adresseMaison = adrM;
	}
	
	public void setPrenom(String _prenom)
	{
		prenom = _prenom;
	}
	
	public void setNom(String _nom)
	{
		nom = _nom;
	}
	
	public void setAdresseEcole(Adresse adrE)
	{
		adresseEcole = adrE;
	}
	
	public void setAdresseMaison(Adresse adrM)
	{
		adresseMaison = adrM;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public Adresse getAdresseMaison()
	{
		return adresseMaison;
	}
	
	public Adresse getAdresseEcole()
	{
		return adresseEcole;
	}
	
	public String toString()
	{
		return "Etudiant [nom=" + nom + " prenom=" + prenom + " adresseMaison=" + adresseMaison + " adresseEcole =" + adresseEcole + "]";
	}

}
