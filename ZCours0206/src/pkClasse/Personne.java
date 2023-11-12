package pkClasse;

public class Personne {
	
	private String nom;
	private String prenom;
	private Adresse adressePersonne;
	
	public Personne()
	{
		nom = "Fleurent";
		prenom = "Nicolas";
		adressePersonne = new Adresse();
	}
	
	public Personne(String _nom, String _prenom, Adresse unAdresse)
	{
		nom = _nom;
		prenom = _prenom;
		adressePersonne = unAdresse;
	}
	
	public void setAdresse(Adresse unAdresse)
	{
		adressePersonne = unAdresse;
	}
	
	public String toString()
	{
		return "nom=" + nom + " prenom=" + prenom + " adresse=" + adressePersonne;
	}

}
