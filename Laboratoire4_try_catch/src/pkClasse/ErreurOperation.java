/***********************************************************************

Le fichier:			ErreurOperation.java

Projet:				Laboratoire4_try_catch

Objectifs:			Cr�er des messages d'erreur pour les op�rations

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2023-03-01

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
			return "Le nombre doit �tre positif pour cette op�ration";
		else if(typeErreur == "montantRetraitInf")
			return "Le montant pour un retrait doit �tre moins �lev� que le solde du compte";
		else
			return "L'op�ration n'est pas valide";
	}
}
