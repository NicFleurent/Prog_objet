/***********************************************************************

Le fichier:			Tache.java

Projet:				Laboratoire7_Tache

Objectifs:			Comparer les t�ches selon le co�t

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2023-03-30

***********************************************************************/

package pkClasse;

import java.util.*;

public class CompareCout implements Comparator<Tache> {
	
	public int compare(Tache uneTache, Tache deuxTache) {
		int resultat;
		
		if(uneTache.getCout() < deuxTache.getCout()) {
			resultat = -1;
		}
		else if(uneTache.getCout() == deuxTache.getCout()) {
			resultat = 0;
		}
		else {
			resultat = 1;
		}
		
		return resultat;
	}

}
