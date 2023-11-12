/***********************************************************************

Le fichier:			ErreurDate.java

Projet:				Laboratoire4_try_catch

Objectifs:			Cr�er des messages d'erreur pour les �tudiants

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2023-03-06

***********************************************************************/

package pkClasse;

public class ErreurEtudiant extends Exception {
	
	private String typeErreur;
	
	public ErreurEtudiant() {
		typeErreur = null;
	}
	
	public ErreurEtudiant(String _typeErreur) {
		typeErreur = _typeErreur;
	}
	
	public String message() {
		if(typeErreur == "note")	
			return "Une note n'est pas valide";
		else if(typeErreur == "pond")
			return "Une pond�ration n'est pas valide";
		else if(typeErreur == "pond100")
			return "Le total des pond�rations n'�gal pas 100";
		else if(typeErreur == "abandon")
			return "L'�tudiant a abandonn�";
		else
			return "Erreur de la classe Etudiant";
	}

}
