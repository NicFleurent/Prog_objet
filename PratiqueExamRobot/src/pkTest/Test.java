package pkTest;

import pkClasse.*;
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		
		Robot martini 	= new Robot(JOptionPane.showInputDialog("Entrer le nom du premier robot"), new ClDate(2000, 3, 15), new ClDate(2500, 3, 15));		
		Robot tequila 	= new Robot("Tequila", new ClDate(2000, 3, 15), new ClDate(3000, 3, 15));		
		
		Personne alice 		= new Personne("Alice", 18, 100);
		Personne benoit 	= new Personne("Benoit", 17, 50);
		Personne mathieu 	= new Personne("Mathieu", 14, 100);
		Personne emile 		= new Personne("Emile", 20, 80);
		
		System.out.println(martini.verifierAgeMontant(alice));
		System.out.println(tequila.verifierAgeMontant(benoit));
		System.out.println(martini.verifierAgeMontant(mathieu));
		System.out.println(tequila.verifierAgeMontant(emile));
		
		emile.setMontantArgent(100);

		System.out.println(martini.verifierAgeMontant(emile));
		
		Personne nicolas 	= new Personne("Nicolas", 28, 100);
		Personne ami		= new Personne(nicolas);
		

		System.out.println(tequila.verifierAgeMontant(ami));
		
		if(nicolas.equals(ami))
			System.out.println("Ces 2 personnes sont les m�mes.");
		else
			System.out.println("Ces 2 personnes sont diff�rentes.");
		
		if(nicolas.equals(benoit))
			System.out.println("Ces 2 personnes sont les m�mes.");
		else
			System.out.println("Ces 2 personnes sont diff�rentes.");
		
		tequila.setDateDebutTravail(new ClDate(2023, 6, 1));
		tequila.setDateFinTravail(new ClDate(2023, 8, 1));

		martini.setDateDebutTravail(new ClDate(2023, 6, 1));
		martini.setDateFinTravail(new ClDate(2023, 12, 1));
		
		System.out.println("Martini travail " + (martini.getDateFinTravail().getMois() - martini.getDateDebutTravail().getMois()) + " mois dans l'ann�e.");
		
//		Martini souhaite la bienvenue � Alice vous pouvez entrer et bonne soir�e.
//		Tequila se voit d�sol� pour Benoit vous n'avez pas 18 ans.
//		Martini se voit d�sol� pour Mathieu vous n'avez pas 18 ans.
//		Tequila se voit d�sol� pour Emile vous n'avez pas le montant requis.
//		Martini souhaite la bienvenue � Emile vous pouvez entrer et bonne soir�e.
//		Tequila souhaite la bienvenue � Nicolas vous pouvez entrer et bonne soir�e.
//		Ces 2 personnes sont les m�mes.
//		Ces 2 personnes sont diff�rentes.
//		Martini travail 6 mois dans l'ann�e.
	}

}
