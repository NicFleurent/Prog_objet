/***********************************************************************

Le fichier:			ErreurDate.java

Projet:				Laboratoire4_try_catch

Objectifs:			Créer des messages d'erreur pour les dates

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-02-28

***********************************************************************/

package pkClasse;

public class ErreurDate extends Exception 
{
	private String typeErreur;
	
	public ErreurDate() {
		typeErreur = null;
	}
	
	public ErreurDate(String _typeErreur) {
		typeErreur = _typeErreur;
	}
	
	public String message() {
		if(typeErreur == "jour")	
			return "Le jour de la date n'est pas valide";
		else if(typeErreur == "mois")
			return "Le mois de la date n'est pas valide";
		else
			return "La date n'est pas valide";
	}
}
