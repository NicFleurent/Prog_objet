package test;

import classe.Pointage;

public class Test {

	public static void main(String[] args) {
		
		Pointage unPoint = new Pointage();
		System.out.println(unPoint);
		
		unPoint.ajouterPoint(-1000);
		System.out.println(unPoint);
		

		unPoint.setPointageMax(100);
		unPoint.ajouterPoint(1000);
		System.out.println(unPoint);
		
		Pointage deuxPoint = new Pointage("Nicolas", 235, 300);
		System.out.println(deuxPoint);

	}

}
