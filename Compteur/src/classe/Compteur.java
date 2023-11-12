package classe;

public class Compteur {
	
	//Toujours mettre les attribut en premier dans la classe
	public int compteur;
	
	//Constructeur
	public Compteur()
	{
		compteur = 0;
	}
	
	//Permet d'augmenter le compteur
	public void incrementer(int nombre)
	{
		compteur += nombre;
	}
	
	//Permet de diminuer le compteur
	public void decrementer(int nombre)
	{
		compteur -= nombre;
	}
	
	//Permet d'Afficher le compteur
	public String afficher()
	{
		return "La valuer du compteur est de " + compteur;
	}

}
