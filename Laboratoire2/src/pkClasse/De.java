/***********************************************************************

Le fichier:			De.java

Projet:				Laboratoire2

Objectifs:			Généré un dé et le lancer

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-01-31

***********************************************************************/

package pkClasse;

public class De {
	
	private int valFace;
	
	public De()
	{
		setValFace(1);
	}
	
	public De(int _face)
	{
		setValFace(_face);
	}
	
	public void setValFace(int _face)
	{
		if(_face <=6 && _face >= 1)
		{
			valFace = _face;
		}
		else
		{
			lancer();
		}
	}
	
	public int getValFace()
	{
		return valFace;
	}
	
	public void lancer()
	{
		valFace = 1 + (int) (Math.random() * 6);
	}
	
	public String toString()
	{
		return ("Le dé vaux " + valFace);
	}

}
