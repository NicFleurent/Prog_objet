package pkClasse;

public class Adresse {
	
	private String rue;
	private String ville;
	private String codePostal;
	
	public Adresse()
	{
		rue = "des écoliers";
		ville = "Trois-Rivières";
		codePostal = "G9B 7W1";
	}
	
	public Adresse(String _rue, String _ville, String _cp)
	{
		rue = _rue;
		ville = _ville;
		codePostal = _cp;
	}
	
	public void setAdresse(String _rue, String _ville, String _cp)
	{
		rue = _rue;
		ville = _ville;
		codePostal = _cp;
	}
	
	public String toString()
	{
		return "rue=" + rue + " ville=" + ville + " codePostal=" + codePostal;
	}

}
