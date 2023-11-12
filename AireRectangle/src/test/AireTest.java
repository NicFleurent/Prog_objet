package test;

import classe.AireRectangle;

public class AireTest {

	public static void main(String[] args) {
		
		AireRectangle unRectangle = new AireRectangle();
		
		System.out.println("L'aire du rectangle est de " + unRectangle.calculerAire());
		
		unRectangle.largeur = 5;
		
		unRectangle.hauteur = 10;
		
		System.out.println("L'aire du rectangle est de " + unRectangle.calculerAire());
		
		System.out.println(unRectangle.afficherAttribut());

	}

}
