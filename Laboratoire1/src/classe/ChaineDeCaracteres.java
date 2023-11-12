/***********************************************************************

Le fichier:			ChaineDeCaracteres.java

Projet:				Laboratoire1

Objectifs:			Gérer une chaine de caractères.

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-01-28

***********************************************************************/

package classe;

public class ChaineDeCaracteres {
	
	//Attributs
	public String chaineCar;
	
	//Contructeur
	public ChaineDeCaracteres()
	{
		chaineCar = "non défini";
	}
	
	//Retourne la longueur
	public int calculerLongueur()
	{
		int longueur;
		
		longueur = chaineCar.length();
		
		return longueur;
	}
	
	//Compare les chaines de caractères
	public String comparerChaines(String chaineComparer)
	{
		String resultat;
		
		if (chaineCar.compareTo(chaineComparer) == 0)
			resultat = "Les 2 chaines de caractères sont identiques";
		else
			resultat = "Les 2 chaines de caractères ne sont pas identiques";
		
		return resultat;
	}
	
	//Concatène un chaine à la fin
	public String concatenerChaines(String chaineAdd)
	{
		String chaineConcat;
		
		chaineConcat = chaineCar + chaineAdd;
		
		return chaineConcat;
	}
	
	//Retourne position du caractère
	public String chercherPositionChar(char unCar)
	{
		String retour;
		
		if (chaineCar.indexOf(unCar) >= 0)
			retour = "La position du caractère est " + chaineCar.indexOf(unCar);
		else
			retour = "Le caractère n'est pas dans la chaine de caractères";
		
		return retour;
	}
	
	//Retourne une sous-chaine comprise entre deux position
	public String creerSousChaine(int nbr1, int nbr2)
	{
		String sousChaine = "";
		
		sousChaine = chaineCar.substring(nbr1, nbr2);
		
		return sousChaine;
	}
	
	//Remplace les caractères a par des e
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
		
		affichage += "La chaine de caractère est : " + chaineCar;
		
		return affichage;
	}
	
	
	
}
