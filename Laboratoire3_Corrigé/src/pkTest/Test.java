/***********************************************************************

Le fichier:			Test.java

Projet:				Laboratoire3

Objectifs:			Tester les classes créées

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-02-07

***********************************************************************/

package pkTest;

import pkClasse.*;
import java.text.*;
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		NumberFormat dollars = NumberFormat.getCurrencyInstance();
		DecimalFormat zeroChiffre = new DecimalFormat("0");
		DecimalFormat unChiffre = new DecimalFormat("0.0");
		
		//Test ClDate
		System.out.println("Test ClDate");
		
		ClDate unDate = new ClDate();
		ClDate deuxDate = new ClDate(2012, 12, 12);
		
		if(unDate.equals(deuxDate))
			System.out.println("Les deux dates sont identiques");
		else
			System.out.println("Les deux dates sont différentes");
		
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
		
//		Test ClDate
//		Les deux dates sont différentes
//		Date 1 : 1997/07/17
//		Date 2 : ClDate[annee=2012, mois=12, jour=12]
//
//		Date 1 : 2300/02/01
//		Date 2 : ClDate[annee=2004, mois=2, jour=29]
//
//		Test get unDate annee : 2300
//		Test get unDate mois : 2
//		Test get unDate jour : 1
		
		
		//Test Compte
		JOptionPane.showMessageDialog(null, "Bienvenue dans le programme de test de la classe Compte.");
		
		//C'est quoi la différence entre "Compte banque[] = new Compte[10];" et "Compte[] banque = new Compte[10];"
		Compte banque[] = new Compte[10];
		
		banque[0] = new Compte();
		banque[1] = new Compte(999999.99, "Nicolas Fleurent", new ClDate(2023, 02, 07));

		//Je ne mets pas de "setSolde" car ça ne ferais pas de sens
		String[] option  = {"0 - Définir les intérêts annuels",
                			"1 - Visualiser les intérêts annuels",
			                "2 - Définir les frais mensuels",
			                "3 - Visualiser les frais mensuels",
			                "4 - Visualiser le solde",
			                "5 - Visualiser le numéro de compte",
			                "6 - Définir un propriétaire",
			                "7 - Visualiser le propriétaire",
			                "8 - Définir un date d'ouverture",
			                "9 - Visualiser la date d'ouverture",
			                "a - Retrait", 
							"b - Dépôt" ,
			                "c - Appliquer les intérêts mensuels", 
			                "d - Appliquer les frais mensuels",
			                "e - Comparer deux comptes",
			                "f - Information du compte",
			                "g - Créer un compte",
			                "h - Quitter l’application"};
		
		String[] compte = new String[banque.length];
		String	choix = "", saisieStr = "";	
		char	cChoix = '0';
		
		int 	choixCompte = 0, choixCompte2 = 0, saisieAnnee, saisieMois, saisieJour;
		double	saisieNbr = 0;
		boolean	transactionReussi = false;
		
		while ( cChoix != 'h' )
		{	
			choix = (String) JOptionPane.showInputDialog ( 	null, 
														    "Sélectionnez votre choix parmi les options suivantes:", 
														    "Menu principal ---  Gestion des comptes ",
														    JOptionPane.QUESTION_MESSAGE, 
														    null, 
														    option, 
														    option[0] );
			cChoix = choix.charAt(0);
			
			switch ( cChoix )
			{	  
			case '0':
				saisieNbr = Double.parseDouble(JOptionPane.showInputDialog("Entrer le taux d'intérêts annuels en pourcentage"));
				
				Compte.setInteretAnuel(saisieNbr);
				
				JOptionPane.showMessageDialog(null, "Vous avez défini le taux d'intérêts annuels à " + zeroChiffre.format(Compte.getInteretAnuel()) + "%");
				break;
				
			case '1':
				JOptionPane.showMessageDialog(null, "Le taux d'intérêts annuels est de " + zeroChiffre.format(Compte.getInteretAnuel()) + "%");
				break;
				   
			case '2':
				saisieNbr = Double.parseDouble(JOptionPane.showInputDialog("Entrer les frais mensuels"));
				
				Compte.setFraisMensuels(saisieNbr);
				
				JOptionPane.showMessageDialog(null, "Vous avez défini les frais mensuels à " + dollars.format(Compte.getFraisMensuels()));
				break;
				   
			case '3':
				JOptionPane.showMessageDialog(null, "Les frais mensuels sont de " + dollars.format(Compte.getFraisMensuels()));
				break;
				   
			case '4':
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog ( null, 
														    "Sélectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				JOptionPane.showMessageDialog(null, "Le solde du compte est de " + dollars.format(banque[choixCompte].getSolde()));
				break;
				   
			case '5':
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog ( null, 
														    "Sélectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				JOptionPane.showMessageDialog(null, "Le numéro de compte est : " + banque[choixCompte].getNumCompte());
				break;
				   
			case '6':
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog ( null, 
					    "Sélectionnez un compte parmi les suivants:", 
					    "Menu ---  Choix du compte ",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.PLAIN_MESSAGE, 
					    null, 
					    compte, 
					    compte[0] );
				
				saisieStr = JOptionPane.showInputDialog("Entrer le nom du propriétaire");
				
				banque[choixCompte].setNomProprio(saisieStr);
				
				JOptionPane.showMessageDialog(null, "Vous avez défini le nom du propriétaire à " + banque[choixCompte].getNomProprio());
				break;
				   
			case '7':
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog ( null, 
														    "Sélectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				JOptionPane.showMessageDialog(null, "Le numéro du propriétaire est : " + banque[choixCompte].getNomProprio());
				break;
				   
			case '8':
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog ( null, 
					    "Sélectionnez un compte parmi les suivants:", 
					    "Menu ---  Choix du compte ",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.PLAIN_MESSAGE, 
					    null, 
					    compte, 
					    compte[0] );
				
				saisieAnnee = Integer.parseInt(JOptionPane.showInputDialog("Entrer l'année de création"));
				saisieMois = Integer.parseInt(JOptionPane.showInputDialog("Entrer le mois de création"));
				saisieJour = Integer.parseInt(JOptionPane.showInputDialog("Entrer le jour de création"));
				
				banque[choixCompte].setDateOuverture(new ClDate(saisieAnnee, saisieMois, saisieJour));;
				
				JOptionPane.showMessageDialog(null, "Vous avez défini la date d'ouverture à " + banque[choixCompte].getDateOuverture());
				break;
				   
			case '9':
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog ( null, 
														    "Sélectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				JOptionPane.showMessageDialog(null, "Le numéro du propriétaire est : " + banque[choixCompte].getDateOuverture());
				break;
			   
			case 'a':  
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog ( 	null, 
															    "Sélectionnez un compte parmi les suivants:", 
															    "Menu ---  Choix du compte ",
															    JOptionPane.YES_NO_OPTION,
															    JOptionPane.PLAIN_MESSAGE, 
															    null, 
															    compte, 
															    compte[0] );
				
				saisieNbr = Double.parseDouble(JOptionPane.showInputDialog("Entrer le saisieNbr du retrait"));
				
				transactionReussi = banque[choixCompte].retrait(saisieNbr);
				
				if(transactionReussi)
					JOptionPane.showMessageDialog(null, "Le saisieNbr de " + dollars.format(saisieNbr) + " a été retirer du compte.");
				else
					JOptionPane.showMessageDialog(null, "Le retrait n'a pas pu être effectuer. Vous ne pouvez pas retirer de saisieNbr négatif ou supérieur à votre solde.");
				
				break;
			
			case 'b':
				for(int ctr = 0 ; ctr < compte.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog (null, 
														    "Sélectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				
				saisieNbr = Double.parseDouble(JOptionPane.showInputDialog("Entrer le saisieNbr du retrait"));
				
				transactionReussi = banque[choixCompte].depot(saisieNbr);
				
				if(transactionReussi)
					JOptionPane.showMessageDialog(null, "Le saisieNbr de " + dollars.format(saisieNbr) + " a été déposer au compte.");
				else
					JOptionPane.showMessageDialog(null, "Le dépôt n'a pas pu être effectuer. Vous ne pouvez pas déposer de saisieNbr négatif.");
	
				break;
			
			case 'c':
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog (null, 
														    "Sélectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				JOptionPane.showMessageDialog(null, "Le saisieNbr des intérets pour ce mois s'élève à " + dollars.format(banque[choixCompte].interet()));
				break;
			   
			case 'd':
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog (null, 
								    "Sélectionnez un compte parmi les suivants:", 
								    "Menu ---  Choix du compte ",
								    JOptionPane.YES_NO_OPTION,
								    JOptionPane.PLAIN_MESSAGE, 
								    null, 
								    compte, 
								    compte[0] );
				JOptionPane.showMessageDialog(null, "Le saisieNbr des frais pour ce mois s'élève à " + dollars.format(banque[choixCompte].frais()));
				break;
				   
			case 'e':
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog (null, 
					    "Sélectionnez le premier compte à comparer:", 
					    "Menu ---  Choix du compte ",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.PLAIN_MESSAGE, 
					    null, 
					    compte, 
					    compte[0] );
				
				choixCompte2 = JOptionPane.showOptionDialog (null, 
					    "Sélectionnez le deuxième compte à comparer:", 
					    "Menu ---  Choix du compte ",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.PLAIN_MESSAGE, 
					    null, 
					    compte, 
					    compte[0] );
				
				if(banque[choixCompte].equals(banque[choixCompte2]))
					JOptionPane.showMessageDialog(null, "Les deux comptes sont identiques");
				else
					JOptionPane.showMessageDialog(null, "Les deux comptes sont différents");
				break;
				   
			case 'f':
				for(int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] != null)
					{
						compte[ctr] = "Compte #" + banque[ctr].getNumCompte();
					}
					else
						compte[ctr] = "n/a";
				}
				choixCompte = JOptionPane.showOptionDialog (null, 
					    "Sélectionnez un compte parmi les suivants:", 
					    "Menu ---  Choix du compte ",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.PLAIN_MESSAGE, 
					    null, 
					    compte, 
					    compte[0] );
				
				JOptionPane.showMessageDialog(null, banque[choixCompte]);
				break;
				   
			case 'g':
				for (int ctr = 0 ; ctr < banque.length ; ctr++)
				{
					if(banque[ctr] == null)
					{
						banque[ctr] = new Compte();
						
						JOptionPane.showMessageDialog(null, "Le compte numéro " + banque[ctr].getNumCompte() + " a été créer.");
						break;
					}
				}
				break;
				   
			case 'h': 
			   JOptionPane.showMessageDialog(null, "Vous allez quitter l'application");
			
			}
		}
		
		//Test classe Facture
		System.out.println("\nTest classe facture");
		
		Facture magasin[] = new Facture[5];
		
		int		annee, mois, jour;
		double	grandTotal = 0;
		
		for(int ctr = 0 ; ctr < magasin.length ; ctr++) 
		{
			magasin[ctr] = new Facture();
			magasin[ctr].setNomClient(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer le nom du client"));
			magasin[ctr].setNomItem(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer le nom de l'item"));
			magasin[ctr].setPrixItem(Double.parseDouble(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer le prix de l'item")));
			magasin[ctr].setQteItem(Integer.parseInt(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer la quantité d'item")));
			annee = Integer.parseInt(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer l'année de la facture"));
			mois = Integer.parseInt(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer le mois de la facture"));
			jour = Integer.parseInt(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer le jour de la facture"));
			magasin[ctr].setDateFacture(new ClDate(annee, mois, jour));
			System.out.println(magasin[ctr]);
			
			grandTotal += magasin[ctr].calculerTotal();
		}
		
		System.out.println("Le grand total des factures est de " + dollars.format(grandTotal));
		
		System.out.println("\nPour la première facture, le nom du client est " + magasin[0].getNomClient());
		System.out.println("Pour la deuxième facture, le nom de l'item est " + magasin[1].getNomItem());
		System.out.println("Pour la troisième facture, le numéro de facture est " + magasin[2].getNumFacture());
		System.out.println("Pour la quatrième facture, le prix de l'item est " + dollars.format(magasin[3].getPrixItem()));
		System.out.println("Pour la cinquième facture, la quantité d'item est " + magasin[4].getQteItem());
		System.out.println("Pour la première facture, la date est " + magasin[0].getDateFacture());
		System.out.println("Le dernier numéro de facture est " + Facture.getNbrTotalFacture());
		
		Facture.setTps(Double.parseDouble(JOptionPane.showInputDialog("Entrer le nouveau taux de TPS")));
		Facture.setTvq(Double.parseDouble(JOptionPane.showInputDialog("Entrer le nouveau taux de TVQ")));
		System.out.println("La TPS est " + Facture.getTps());
		System.out.println("La TVQ est " + Facture.getTvq());
		
		System.out.println("Le montant de la TPS est " + dollars.format(magasin[0].calculerTps()));
		System.out.println("Le montant de la TVQ est " + dollars.format(magasin[1].calculerTvq()));
		System.out.println("Le montant des taxes est " + dollars.format(magasin[2].calculerTaxe()));
		System.out.println("Le montant du sous-total est " + dollars.format(magasin[3].calculerSousTotal()));
		System.out.println("Le montant total final est " + dollars.format(magasin[4].calculerTotal()));
		
		if(magasin[0].equals(magasin[1]))
			System.out.println("Les 2 factures sont identique.");
		else
			System.out.println("Les 2 factures sont différente.");
		
//		Test classe facture
//		Facture [numFacture=1000, nomClient=Nicolas, nomItem=Manga, prixItem=15.0, qteItem=625, dateFacture=ClDate[annee=2023, mois=2, jour=12]]
//		Facture [numFacture=1001, nomClient=Bob, nomItem=Bobette, prixItem=20.0, qteItem=7, dateFacture=ClDate[annee=2022, mois=3, jour=15]]
//		Facture [numFacture=1002, nomClient=Jean, nomItem=Peau d'ours, prixItem=50.0, qteItem=3, dateFacture=ClDate[annee=1600, mois=3, jour=5]]
//		Facture [numFacture=1003, nomClient=Jean-Marc, nomItem=Show d'humour, prixItem=40.0, qteItem=1, dateFacture=ClDate[annee=2020, mois=2, jour=29]]
//		Facture [numFacture=1004, nomClient=Goldorak, nomItem=Muscle, prixItem=35.0, qteItem=2, dateFacture=ClDate[annee=2500, mois=6, jour=17]]
//		Le grand total des factures est de 11 216,81 $ CA
//
//		Pour la première facture, le nom du client est Nicolas
//		Pour la deuxième facture, le nom de l'item est Bobette
//		Pour la troisième facture, le numéro de facture est 1002
//		Pour la quatrième facture, le prix de l'item est 40,00 $ CA
//		Pour la cinquième facture, la quantité d'item est 2
//		Pour la première facture, la date est ClDate[annee=2023, mois=2, jour=12]
//		Le dernier numéro de facture est 1004
//		La TPS est 15.0
//		La TVQ est 25.0
//		Le montant de la TPS est 1 406,25 $ CA
//		Le montant de la TVQ est 35,00 $ CA
//		Le montant des taxes est 60,00 $ CA
//		Le montant du sous-total est 40,00 $ CA
//		Le montant total final est 98,00 $ CA
//		Les 2 factures sont différente.
		
		
		//Test classe Etudiant
		System.out.println("\nTest classe Etudiant");
		
		Etudiant nicolas = new Etudiant();
		Etudiant simon = new Etudiant(	"102", "Beaulieu", "Simin", 
										"Système d'exploitation et composantes matérielles", 
										new ClDate(1990, 4, 25));
		
		nicolas.setNumEtudiant("801");
		System.out.println("Le numéro d'étudiant de Nicolas est " + nicolas.getNumEtudiant());
		
		nicolas.setNom("Tesla");
		System.out.println("Le nom de Nicolas est " + nicolas.getNom());
		
		simon.setPrenom("Simon");
		System.out.println("Le prénom de Simon est " + simon.getPrenom());
		
		simon.setTitreCours("Web 2");
		System.out.println("Le titre du cours de Simon est " + simon.getTitreCours());
		
		nicolas.setDateNaissance(new ClDate(1856, 7, 10));
		System.out.println("La date de naissance de Nicolas est " + nicolas.getDateNaissance());
		
		Etudiant.setPonderation(0, -20);
		if(Etudiant.getPonderation(0) == Etudiant.getPOND_MANQUANTE())
			System.out.println("La pondération pour les laboratoires n'est pas valide");
		else
			System.out.println("La pondération pour les laboratoires est de " + Etudiant.getPonderation(0));
		
		Etudiant.setPonderation(0, 30);
		if(Etudiant.getPonderation(0) == Etudiant.getPOND_MANQUANTE())
			System.out.println("La pondération pour les laboratoires n'est pas valide");
		else
			System.out.println("La pondération pour les laboratoires est de " + Etudiant.getPonderation(0));
		
		Etudiant.setPonderation(1, 30);
		if(Etudiant.getPonderation(1) == Etudiant.getPOND_MANQUANTE())
			System.out.println("La pondération pour l'examen de mi-session n'est pas valide");
		else
			System.out.println("La pondération pour l'examen de mi-session est de " + Etudiant.getPonderation(1));
		
		Etudiant.setPonderation(2, 50);
		if(Etudiant.getPonderation(2) == Etudiant.getPOND_MANQUANTE())
			System.out.println("La pondération pour l'examen synthèse n'est pas valide");
		else
			System.out.println("La pondération pour l'examen synthèse est de " + Etudiant.getPonderation(2));
		
		simon.definirAbandon();
		System.out.println("Le numéro d'étudiant de Simon est " + simon.getNumEtudiant());
		
		simon.calculerNoteFinale();
		
		if(simon.calculerNoteFinale() == Etudiant.getABANDON())
			System.out.println("Simon à abandonner et n'a donc pas de note finale.");
		else if(simon.calculerNoteFinale() == Etudiant.getNOTE_MANQUANTE())
			System.out.println("Il manque une note dans les notes de Simon donc la note finale ne peut pas être comptabilisée.");
		else if(simon.calculerNoteFinale() == Etudiant.getPOND_NON_100())
			System.out.println("La pondération des 3 cours n'est pas égal à 100 donc la note finale ne peut pas être comptabilisée.");
		else if(simon.calculerNoteFinale() == Etudiant.getPOND_MANQUANTE())
			System.out.println("Une ou plusieurs des pondérations ne sont pas valide ou défini donc la note finale ne peut pas être comptabilisée.");
		else
			System.out.println("La note final de Simon est " + unChiffre.format(simon.calculerNoteFinale()) + "%");
		
		nicolas.setNote(0, 98);
		if(nicolas.getNote(0) == Etudiant.getNOTE_MANQUANTE())
			System.out.println("La note pour les laboratoires n'est pas valide");
		else
			System.out.println("La note pour les laboratoires est de " + nicolas.getNote(0) + "%");
		
		nicolas.setNote(1, 105);
		if(nicolas.getNote(1) == Etudiant.getNOTE_MANQUANTE())
			System.out.println("La note pour l'examen de mi-session n'est pas valide");
		else
			System.out.println("La note pour l'examen de mi-session est de " + nicolas.getNote(1) + "%");
		
		nicolas.setNote(1, 95);
		if(nicolas.getNote(1) == Etudiant.getNOTE_MANQUANTE())
			System.out.println("La note pour l'examen de mi-session n'est pas valide");
		else
			System.out.println("La note pour l'examen de mi-session est de " + nicolas.getNote(1) + "%");
		
		nicolas.setNote(2, -5);
		if(nicolas.getNote(2) == Etudiant.getNOTE_MANQUANTE())
			System.out.println("La note pour l'examen synthèse n'est pas valide");
		else
			System.out.println("La note pour l'examen synthèse est de " + nicolas.getNote(2) + "%");
		
		if(nicolas.calculerNoteFinale() == Etudiant.getABANDON())
			System.out.println("Simon à abandonner et n'a donc pas de note finale.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getNOTE_MANQUANTE())
			System.out.println("Il manque une note dans les notes de Simon donc la note finale ne peut pas être comptabilisée.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPOND_NON_100())
			System.out.println("La pondération des 3 cours n'est pas égal à 100 donc la note finale ne peut pas être comptabilisée.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPOND_MANQUANTE())
			System.out.println("Une ou plusieurs des pondérations ne sont pas valide ou défini donc la note finale ne peut pas être comptabilisée.");
		else
			System.out.println("La note final de Nicolas est " + unChiffre.format(nicolas.calculerNoteFinale()) + "%");
		
		nicolas.setNote(2, 78.5);
		if(nicolas.getNote(2) == Etudiant.getNOTE_MANQUANTE())
			System.out.println("La note pour l'examen synthèse n'est pas valide");
		else
			System.out.println("La note pour l'examen synthèse est de " + nicolas.getNote(2) + "%");
		
		if(nicolas.calculerNoteFinale() == Etudiant.getABANDON())
			System.out.println("Simon à abandonner et n'a donc pas de note finale.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getNOTE_MANQUANTE())
			System.out.println("Il manque une note dans les notes de Simon donc la note finale ne peut pas être comptabilisée.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPOND_NON_100())
			System.out.println("La pondération des 3 cours n'est pas égal à 100 donc la note finale ne peut pas être comptabilisée.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPOND_MANQUANTE())
			System.out.println("Une ou plusieurs des pondérations ne sont pas valide ou défini donc la note finale ne peut pas être comptabilisée.");
		else
			System.out.println("La note final de Nicolas est " + unChiffre.format(nicolas.calculerNoteFinale()) + "%");
		
		Etudiant.setPonderation(2, 40);
		if(Etudiant.getPonderation(2) == Etudiant.getPOND_MANQUANTE())
			System.out.println("La pondération pour l'examen synthèse n'est pas valide");
		else
			System.out.println("La pondération pour l'examen synthèse est de " + Etudiant.getPonderation(2));
		
		if(nicolas.calculerNoteFinale() == Etudiant.getABANDON())
			System.out.println("Simon à abandonner et n'a donc pas de note finale.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getNOTE_MANQUANTE())
			System.out.println("Il manque une note dans les notes de Nicolas donc la note finale ne peut pas être comptabilisée.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPOND_NON_100())
			System.out.println("La pondération des 3 cours n'est pas égal à 100 donc la note finale ne peut pas être comptabilisée.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPOND_MANQUANTE())
			System.out.println("Une ou plusieurs des pondérations ne sont pas valide ou défini donc la note finale ne peut pas être comptabilisée.");
		else
			System.out.println("La note final de Nicolas est " + unChiffre.format(nicolas.calculerNoteFinale()) + "%");
		
		if(nicolas.equals(simon))
			System.out.println("Les 2 étudiants sont identiques");
		else
			System.out.println("Les 2 étudiants sont différents");
		
		System.out.println(nicolas);
		System.out.println(simon);
		
//		Test classe Etudiant
//		Le numéro d'étudiant de Nicolas est 801
//		Le nom de Nicolas est Tesla
//		Le prénom de Simon est Simon
//		Le titre du cours de Simon est Web 2
//		La date de naissance de Nicolas est ClDate[annee=1856, mois=7, jour=10]
//		La pondération pour les laboratoires n'est pas valide
//		La pondération pour les laboratoires est de 30
//		La pondération pour l'examen de mi-session est de 30
//		La pondération pour l'examen synthèse est de 50
//		Le numéro d'étudiant de Simon est NIL
//		Simon à abandonner et n'a donc pas de note finale.
//		La note pour les laboratoires est de 98.0%
//		La note pour l'examen de mi-session n'est pas valide
//		La note pour l'examen de mi-session est de 95.0%
//		La note pour l'examen synthèse n'est pas valide
//		Il manque une note dans les notes de Simon donc la note finale ne peut pas être comptabilisée.
//		La note pour l'examen synthèse est de 78.5%
//		La pondération des 3 cours n'est pas égal à 100 donc la note finale ne peut pas être comptabilisée.
//		La pondération pour l'examen synthèse est de 40
//		La note final de Nicolas est 89,3%
//		Les 2 étudiants sont différents
//		Etudiant [numEtudiant=801, nom=Tesla, prenom=Nicolas, titreCours=Programmation objet, dateNaissance=ClDate[annee=1856, mois=7, jour=10], noteLabo=98.0, noteMiSession=95.0, noteSynthese=78.5]
//		Etudiant [numEtudiant=NIL, nom=Beaulieu, prenom=Simon, titreCours=Web 2, dateNaissance=ClDate[annee=1990, mois=4, jour=25], noteLabo=-1.0, noteMiSession=-1.0, noteSynthese=-1.0]

		
	}

}
