/***********************************************************************

Le fichier:			ErreurDate.java

Projet:				Laboratoire4_try_catch

Objectifs:			Créer des messages d'erreur pour les étudiants

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-03-06

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
			return "Une pondération n'est pas valide";
		else if(typeErreur == "pond100")
			return "Le total des pondérations n'égal pas 100";
		else if(typeErreur == "abandon")
			return "L'étudiant a abandonné";
		else
			return "Erreur de la classe Etudiant";
	}

}
