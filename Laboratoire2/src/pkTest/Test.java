/***********************************************************************

Le fichier:			Test.java

Projet:				Laboratoire2

Objectifs:			Tester les classes/objets créé

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-01-31

***********************************************************************/

package pkTest;

import javax.swing.*;
import pkClasse.*;


public class Test {

	public static void main(String[] args) {
		
		//Test classe De
		
		String[] option  = {" Lancer un dé ", 
							" Afficher la valeur des deux dés " ,
			                " Affecter une valeur à un dé ", 
			                " Afficher la somme des 2 dés ",   
			                " Quitter l’application "};
			
		int choix = 1, choixDe, valFace, somme;
		De unDe   = new De ( );
		De deuxDe = new De (5);
		
		JOptionPane.showMessageDialog(null, "Bienvenu dans l'application de lancer de dé");
		
		while ( choix != -1 )
		{	
		choix = JOptionPane.showOptionDialog ( 	null, 
											    "Sélectionnez votre choix parmi les options suivantes:", 
											    "Menu principal ---  Gestion du DE ",
											    JOptionPane.YES_NO_OPTION,
											    JOptionPane.PLAIN_MESSAGE, 
											    null, 
											    option, 
											    option[0] );
		
		switch ( choix )
		   {	  
		   case 0:  
			   choixDe = Integer.parseInt(JOptionPane.showInputDialog( "Quel dé voulez-vous lancer?   1 ou 2 " ));
			   
			   if(choixDe == 1)
			   {
				   unDe.lancer();
			   }
			   else if(choixDe == 2)
			   {
				   deuxDe.lancer();
			   }
			   else
				   JOptionPane.showMessageDialog(null, "Aucun dé n'a été lancé, s.v.p. entrez une valeur entre 1 et 2");
			   break;
		   
		   case 1:
			   JOptionPane.showMessageDialog(null, 	"1 - " + unDe +
					   								"\n2 - " + deuxDe);
			   break;
		   
		   case 2:
			   choixDe 	= Integer.parseInt(JOptionPane.showInputDialog( "À quel dé voulez-vous affecter une valeur?   1 ou 2 " ));
			   
			   if(choixDe == 1)
			   {
				   valFace	= Integer.parseInt(JOptionPane.showInputDialog( "Quel valeur voulez vous affecter?"));
				   unDe.setValFace(valFace);
			   }
			   else if(choixDe == 2)
			   {
				   valFace	= Integer.parseInt(JOptionPane.showInputDialog( "Quel valeur voulez vous affecter au dé?"));
				   deuxDe.setValFace(valFace);
			   }
			   else
				   JOptionPane.showMessageDialog(null, "S.v.p. entrez une valeur entre 1 et 2");
			   break;
			   
		   case 3:
			   somme = unDe.getValFace() + deuxDe.getValFace();
			   JOptionPane.showMessageDialog(null, "La somme des deux dés est de " + somme);
			   break;
			   
		   case 4: 
			   JOptionPane.showMessageDialog(null, "Vous allez quitter l'application");
			   choix = -1;
		
		   }
		}
		
		
		
		//Test classe Equation
		System.out.println("Test Equation");
		
		Equation unEquation = new Equation();
		Equation deuxEquation = new Equation(15, 2); //J'ai volontairement mis un chiffre hors des limites ici.
		
		System.out.println("Pour la première équation :\n" + unEquation + 
							"\nPour la seconde équation : \n" + deuxEquation);
		
		deuxEquation.setNbr1(9);
		unEquation.setNbr2(3);
		
		System.out.println("\nLe premier nombre de la deuxième équation est " + deuxEquation.getNbr1() + 
							"\nLe deuxième nombre de la premièe équation est " + unEquation.getNbr2());

		System.out.println("\nLe resultat du calcul de la première équation est " + unEquation.calculEquation());
		System.out.println("Le resultat du calcul de la première équation est " + deuxEquation.calculEquation());
		
		unEquation.genereAleatoire1();
		deuxEquation.genereAleatoire2();
		
		System.out.println("\nPour la première équation :\n" + unEquation + 
							"\nPour la seconde équation : \n" + deuxEquation);
		
		/*
		Test Equation
		Pour la première équation :
		Le premier nombre vaut 6
		Le deuxième nombre vaut 1
		Pour la seconde équation : 
		Le premier nombre vaut 6
		Le deuxième nombre vaut 2
		
		Le premier nombre de la deuxième équation est 9
		Le deuxième nombre de la premièe équation est 3
		
		Le resultat du calcul de la première équation est 20
		Le resultat du calcul de la première équation est 36
		
		Pour la première équation :
		Le premier nombre vaut 6
		Le deuxième nombre vaut 3
		Pour la seconde équation : 
		Le premier nombre vaut 9
		Le deuxième nombre vaut 3
		*/
		
		
		
		//Test FlipMonnaie
		System.out.println("\nTest FlipMonnaie");
		
		FlipMonnaie unePiece = new FlipMonnaie();
		FlipMonnaie deuxPiece = new FlipMonnaie(true);
		
		if(unePiece.lancer() == 1) //Cette façon de tester la méthode est-elle accepter?
			System.out.println("Le hasard a fait que la pièce est tombée du côté FACE");
		else
			System.out.println("Le hasard a fait que la pièce est tombée du côté PILE");
		
		System.out.println("La valeur de la pièce 1 est " + unePiece.getCoteMonnaie());
		
		deuxPiece.setCoteMonnaie(false);		
		
		if(deuxPiece.gagner())
			System.out.println("Vous êtes gagnant");
		else
			System.out.println("Meilleure chance la prochaine fois");
		
		System.out.println("La pièce s'est retournée du côté " + unePiece.afficherTerme());
		
		System.out.println("Pour la 2e pièce : " + unePiece);
		
		/*
		Test FlipMonnaie
		Le hasard a fait que la pièce est tombée du côté FACE
		La valeur de la pièce 1 est true
		Meilleure chance la prochaine fois
		La pièce s'est retournée du côté Face
		Pour la 2e pièce : coteMonnaie vaut true
		*/
		
		
		//Test Temps
		System.out.println("\nTest Temps");
		Temps unTemps = new Temps();
		Temps deuxTemps = new Temps(3);
		Temps troisTemps = new Temps(22, 45);
		Temps quatreTemps = new Temps(0, 30, 55);
		
		unTemps.setHeure(12);
		deuxTemps.setSeconde(25);
		troisTemps.setMinute(30);
		
		System.out.println("Premier temps en affichage américain : " + unTemps.afficherAmericain());
		System.out.println("Deuxième temps en affichage américain : " + deuxTemps.afficherAmericain());
		System.out.println("Troisième temps en affichage américain : " + troisTemps.afficherAmericain());
		System.out.println("Quatrième temps en affichage américain : " + quatreTemps.afficherAmericain());
		
		System.out.println("\nPremier temps en affichage universelle : " + unTemps.afficherUniverselle());
		System.out.println("Deuxième temps en affichage universelle : " + deuxTemps.afficherUniverselle());
		System.out.println("Troisième temps en affichage universelle : " + troisTemps.afficherUniverselle());
		System.out.println("Quatrième temps en affichage universelle : " + quatreTemps.afficherUniverselle());
		
		quatreTemps.setTemps(23, 60, 66);
		System.out.println("\nQuatrième temps :\n" + quatreTemps);
		
		System.out.println("\nTest get unTemps heure : " + unTemps.getHeure());
		System.out.println("Test get troisTemps minute : " + troisTemps.getMinute());
		System.out.println("Test get deuxTemps seconde : " + deuxTemps.getSeconde());
		
		/*
		Test Temps
		Premier temps en affichage américain : 12:00:00 PM
		Deuxième temps en affichage américain : 3:00:25 AM
		Troisième temps en affichage américain : 10:30:00 PM
		Quatrième temps en affichage américain : 12:30:55 AM
		
		Premier temps en affichage universelle : 12:00:00
		Deuxième temps en affichage universelle : 03:00:25
		Troisième temps en affichage universelle : 22:30:00
		Quatrième temps en affichage universelle : 00:30:55
		
		Quatrième temps :
		Heures : 23
		Minutes : 0
		Secondes : 0
		
		Test get unTemps heure : 12
		Test get troisTemps minute : 30
		Test get deuxTemps seconde : 25
		*/
		
		
		//Test CIDate
		System.out.println("\nTest CIDate");
		
		CIDate unDate = new CIDate();
		CIDate deuxDate = new CIDate(2012, 12, 12);
		
		System.out.println("Date 1 : " + unDate.afficherDate());
		System.out.println("Date 2 : " + deuxDate);
		
		unDate.setAnnee(2300);
		unDate.setMois(2);
		unDate.setJour(29);
		
		deuxDate.setAnnee(2004);
		deuxDate.setMois(2);
		deuxDate.setJour(29);
		
		System.out.println("\nDate 1 : " + unDate.afficherDate());
		System.out.println("Date 2 : " + deuxDate);
		
		System.out.println("\nTest get unDate annee : " + unDate.getAnnee());
		System.out.println("Test get unDate mois : " + unDate.getMois());
		System.out.println("Test get unDate jour : " + unDate.getJour());
		
		/*
		Test CIDate
		Date 1 : 1997/07/17
		Date 2 : CIDate[annee=2012,mois=12,jour=12]
		
		Date 1 : 2300/02/01
		Date 2 : CIDate[annee=2004,mois=2,jour=29]
		
		Test get unDate annee : 2300
		Test get unDate mois : 2
		Test get unDate jour : 1
		*/
		
		
		
		
		
	}
}
