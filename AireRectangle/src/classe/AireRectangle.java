package classe;

public class AireRectangle {
	
	//Attributs
	public 	int 	hauteur;
	public 	int 	largeur;
	
	//Constructeur
	public AireRectangle()
	{
		hauteur	= 2;
		largeur	= 2;
	}
	
	//Permet de calculer l'aire
	public int calculerAire()
	{
		return hauteur * largeur;
	}
	
	//Permet d'afficher les attributs
	public String afficherAttribut()
	{
		String affichage = "";
		
		affichage += "La hauteur du rectangle est de " + hauteur;
		affichage += "\nLa largeur du rectangle est de " + largeur;
		
		return affichage;
	}

}
