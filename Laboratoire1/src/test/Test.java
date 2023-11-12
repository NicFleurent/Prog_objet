/***********************************************************************

Le fichier:			Test.java

Projet:				Laboratoire1

Objectifs:			Tester les classes.

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2023-01-28

***********************************************************************/

package test;

import classe.Mathematique;
import classe.AgePersonne;
import classe.ChaineDeCaracteres;
import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		
		DecimalFormat zeroChiffre = new DecimalFormat("0");
		
		//Cr�ation des objets Mathematique
		Mathematique unMath 	= new Mathematique();
		Mathematique deuxMath 	= new Mathematique();
		
		//D�finition des attributs unMath
		unMath.nbr1 	= 36;
		unMath.nbr2		= -4;
		
		//D�finition des attributs deuxMath
		deuxMath.nbr1 	= 9;
		deuxMath.nbr2	= 2;
		
		//Test classe Mathematique
		System.out.println("Pour le premier objet, la valeur absolue du 2e nombre est " + zeroChiffre.format(unMath.calculerValAbsNbr2()));
		System.out.println("\nPour le premier objet, la valeur maximal est " + zeroChiffre.format(unMath.calculerMax()));
		System.out.println("\nPour le deuxi�me objet, la valeur minimal est " + zeroChiffre.format(deuxMath.calculerMin()));
		System.out.println("\nPour le deuxi�me objet, la valeur du premier � la puissance du 2e nombre est " + zeroChiffre.format(deuxMath.calculerPuissance()));
		System.out.println("\nPour le premier objet, la racine du premier est " + zeroChiffre.format(unMath.calculerRacine()));
		System.out.println("\nPour le deuxi�me objet, la somme des 2 nombres est " + zeroChiffre.format(deuxMath.calculerSomme()));
		System.out.println("\nPour le premier objet, la moyenne des deux nombres est " + zeroChiffre.format(unMath.calculerMoy()));
		System.out.println("\nPour le deuxi�me objet, la valeur des attributs est :\n" + deuxMath.afficherAttribut());
		
		
		//Cr�ation des objets AgePersonne
		AgePersonne unPersonne		= new AgePersonne();
		AgePersonne deuxPersonne	= new AgePersonne();
		
		//D�finition des attributs unPersonne
		unPersonne.prenom	= "Nicolas";
		unPersonne.nom		= "Fleurent";
		unPersonne.age		= 25;
		
		//D�finition des attributs deuxPersonne
		deuxPersonne.prenom	= "Yvan";
		deuxPersonne.nom	= "Dulait";
		deuxPersonne.age	= 43;
		
		//Test classe AgePersonne
		System.out.println("\nNicolas aura " + unPersonne.calculerDixAns() + " dans 10 ans.");
		System.out.println("\nYvan est n�e en " + deuxPersonne.trouverAnneeNaissance());
		System.out.println("\nLe nom complet de la premi�re personne est " + unPersonne.AssemblerNom());
		System.out.println("\nPour la deuxi�me personne, la valeur des attributs est :\n" + deuxPersonne.afficherAttribut());
		
		
		//Cr�ation des objets ChaineDeCaract�res
		ChaineDeCaracteres unChaine = new ChaineDeCaracteres();
		ChaineDeCaracteres deuxChaine = new ChaineDeCaracteres();
		
		//D�finition des attributs unPersonne
		unChaine.chaineCar	= "Nicolas";
		
		//D�finition des attributs unPersonne
		deuxChaine.chaineCar	= "Ceci Est Un Test";
		
		//Test classe ChaineDeCaract�res
		System.out.println("\nLa longueur de la premi�re chaine de caract�res est " + unChaine.calculerLongueur());
		System.out.println("\n" + deuxChaine.comparerChaines(unChaine.chaineCar));
		System.out.println("\n" + unChaine.concatenerChaines(deuxChaine.chaineCar));
		System.out.println("\n" + unChaine.chercherPositionChar('e'));
		System.out.println("\n" + deuxChaine.chercherPositionChar('e'));
		System.out.println("\nLa sous chaine de la premi�re chaine de la position 2 � 5 est " + unChaine.creerSousChaine(2, 5));
		System.out.println("\nVoici la premi�re chaine avec les a changer en e : " + unChaine.remplacerAenE());
		System.out.println("\nVoici la deuxi�me chaine en minuscule : " + deuxChaine.changerEnMinuscule());
		System.out.println("\nVoici la deuxi�me chaine en majuscule : " + deuxChaine.changerEnMajuscule());
		System.out.println("\nPour la deuxi�me personne, la valeur de l'attribut est :\n" + deuxChaine.afficherAttribut());
		
		System.exit(0);
	}

}

/*Pour le premier objet, la valeur absolue du 2e nombre est 4

Pour le premier objet, la valeur maximal est 36

Pour le deuxi�me objet, la valeur minimal est 2

Pour le deuxi�me objet, la valeur du premier � la puissance du 2e nombre est 81

Pour le premier objet, la racine du premier est 6

Pour le deuxi�me objet, la somme des 2 nombres est 11

Pour le premier objet, la moyenne des deux nombres est 16

Pour le deuxi�me objet, la valeur des attributs est :
Le premier nombre vaut 9
Le deuxieme nombre vaut 2

Nicolas aura 35 dans 10 ans.

Yvan est n�e en 1980

Le nom complet de la premi�re personne est Nicolas Fleurent

Pour la deuxi�me personne, la valeur des attributs est :
Le pr�nom est Yvan
Le nom est Dulait
L'age est 43

La longueur de la premi�re chaine de caract�res est 7

Les 2 chaines de caract�res ne sont pas identiques

NicolasCeci Est Un Test

Le caract�re n'est pas dans la chaine de caract�res

La position du caract�re est 1

La sous chaine de la premi�re chaine de la position 2 � 5 est col

Voici la premi�re chaine avec les a changer en e : Nicoles

Voici la deuxi�me chaine en minuscule : ceci est un test

Voici la deuxi�me chaine en majuscule : CECI EST UN TEST

Pour la deuxi�me personne, la valeur de l'attribut est :
La chaine de caract�re est : Ceci Est Un Test*/
