/***********************************************************************

Le fichier:			FlipMonnaie.java

Projet:				Laboratoire2

Objectifs:			Lancer une pièce de monnaie

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-02-02

***********************************************************************/

package pkClasse;

public class FlipMonnaie {
	
	private boolean coteMonnaie;
	private final boolean PILE = false;
	private final boolean FACE = true;
	
	
	
	public FlipMonnaie()
	{
		coteMonnaie = false;
	}
	
	public FlipMonnaie(boolean _cote)
	{
		coteMonnaie = _cote;
	}
	
	public void setCoteMonnaie(boolean _cote)
	{
		coteMonnaie = _cote;
	}
	
	public boolean getCoteMonnaie()
	{
		return coteMonnaie;
	}
	
	public int lancer()
	{
		int cote;
		
		cote = (int) (Math.random() * 2);
		
		if(cote == 1)
			coteMonnaie = true;
		else
			coteMonnaie = false;
		
		return cote;
	}
	
	public boolean gagner()
	{
		if(coteMonnaie == PILE)
			return true;
		else
			return false;
	}
	
	public String afficherTerme()
	{
		String resultat;
		
		if(coteMonnaie == FACE)
			resultat = "Face";
		else
			resultat = "Pile";
		
		return resultat;
	}
	
	public String toString()
	{
		return ("coteMonnaie vaut " + coteMonnaie);
	}
	

}
