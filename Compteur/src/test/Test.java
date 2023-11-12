package test;

import classe.Compteur;

public class Test {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		
		Compteur unCompteur = new Compteur();
		
		System.out.println(unCompteur.afficher());
		
		unCompteur.incrementer(2);
		
		System.out.println(unCompteur.afficher());
		
		unCompteur.compteur = 10;
		
		System.out.println(unCompteur.afficher());
		
		Compteur deuxCompteur = new Compteur();

		deuxCompteur.compteur = 8;
		
		System.out.println(unCompteur.afficher());

	}

}
