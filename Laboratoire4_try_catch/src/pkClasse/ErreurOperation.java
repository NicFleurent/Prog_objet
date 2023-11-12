/***********************************************************************

Le fichier:			ErreurOperation.java

Projet:				Laboratoire4_try_catch

Objectifs:			Créer des messages d'erreur pour les opérations

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-03-01

***********************************************************************/

package pkClasse;

public class ErreurOperation extends Exception 
{
	private String typeErreur;
	
	public ErreurOperation() {
		typeErreur = null;
	}
	
	public ErreurOperation(String _typeErreur) {
		typeErreur = _typeErreur;
	}
	
	public String message() {
		if(typeErreur == "negatif")	
			return "Le nombre doit être positif pour cette opération";
		else if(typeErreur == "montantRetraitInf")
			return "Le montant pour un retrait doit être moins élevé que le solde du compte";
		else
			return "L'opération n'est pas valide";
	}
}
