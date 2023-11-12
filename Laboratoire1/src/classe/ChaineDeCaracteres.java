/***********************************************************************

Le fichier:			ChaineDeCaracteres.java

Projet:				Laboratoire1

Objectifs:			G�rer une chaine de caract�res.

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2023-01-28

***********************************************************************/

package classe;

public class ChaineDeCaracteres {
	
	//Attributs
	public String chaineCar;
	
	//Contructeur
	public ChaineDeCaracteres()
	{
		chaineCar = "non d�fini";
	}
	
	//Retourne la longueur
	public int calculerLongueur()
	{
		int longueur;
		
		longueur = chaineCar.length();
		
		return longueur;
	}
	
	//Compare les chaines de caract�res
	public String comparerChaines(String chaineComparer)
	{
		String resultat;
		
		if (chaineCar.compareTo(chaineComparer) == 0)
			resultat = "Les 2 chaines de caract�res sont identiques";
		else
			resultat = "Les 2 chaines de caract�res ne sont pas identiques";
		
		return resultat;
	}
	
	//Concat�ne un chaine � la fin
	public String concatenerChaines(String chaineAdd)
	{
		String chaineConcat;
		
		chaineConcat = chaineCar + chaineAdd;
		
		return chaineConcat;
	}
	
	//Retourne position du caract�re
	public String chercherPositionChar(char unCar)
	{
		String retour;
		
		if (chaineCar.indexOf(unCar) >= 0)
			retour = "La position du caract�re est " + chaineCar.indexOf(unCar);
		else
			retour = "Le caract�re n'est pas dans la chaine de caract�res";
		
		return retour;
	}
	
	//Retourne une sous-chaine comprise entre deux position
	public String creerSousChaine(int nbr1, int nbr2)
	{
		String sousChaine = "";
		
		sousChaine = chaineCar.substring(nbr1, nbr2);
		
		return sousChaine;
	}
	
	//Remplace les caract�res a par des e
	public String remplacerAenE()
	{
		String chaineModif;
		
		chaineModif = chaineCar.replace('a', 'e');
		
		return chaineModif;
	}
	
	//Retourne la chaine en mainuscule
	public String changerEnMinuscule()
	{
		String minuscule;
		
		minuscule = chaineCar.toLowerCase();
		
		return minuscule;
	}
	
	//Retourne la chaine en majuscule
	public String changerEnMajuscule()
	{
		String majuscule;
		
		majuscule = chaineCar.toUpperCase();
		
		return majuscule;
	}
	
	//Retourne attribut
	public String afficherAttribut()
	{
		String affichage = "";
		
		affichage += "La chaine de caract�re est : " + chaineCar;
		
		return affichage;
	}
	
	
	
}
