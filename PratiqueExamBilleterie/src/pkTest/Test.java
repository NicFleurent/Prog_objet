package pkTest;

import pkClasse.*;

public class Test {

	public static void main(String[] args) {
		
		Billetterie unBillet = new Billetterie();
		Billetterie deuxBillet = new Billetterie();
		
		unBillet.payerBillet(10);
		System.out.println(unBillet.afficherBlocInfo());
		
		unBillet.payerBillet(5);
		unBillet.payerBillet(5);
		unBillet.payerBillet(5);
		System.out.println("\n" + unBillet.afficherBlocInfo());
		
		unBillet.payerBillet(15);
		System.out.println("\n" + unBillet.afficherBlocInfo());
		
		deuxBillet.payerBillet(40);
		System.out.println("\n" + deuxBillet.afficherBlocInfo());
		
		Billetterie troisBillet = new Billetterie(1);
		System.out.println("\n" + troisBillet.afficherBlocInfo());
		
		Billetterie quatreBillet = new Billetterie(2);
		System.out.println("\n" + quatreBillet.afficherBlocInfo());
		
//		Le prix de votre billet est de: 40,00 $ CA
//		La somme amassée pour votre billet est de: 10,00 $ CA
//		Le reste du montant à payer est de: 30,00 $ CA
//		Le reste du montant à payer est de: Désolé l’impression du billet est impossible, il vous reste encore à payer: 30.0
//		Le nombre total de billets vendu est de: 0.0
//		Le montant total amassé de la machine est de: 0,00 $ CA
//
//		Le prix de votre billet est de: 40,00 $ CA
//		La somme amassée pour votre billet est de: 25,00 $ CA
//		Le reste du montant à payer est de: 15,00 $ CA
//		Le reste du montant à payer est de: Désolé l’impression du billet est impossible, il vous reste encore à payer: 15.0
//		Le nombre total de billets vendu est de: 0.0
//		Le montant total amassé de la machine est de: 0,00 $ CA
//
//		Le prix de votre billet est de: 40,00 $ CA
//		La somme amassée pour votre billet est de: 40,00 $ CA
//		Le reste du montant à payer est de: 0,00 $ CA
//		Le reste du montant à payer est de: Voici votre billet officiel pour l'évènement.
//		Le nombre total de billets vendu est de: 1.0
//		Le montant total amassé de la machine est de: 40,00 $ CA
//
//		Le prix de votre billet est de: 40,00 $ CA
//		La somme amassée pour votre billet est de: 40,00 $ CA
//		Le reste du montant à payer est de: 0,00 $ CA
//		Le reste du montant à payer est de: Voici votre billet officiel pour l'évènement.
//		Le nombre total de billets vendu est de: 2.0
//		Le montant total amassé de la machine est de: 80,00 $ CA
//
//		Le prix de votre billet est de: 70,00 $ CA
//		La somme amassée pour votre billet est de: 0,00 $ CA
//		Le reste du montant à payer est de: 70,00 $ CA
//		Le reste du montant à payer est de: Désolé l’impression du billet est impossible, il vous reste encore à payer: 70.0
//		Le nombre total de billets vendu est de: 2.0
//		Le montant total amassé de la machine est de: 80,00 $ CA
//
//		Le prix de votre billet est de: 50,00 $ CA
//		La somme amassée pour votre billet est de: 0,00 $ CA
//		Le reste du montant à payer est de: 50,00 $ CA
//		Le reste du montant à payer est de: Désolé l’impression du billet est impossible, il vous reste encore à payer: 50.0
//		Le nombre total de billets vendu est de: 2.0
//		Le montant total amassé de la machine est de: 80,00 $ CA

	}

}
