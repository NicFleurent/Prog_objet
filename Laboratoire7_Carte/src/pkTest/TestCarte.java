/***********************************************************************

Le fichier:			TestCarte.java

Projet:				Laboratoire7_Carte

Objectifs:			Tester le jeu de cartes

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-03-30

***********************************************************************/

package pkTest;

import pkClasse.*;
import java.util.*;

public class TestCarte {
	
	private static String couleurs[] =
		{
				"coeur",
				"carreau",
				"trèfle",
				"pique"
		};
	
	private static int faces[] =
		{
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
		};
	
	private static Carte cartes[] = new Carte[52];

	public static void main(String[] args) {
		
		for(int ctrCouleur = 0 ; ctrCouleur < couleurs.length ; ctrCouleur++) {
			
			for(int ctrFace = 0 ; ctrFace < faces.length ; ctrFace++) {
				cartes[(ctrCouleur * 13) + ctrFace] = new Carte(couleurs[ctrCouleur], faces[ctrFace]);
			}
		}
		
		ArrayList<Carte> jeuDeCarte = new ArrayList<Carte>(Arrays.asList(cartes));
		
		System.out.println("--------------------------------------------");
		System.out.println("Afficher toutes les cartes du jeu de cartes");
		System.out.println(jeuDeCarte);

		System.out.println("--------------------------------------------");
		System.out.println("Brasser toutes les cartes du jeu");
		Collections.shuffle(jeuDeCarte);
		System.out.println(jeuDeCarte);

		System.out.println("--------------------------------------------");
		System.out.println("Interchanger les positions 2 et 4 des cartes");
		Collections.swap(jeuDeCarte, 2, 4);
		System.out.println(jeuDeCarte);

		System.out.println("--------------------------------------------");
		System.out.println("Trier les cartes en ordre de faces de la carte");
		Collections.sort(jeuDeCarte);
		System.out.println(jeuDeCarte);

		System.out.println("--------------------------------------------");
		System.out.println("Faites une rotation avant des cartes");
		Collections.rotate(jeuDeCarte, 1);
		System.out.println(jeuDeCarte);

		System.out.println("--------------------------------------------");
		System.out.println("Inverser l'ordre de toutes les cartes du jeu");
		Collections.reverse(jeuDeCarte);
		System.out.println(jeuDeCarte);

		System.out.println("--------------------------------------------");
		System.out.println("Inverser l'ordre de toutes les cartes du jeu mais, te servir de la commande de tri");
		Collections.sort(jeuDeCarte, Collections.reverseOrder());
		System.out.println(jeuDeCarte);

	}

}

