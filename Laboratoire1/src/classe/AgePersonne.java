/***********************************************************************

Le fichier:			AgePersonne.java

Projet:				Laboratoire1

Objectifs:			G�rer l'�ge de la personne.

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2023-01-28

***********************************************************************/

package classe;

public class AgePersonne {
	
	//Attributs
	public String 	prenom;
	public String 	nom;
	public int		age;
	
	//Constructeur
	public AgePersonne()
	{
		prenom 	= "non d�fini";
		nom 	= "non d�fini";
		age		= 0;
	}
	
	//Retourne age + 10 ans
	public int calculerDixAns()
	{
		int dixAns;
		
		dixAns = age + 10;
		
		return dixAns;
	}
	
	//Trouve l'ann�e de naissance
	public int trouverAnneeNaissance()
	{
		long 		anneeActu = 1970 + (System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);
		
		int			anneeNaissance;
		
		anneeNaissance = (int) anneeActu - age;
		
		return anneeNaissance;
	}
	
	//Assemble le nom
	public String AssemblerNom()
	{
		String nomComplet;
		
		nomComplet = prenom + " " + nom;
		
		return nomComplet;
	}
	
	//Retourne attribut
	public String afficherAttribut()
	{
		String affichage = "";
		
		affichage += "Le pr�nom est " + prenom;
		affichage += "\nLe nom est " + nom;
		affichage += "\nL'age est " + age;
		
		return affichage;
	}

}
