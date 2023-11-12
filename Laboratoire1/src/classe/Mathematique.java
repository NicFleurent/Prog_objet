/***********************************************************************

Le fichier:			Mathemtique.java

Projet:				Laboratoire1

Objectifs:			Faire des opérations mathématiques.

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-01-28

***********************************************************************/

package classe;

import java.text.DecimalFormat;

public class Mathematique {
	
	DecimalFormat zeroChiffre = new DecimalFormat("0");
	
	//Attributs
	public double nbr1;
	public double nbr2;
	
	//Constructeur
	public Mathematique()
	{
		nbr1 = 0;
		nbr2 = 0;
	}
	
	//Retourne valeur absolu
	public double calculerValAbsNbr1()
	{
		double valAbs = 0;
		
		if (nbr1 < 0)
			valAbs = nbr1 * -1;
		else
			valAbs = nbr1;
		
		return valAbs;
	}
	
	//Retourne valeur absolu
	public double calculerValAbsNbr2()
	{
		double valAbs = 0;
		
		if (nbr2 < 0)
			valAbs = nbr2 * -1;
		else
			valAbs = nbr2;
		
		return valAbs;
	}
	
	//Retourne la valeur maximale
	public double calculerMax()
	{
		double max = 0;
		
		if (nbr1 < nbr2)
			max = nbr2;
		else
			max = nbr1;
		
		return max;
	}
	
	//Retourne la valeur minimum
	public double calculerMin()
	{
		double min = 0;
		
		if (nbr1 > nbr2)
			min = nbr2;
		else
			min = nbr1;
		
		return min;
	}
	
	//Retourne la puissance
	public double calculerPuissance()
	{
		double puissance = 1;
		
		if (nbr2 > 0)
			for (int ctr = 0 ; ctr < nbr2 ; ctr++)
				puissance *= nbr1;
		else if (nbr2 < 0)
			for (int ctr = 0 ; ctr < nbr2 ; ctr++)
				puissance /= nbr1;
		
		return puissance;
	}
	
	//Retourne la racine carré
	public double calculerRacine()
	{
		double diviseur;
		
		double racineCarre = nbr1 / 2;
		
		do {
			diviseur 	= racineCarre;
			racineCarre = (diviseur + (nbr1 / diviseur)) / 2;
		} while ((diviseur - racineCarre) != 0);
		
		return racineCarre;
	}
	
	//Retourne Somme
	public double calculerSomme()
	{
		double somme;
		
		somme = nbr1 + nbr2;
		
		return somme;
	}
	
	//Retourne moyenne
	public double calculerMoy()
	{
		double moy;
		
		moy = calculerSomme() / 2;
		
		return moy;
	}
	
	//Retourne attribut
	public String afficherAttribut()
	{
		String affichage = "";
		
		affichage += "Le premier nombre vaut " + zeroChiffre.format(nbr1);
		affichage += "\nLe deuxieme nombre vaut " + zeroChiffre.format(nbr2);
		
		return affichage;
	}
	

}
