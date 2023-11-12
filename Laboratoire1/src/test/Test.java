/***********************************************************************

Le fichier:			Test.java

Projet:				Laboratoire1

Objectifs:			Tester les classes.

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-01-28

***********************************************************************/

package test;

import classe.Mathematique;
import classe.AgePersonne;
import classe.ChaineDeCaracteres;
import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		
		DecimalFormat zeroChiffre = new DecimalFormat("0");
		
		//Création des objets Mathematique
		Mathematique unMath 	= new Mathematique();
		Mathematique deuxMath 	= new Mathematique();
		
		//Définition des attributs unMath
		unMath.nbr1 	= 36;
		unMath.nbr2		= -4;
		
		//Définition des attributs deuxMath
		deuxMath.nbr1 	= 9;
		deuxMath.nbr2	= 2;
		
		//Test classe Mathematique
		System.out.println("Pour le premier objet, la valeur absolue du 2e nombre est " + zeroChiffre.format(unMath.calculerValAbsNbr2()));
		System.out.println("\nPour le premier objet, la valeur maximal est " + zeroChiffre.format(unMath.calculerMax()));
		System.out.println("\nPour le deuxième objet, la valeur minimal est " + zeroChiffre.format(deuxMath.calculerMin()));
		System.out.println("\nPour le deuxième objet, la valeur du premier à la puissance du 2e nombre est " + zeroChiffre.format(deuxMath.calculerPuissance()));
		System.out.println("\nPour le premier objet, la racine du premier est " + zeroChiffre.format(unMath.calculerRacine()));
		System.out.println("\nPour le deuxième objet, la somme des 2 nombres est " + zeroChiffre.format(deuxMath.calculerSomme()));
		System.out.println("\nPour le premier objet, la moyenne des deux nombres est " + zeroChiffre.format(unMath.calculerMoy()));
		System.out.println("\nPour le deuxième objet, la valeur des attributs est :\n" + deuxMath.afficherAttribut());
		
		
		//Création des objets AgePersonne
		AgePersonne unPersonne		= new AgePersonne();
		AgePersonne deuxPersonne	= new AgePersonne();
		
		//Définition des attributs unPersonne
		unPersonne.prenom	= "Nicolas";
		unPersonne.nom		= "Fleurent";
		unPersonne.age		= 25;
		
		//Définition des attributs deuxPersonne
		deuxPersonne.prenom	= "Yvan";
		deuxPersonne.nom	= "Dulait";
		deuxPersonne.age	= 43;
		
		//Test classe AgePersonne
		System.out.println("\nNicolas aura " + unPersonne.calculerDixAns() + " dans 10 ans.");
		System.out.println("\nYvan est née en " + deuxPersonne.trouverAnneeNaissance());
		System.out.println("\nLe nom complet de la première personne est " + unPersonne.AssemblerNom());
		System.out.println("\nPour la deuxième personne, la valeur des attributs est :\n" + deuxPersonne.afficherAttribut());
		
		
		//Création des objets ChaineDeCaractères
		ChaineDeCaracteres unChaine = new ChaineDeCaracteres();
		ChaineDeCaracteres deuxChaine = new ChaineDeCaracteres();
		
		//Définition des attributs unPersonne
		unChaine.chaineCar	= "Nicolas";
		
		//Définition des attributs unPersonne
		deuxChaine.chaineCar	= "Ceci Est Un Test";
		
		//Test classe ChaineDeCaractères
		System.out.println("\nLa longueur de la première chaine de caractères est " + unChaine.calculerLongueur());
		System.out.println("\n" + deuxChaine.comparerChaines(unChaine.chaineCar));
		System.out.println("\n" + unChaine.concatenerChaines(deuxChaine.chaineCar));
		System.out.println("\n" + unChaine.chercherPositionChar('e'));
		System.out.println("\n" + deuxChaine.chercherPositionChar('e'));
		System.out.println("\nLa sous chaine de la première chaine de la position 2 à 5 est " + unChaine.creerSousChaine(2, 5));
		System.out.println("\nVoici la première chaine avec les a changer en e : " + unChaine.remplacerAenE());
		System.out.println("\nVoici la deuxième chaine en minuscule : " + deuxChaine.changerEnMinuscule());
		System.out.println("\nVoici la deuxième chaine en majuscule : " + deuxChaine.changerEnMajuscule());
		System.out.println("\nPour la deuxième personne, la valeur de l'attribut est :\n" + deuxChaine.afficherAttribut());
		
		System.exit(0);
	}

}

/*Pour le premier objet, la valeur absolue du 2e nombre est 4

Pour le premier objet, la valeur maximal est 36

Pour le deuxième objet, la valeur minimal est 2

Pour le deuxième objet, la valeur du premier à la puissance du 2e nombre est 81

Pour le premier objet, la racine du premier est 6

Pour le deuxième objet, la somme des 2 nombres est 11

Pour le premier objet, la moyenne des deux nombres est 16

Pour le deuxième objet, la valeur des attributs est :
Le premier nombre vaut 9
Le deuxieme nombre vaut 2

Nicolas aura 35 dans 10 ans.

Yvan est née en 1980

Le nom complet de la première personne est Nicolas Fleurent

Pour la deuxième personne, la valeur des attributs est :
Le prénom est Yvan
Le nom est Dulait
L'age est 43

La longueur de la première chaine de caractères est 7

Les 2 chaines de caractères ne sont pas identiques

NicolasCeci Est Un Test

Le caractère n'est pas dans la chaine de caractères

La position du caractère est 1

La sous chaine de la première chaine de la position 2 à 5 est col

Voici la première chaine avec les a changer en e : Nicoles

Voici la deuxième chaine en minuscule : ceci est un test

Voici la deuxième chaine en majuscule : CECI EST UN TEST

Pour la deuxième personne, la valeur de l'attribut est :
La chaine de caractère est : Ceci Est Un Test*/
