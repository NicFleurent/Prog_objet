/***********************************************************************

Le fichier:			Equation.java

Projet:				Laboratoire2

Objectifs:			Généré des variables pour faire une équation

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-02-02

***********************************************************************/

package pkClasse;

public class Equation {
	
	private int nbr1;
	private int nbr2;
	
	public Equation()
	{
		setNbr1(6);
		setNbr2(1);
	}
	
	public Equation(int _nbr1, int _nbr2)
	{
		setNbr1(_nbr1);
		setNbr2(_nbr2);
	}
	
	public void setNbr1(int _nbr)
	{
		if(_nbr >= 6 && _nbr <= 10)
		{
			nbr1 = _nbr;
		}
		else
		{
			nbr1 = 6 + (int) (Math.random() * 5);
		}
	}
	
	public int getNbr1()
	{
		return nbr1;
	}
	
	public void setNbr2(int _nbr)
	{
		if(_nbr >= 1 && _nbr <= 5)
		{
			nbr2 = _nbr;
		}
		else
		{
			nbr2 = 1 + (int) (Math.random() * 5);
		}
	}
	
	public int getNbr2()
	{
		return nbr2;
	}
	
	public int genereAleatoire1()
	{
		nbr1 = 6 + (int) (Math.random() * 5);
		return nbr1;
	}
	
	public int genereAleatoire2()
	{
		nbr2 = 1 + (int) (Math.random() * 5);
		return nbr2;
	}
	
	private int calculFacto(int _nbr)
	{
		int factoriel = 1;
		
		for(int ctr = 1 ; ctr <= _nbr ; ctr++)
		{
			factoriel *= ctr;
		}
		
		return factoriel;
	}
	
	public int calculEquation()
	{
		int resultat = 0;
		
		resultat = calculFacto(nbr1) / (calculFacto(nbr2) * calculFacto(nbr1 - nbr2));
		
		return resultat;
	}
	
	public String toString()
	{
		return ("Le premier nombre vaut " + nbr1 +
				"\nLe deuxième nombre vaut " + nbr2);
	}

}