//--------------------------------------------
//Afficher toutes les cartes du jeu de cartes
//[As de coeur
//, Deux de coeur
//, Trois de coeur
//, Quatre de coeur
//, Cinq de coeur
//, Six de coeur
//, Sept de coeur
//, Huit de coeur
//, Neuf de coeur
//, Dix de coeur
//, Valet de coeur
//, Reine de coeur
//, Roi de coeur
//, As de carreau
//, Deux de carreau
//, Trois de carreau
//, Quatre de carreau
//, Cinq de carreau
//, Six de carreau
//, Sept de carreau
//, Huit de carreau
//, Neuf de carreau
//, Dix de carreau
//, Valet de carreau
//, Reine de carreau
//, Roi de carreau
//, As de trèfle
//, Deux de trèfle
//, Trois de trèfle
//, Quatre de trèfle
//, Cinq de trèfle
//, Six de trèfle
//, Sept de trèfle
//, Huit de trèfle
//, Neuf de trèfle
//, Dix de trèfle
//, Valet de trèfle
//, Reine de trèfle
//, Roi de trèfle
//, As de pique
//, Deux de pique
//, Trois de pique
//, Quatre de pique
//, Cinq de pique
//, Six de pique
//, Sept de pique
//, Huit de pique
//, Neuf de pique
//, Dix de pique
//, Valet de pique
//, Reine de pique
//, Roi de pique
//]
//--------------------------------------------
//Brasser toutes les cartes du jeu
//[Huit de trèfle
//, Roi de carreau
//, Trois de coeur
//, Quatre de carreau
//, Sept de trèfle
//, Neuf de coeur
//, Neuf de pique
//, Dix de pique
//, Neuf de carreau
//, As de pique
//, Dix de trèfle
//, Reine de coeur
//, Valet de pique
//, Six de carreau
//, Deux de trèfle
//, Valet de carreau
//, Cinq de trèfle
//, As de trèfle
//, As de carreau
//, Trois de trèfle
//, Roi de trèfle
//, Cinq de pique
//, Sept de carreau
//, Roi de pique
//, Six de trèfle
//, Reine de carreau
//, Valet de coeur
//, Six de coeur
//, Deux de carreau
//, Quatre de coeur
//, Deux de coeur
//, Sept de pique
//, As de coeur
//, Six de pique
//, Trois de carreau
//, Quatre de trèfle
//, Quatre de pique
//, Roi de coeur
//, Reine de trèfle
//, Valet de trèfle
//, Deux de pique
//, Dix de carreau
//, Huit de coeur
//, Trois de pique
//, Cinq de carreau
//, Huit de pique
//, Dix de coeur
//, Huit de carreau
//, Sept de coeur
//, Neuf de trèfle
//, Reine de pique
//, Cinq de coeur
//]
//--------------------------------------------
//Interchanger les positions 2 et 4 des cartes
//[Huit de trèfle
//, Roi de carreau
//, Sept de trèfle
//, Quatre de carreau
//, Trois de coeur
//, Neuf de coeur
//, Neuf de pique
//, Dix de pique
//, Neuf de carreau
//, As de pique
//, Dix de trèfle
//, Reine de coeur
//, Valet de pique
//, Six de carreau
//, Deux de trèfle
//, Valet de carreau
//, Cinq de trèfle
//, As de trèfle
//, As de carreau
//, Trois de trèfle
//, Roi de trèfle
//, Cinq de pique
//, Sept de carreau
//, Roi de pique
//, Six de trèfle
//, Reine de carreau
//, Valet de coeur
//, Six de coeur
//, Deux de carreau
//, Quatre de coeur
//, Deux de coeur
//, Sept de pique
//, As de coeur
//, Six de pique
//, Trois de carreau
//, Quatre de trèfle
//, Quatre de pique
//, Roi de coeur
//, Reine de trèfle
//, Valet de trèfle
//, Deux de pique
//, Dix de carreau
//, Huit de coeur
//, Trois de pique
//, Cinq de carreau
//, Huit de pique
//, Dix de coeur
//, Huit de carreau
//, Sept de coeur
//, Neuf de trèfle
//, Reine de pique
//, Cinq de coeur
//]
//--------------------------------------------
//Trier les cartes en ordre de faces de la carte
//[As de carreau
//, Deux de carreau
//, Trois de carreau
//, Quatre de carreau
//, Cinq de carreau
//, Six de carreau
//, Sept de carreau
//, Huit de carreau
//, Neuf de carreau
//, Dix de carreau
//, Valet de carreau
//, Reine de carreau
//, Roi de carreau
//, As de coeur
//, Deux de coeur
//, Trois de coeur
//, Quatre de coeur
//, Cinq de coeur
//, Six de coeur
//, Sept de coeur
//, Huit de coeur
//, Neuf de coeur
//, Dix de coeur
//, Valet de coeur
//, Reine de coeur
//, Roi de coeur
//, As de pique
//, Deux de pique
//, Trois de pique
//, Quatre de pique
//, Cinq de pique
//, Six de pique
//, Sept de pique
//, Huit de pique
//, Neuf de pique
//, Dix de pique
//, Valet de pique
//, Reine de pique
//, Roi de pique
//, As de trèfle
//, Deux de trèfle
//, Trois de trèfle
//, Quatre de trèfle
//, Cinq de trèfle
//, Six de trèfle
//, Sept de trèfle
//, Huit de trèfle
//, Neuf de trèfle
//, Dix de trèfle
//, Valet de trèfle
//, Reine de trèfle
//, Roi de trèfle
//]
//--------------------------------------------
//Faites une rotation avant des cartes
//[Roi de trèfle
//, As de carreau
//, Deux de carreau
//, Trois de carreau
//, Quatre de carreau
//, Cinq de carreau
//, Six de carreau
//, Sept de carreau
//, Huit de carreau
//, Neuf de carreau
//, Dix de carreau
//, Valet de carreau
//, Reine de carreau
//, Roi de carreau
//, As de coeur
//, Deux de coeur
//, Trois de coeur
//, Quatre de coeur
//, Cinq de coeur
//, Six de coeur
//, Sept de coeur
//, Huit de coeur
//, Neuf de coeur
//, Dix de coeur
//, Valet de coeur
//, Reine de coeur
//, Roi de coeur
//, As de pique
//, Deux de pique
//, Trois de pique
//, Quatre de pique
//, Cinq de pique
//, Six de pique
//, Sept de pique
//, Huit de pique
//, Neuf de pique
//, Dix de pique
//, Valet de pique
//, Reine de pique
//, Roi de pique
//, As de trèfle
//, Deux de trèfle
//, Trois de trèfle
//, Quatre de trèfle
//, Cinq de trèfle
//, Six de trèfle
//, Sept de trèfle
//, Huit de trèfle
//, Neuf de trèfle
//, Dix de trèfle
//, Valet de trèfle
//, Reine de trèfle
//]
//--------------------------------------------
//Inverser l'ordre de toutes les cartes du jeu
//[Reine de trèfle
//, Valet de trèfle
//, Dix de trèfle
//, Neuf de trèfle
//, Huit de trèfle
//, Sept de trèfle
//, Six de trèfle
//, Cinq de trèfle
//, Quatre de trèfle
//, Trois de trèfle
//, Deux de trèfle
//, As de trèfle
//, Roi de pique
//, Reine de pique
//, Valet de pique
//, Dix de pique
//, Neuf de pique
//, Huit de pique
//, Sept de pique
//, Six de pique
//, Cinq de pique
//, Quatre de pique
//, Trois de pique
//, Deux de pique
//, As de pique
//, Roi de coeur
//, Reine de coeur
//, Valet de coeur
//, Dix de coeur
//, Neuf de coeur
//, Huit de coeur
//, Sept de coeur
//, Six de coeur
//, Cinq de coeur
//, Quatre de coeur
//, Trois de coeur
//, Deux de coeur
//, As de coeur
//, Roi de carreau
//, Reine de carreau
//, Valet de carreau
//, Dix de carreau
//, Neuf de carreau
//, Huit de carreau
//, Sept de carreau
//, Six de carreau
//, Cinq de carreau
//, Quatre de carreau
//, Trois de carreau
//, Deux de carreau
//, As de carreau
//, Roi de trèfle
//]
//--------------------------------------------
//Inverser l'ordre de toutes les cartes du jeu mais, te servir de la commande de tri
//[Roi de trèfle
//, Reine de trèfle
//, Valet de trèfle
//, Dix de trèfle
//, Neuf de trèfle
//, Huit de trèfle
//, Sept de trèfle
//, Six de trèfle
//, Cinq de trèfle
//, Quatre de trèfle
//, Trois de trèfle
//, Deux de trèfle
//, As de trèfle
//, Roi de pique
//, Reine de pique
//, Valet de pique
//, Dix de pique
//, Neuf de pique
//, Huit de pique
//, Sept de pique
//, Six de pique
//, Cinq de pique
//, Quatre de pique
//, Trois de pique
//, Deux de pique
//, As de pique
//, Roi de coeur
//, Reine de coeur
//, Valet de coeur
//, Dix de coeur
//, Neuf de coeur
//, Huit de coeur
//, Sept de coeur
//, Six de coeur
//, Cinq de coeur
//, Quatre de coeur
//, Trois de coeur
//, Deux de coeur
//, As de coeur
//, Roi de carreau
//, Reine de carreau
//, Valet de carreau
//, Dix de carreau
//, Neuf de carreau
//, Huit de carreau
//, Sept de carreau
//, Six de carreau
//, Cinq de carreau
//, Quatre de carreau
//, Trois de carreau
//, Deux de carreau
//, As de carreau
//]
