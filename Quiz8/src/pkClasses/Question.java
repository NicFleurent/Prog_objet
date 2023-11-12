package pkClasses;

public class Question implements Complexite {

	private String question;
	private String reponse;
	private int niveauComplexite;
	
	public Question ( )
	{
		question = "aucune";
		reponse = "aucune";
		//Il aurait fallu ajouter le niveau de complexite
	}
	
	public Question ( String q, String r )
	{
		question = q;
		reponse = r;
		//Il aurait fallu ajouter le niveau de complexite
	}
	
	public String getQuestion ( ) 
	{
		return question;
	}
	
	public void setQuestion ( String question ) 
	{
		this.question = question;
	}
	
	public String getReponse ( ) 
	{
		return reponse;
	}
	
	public void setReponse ( String reponse ) 
	{
		this.reponse = reponse;
	}
	
	public void setComplexite(int _complexite) {
		niveauComplexite = _complexite;
	}
	
	public int getComplexite() {
		return niveauComplexite;
	}

	// Cr�ation d'une m�thode du nom de verifierReponse
	// permettant de v�rifier si la r�ponse entr�e par l'utilisateur
	// est la bonne r�ponse � cette question.
	// De plus, l'utilisateur peut inscrire la r�ponse en lettres minuscules
	// comme en lettres majuscules.
	
	public boolean verifierReponse(String reponsePossible)
	{
			return (reponse.equalsIgnoreCase((reponsePossible)));
	}
	
	public String toString ( )
	{
	return "question= " + question + "reponse= " + reponse + 
	 "niveau complexite= " + niveauComplexite ;
	}

	
}
