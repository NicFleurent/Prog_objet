/***********************************************************************

Le fichier:			Test.java

Projet:				Laboratoire3

Objectifs:			Tester les classes cr��es

Logiciel: 			�clipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de cr�ation:	2023-02-07

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
			System.out.println("Les deux dates sont diff�rentes");
		
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
//		Les deux dates sont diff�rentes
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
		
		//C'est quoi la diff�rence entre "Compte banque[] = new Compte[10];" et "Compte[] banque = new Compte[10];"
		Compte banque[] = new Compte[10];
		
		banque[0] = new Compte();
		banque[1] = new Compte(999999.99, "Nicolas Fleurent", new ClDate(2023, 02, 07));

		//Je ne mets pas de "setSolde" car �a ne ferais pas de sens
		String[] option  = {"0 - D�finir les int�r�ts annuels",
                			"1 - Visualiser les int�r�ts annuels",
			                "2 - D�finir les frais mensuels",
			                "3 - Visualiser les frais mensuels",
			                "4 - Visualiser le solde",
			                "5 - Visualiser le num�ro de compte",
			                "6 - D�finir un propri�taire",
			                "7 - Visualiser le propri�taire",
			                "8 - D�finir un date d'ouverture",
			                "9 - Visualiser la date d'ouverture",
			                "a - Retrait", 
							"b - D�p�t" ,
			                "c - Appliquer les int�r�ts mensuels", 
			                "d - Appliquer les frais mensuels",
			                "e - Comparer deux comptes",
			                "f - Information du compte",
			                "g - Cr�er un compte",
			                "h - Quitter l�application"};
		
		String[] compte = new String[banque.length];
		String	choix = "", saisieStr = "";	
		char	cChoix = '0';
		
		int 	choixCompte = 0, choixCompte2 = 0, saisieAnnee, saisieMois, saisieJour;
		double	saisieNbr = 0;
		boolean	transactionReussi = false;
		
		while ( cChoix != 'h' )
		{	
			choix = (String) JOptionPane.showInputDialog ( 	null, 
														    "S�lectionnez votre choix parmi les options suivantes:", 
														    "Menu principal ---  Gestion des comptes ",
														    JOptionPane.QUESTION_MESSAGE, 
														    null, 
														    option, 
														    option[0] );
			cChoix = choix.charAt(0);
			
			switch ( cChoix )
			{	  
			case '0':
				saisieNbr = Double.parseDouble(JOptionPane.showInputDialog("Entrer le taux d'int�r�ts annuels en pourcentage"));
				
				Compte.setInteretAnuel(saisieNbr);
				
				JOptionPane.showMessageDialog(null, "Vous avez d�fini le taux d'int�r�ts annuels � " + zeroChiffre.format(Compte.getInteretAnuel()) + "%");
				break;
				
			case '1':
				JOptionPane.showMessageDialog(null, "Le taux d'int�r�ts annuels est de " + zeroChiffre.format(Compte.getInteretAnuel()) + "%");
				break;
				   
			case '2':
				saisieNbr = Double.parseDouble(JOptionPane.showInputDialog("Entrer les frais mensuels"));
				
				Compte.setFraisMensuels(saisieNbr);
				
				JOptionPane.showMessageDialog(null, "Vous avez d�fini les frais mensuels � " + dollars.format(Compte.getFraisMensuels()));
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
														    "S�lectionnez un compte parmi les suivants:", 
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
														    "S�lectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				JOptionPane.showMessageDialog(null, "Le num�ro de compte est : " + banque[choixCompte].getNumCompte());
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
					    "S�lectionnez un compte parmi les suivants:", 
					    "Menu ---  Choix du compte ",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.PLAIN_MESSAGE, 
					    null, 
					    compte, 
					    compte[0] );
				
				saisieStr = JOptionPane.showInputDialog("Entrer le nom du propri�taire");
				
				banque[choixCompte].setNomProprio(saisieStr);
				
				JOptionPane.showMessageDialog(null, "Vous avez d�fini le nom du propri�taire � " + banque[choixCompte].getNomProprio());
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
														    "S�lectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				JOptionPane.showMessageDialog(null, "Le num�ro du propri�taire est : " + banque[choixCompte].getNomProprio());
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
					    "S�lectionnez un compte parmi les suivants:", 
					    "Menu ---  Choix du compte ",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.PLAIN_MESSAGE, 
					    null, 
					    compte, 
					    compte[0] );
				
				saisieAnnee = Integer.parseInt(JOptionPane.showInputDialog("Entrer l'ann�e de cr�ation"));
				saisieMois = Integer.parseInt(JOptionPane.showInputDialog("Entrer le mois de cr�ation"));
				saisieJour = Integer.parseInt(JOptionPane.showInputDialog("Entrer le jour de cr�ation"));
				
				banque[choixCompte].setDateOuverture(new ClDate(saisieAnnee, saisieMois, saisieJour));;
				
				JOptionPane.showMessageDialog(null, "Vous avez d�fini la date d'ouverture � " + banque[choixCompte].getDateOuverture());
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
														    "S�lectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				JOptionPane.showMessageDialog(null, "Le num�ro du propri�taire est : " + banque[choixCompte].getDateOuverture());
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
															    "S�lectionnez un compte parmi les suivants:", 
															    "Menu ---  Choix du compte ",
															    JOptionPane.YES_NO_OPTION,
															    JOptionPane.PLAIN_MESSAGE, 
															    null, 
															    compte, 
															    compte[0] );
				
				saisieNbr = Double.parseDouble(JOptionPane.showInputDialog("Entrer le saisieNbr du retrait"));
				
				transactionReussi = banque[choixCompte].retrait(saisieNbr);
				
				if(transactionReussi)
					JOptionPane.showMessageDialog(null, "Le saisieNbr de " + dollars.format(saisieNbr) + " a �t� retirer du compte.");
				else
					JOptionPane.showMessageDialog(null, "Le retrait n'a pas pu �tre effectuer. Vous ne pouvez pas retirer de saisieNbr n�gatif ou sup�rieur � votre solde.");
				
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
														    "S�lectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				
				saisieNbr = Double.parseDouble(JOptionPane.showInputDialog("Entrer le saisieNbr du retrait"));
				
				transactionReussi = banque[choixCompte].depot(saisieNbr);
				
				if(transactionReussi)
					JOptionPane.showMessageDialog(null, "Le saisieNbr de " + dollars.format(saisieNbr) + " a �t� d�poser au compte.");
				else
					JOptionPane.showMessageDialog(null, "Le d�p�t n'a pas pu �tre effectuer. Vous ne pouvez pas d�poser de saisieNbr n�gatif.");
	
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
														    "S�lectionnez un compte parmi les suivants:", 
														    "Menu ---  Choix du compte ",
														    JOptionPane.YES_NO_OPTION,
														    JOptionPane.PLAIN_MESSAGE, 
														    null, 
														    compte, 
														    compte[0] );
				JOptionPane.showMessageDialog(null, "Le saisieNbr des int�rets pour ce mois s'�l�ve � " + dollars.format(banque[choixCompte].interet()));
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
								    "S�lectionnez un compte parmi les suivants:", 
								    "Menu ---  Choix du compte ",
								    JOptionPane.YES_NO_OPTION,
								    JOptionPane.PLAIN_MESSAGE, 
								    null, 
								    compte, 
								    compte[0] );
				JOptionPane.showMessageDialog(null, "Le saisieNbr des frais pour ce mois s'�l�ve � " + dollars.format(banque[choixCompte].frais()));
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
					    "S�lectionnez le premier compte � comparer:", 
					    "Menu ---  Choix du compte ",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.PLAIN_MESSAGE, 
					    null, 
					    compte, 
					    compte[0] );
				
				choixCompte2 = JOptionPane.showOptionDialog (null, 
					    "S�lectionnez le deuxi�me compte � comparer:", 
					    "Menu ---  Choix du compte ",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.PLAIN_MESSAGE, 
					    null, 
					    compte, 
					    compte[0] );
				
				if(banque[choixCompte].equals(banque[choixCompte2]))
					JOptionPane.showMessageDialog(null, "Les deux comptes sont identiques");
				else
					JOptionPane.showMessageDialog(null, "Les deux comptes sont diff�rents");
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
					    "S�lectionnez un compte parmi les suivants:", 
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
						
						JOptionPane.showMessageDialog(null, "Le compte num�ro " + banque[ctr].getNumCompte() + " a �t� cr�er.");
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
			magasin[ctr].setQteItem(Integer.parseInt(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer la quantit� d'item")));
			annee = Integer.parseInt(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer l'ann�e de la facture"));
			mois = Integer.parseInt(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer le mois de la facture"));
			jour = Integer.parseInt(JOptionPane.showInputDialog("Pour la facture #" + magasin[ctr].getNumFacture() + ", entrer le jour de la facture"));
			magasin[ctr].setDateFacture(new ClDate(annee, mois, jour));
			System.out.println(magasin[ctr]);
			
			grandTotal += magasin[ctr].calculerTotal();
		}
		
		System.out.println("Le grand total des factures est de " + dollars.format(grandTotal));
		
		System.out.println("\nPour la premi�re facture, le nom du client est " + magasin[0].getNomClient());
		System.out.println("Pour la deuxi�me facture, le nom de l'item est " + magasin[1].getNomItem());
		System.out.println("Pour la troisi�me facture, le num�ro de facture est " + magasin[2].getNumFacture());
		System.out.println("Pour la quatri�me facture, le prix de l'item est " + dollars.format(magasin[3].getPrixItem()));
		System.out.println("Pour la cinqui�me facture, la quantit� d'item est " + magasin[4].getQteItem());
		System.out.println("Pour la premi�re facture, la date est " + magasin[0].getDateFacture());
		System.out.println("Le dernier num�ro de facture est " + Facture.getNbrTotalFacture());
		
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
			System.out.println("Les 2 factures sont diff�rente.");
		
//		Test classe facture
//		Facture [numFacture=1000, nomClient=Nicolas, nomItem=Manga, prixItem=15.0, qteItem=625, dateFacture=ClDate[annee=2023, mois=2, jour=12]]
//		Facture [numFacture=1001, nomClient=Bob, nomItem=Bobette, prixItem=20.0, qteItem=7, dateFacture=ClDate[annee=2022, mois=3, jour=15]]
//		Facture [numFacture=1002, nomClient=Jean, nomItem=Peau d'ours, prixItem=50.0, qteItem=3, dateFacture=ClDate[annee=1600, mois=3, jour=5]]
//		Facture [numFacture=1003, nomClient=Jean-Marc, nomItem=Show d'humour, prixItem=40.0, qteItem=1, dateFacture=ClDate[annee=2020, mois=2, jour=29]]
//		Facture [numFacture=1004, nomClient=Goldorak, nomItem=Muscle, prixItem=35.0, qteItem=2, dateFacture=ClDate[annee=2500, mois=6, jour=17]]
//		Le grand total des factures est de 11�216,81�$�CA
//
//		Pour la premi�re facture, le nom du client est Nicolas
//		Pour la deuxi�me facture, le nom de l'item est Bobette
//		Pour la troisi�me facture, le num�ro de facture est 1002
//		Pour la quatri�me facture, le prix de l'item est 40,00�$�CA
//		Pour la cinqui�me facture, la quantit� d'item est 2
//		Pour la premi�re facture, la date est ClDate[annee=2023, mois=2, jour=12]
//		Le dernier num�ro de facture est 1004
//		La TPS est 15.0
//		La TVQ est 25.0
//		Le montant de la TPS est 1�406,25�$�CA
//		Le montant de la TVQ est 35,00�$�CA
//		Le montant des taxes est 60,00�$�CA
//		Le montant du sous-total est 40,00�$�CA
//		Le montant total final est 98,00�$�CA
//		Les 2 factures sont diff�rente.
		
		
		//Test classe Etudiant
		System.out.println("\nTest classe Etudiant");
		
		Etudiant nicolas = new Etudiant();
		Etudiant simon = new Etudiant(	"102", "Beaulieu", "Simin", 
										"Syst�me d'exploitation et composantes mat�rielles", 
										new ClDate(1990, 4, 25));
		
		nicolas.setNumEtudiant("801");
		System.out.println("Le num�ro d'�tudiant de Nicolas est " + nicolas.getNumEtudiant());
		
		nicolas.setNom("Tesla");
		System.out.println("Le nom de Nicolas est " + nicolas.getNom());
		
		simon.setPrenom("Simon");
		System.out.println("Le pr�nom de Simon est " + simon.getPrenom());
		
		simon.setTitreCours("Web 2");
		System.out.println("Le titre du cours de Simon est " + simon.getTitreCours());
		
		nicolas.setDateNaissance(new ClDate(1856, 7, 10));
		System.out.println("La date de naissance de Nicolas est " + nicolas.getDateNaissance());
		
		Etudiant.setPondLabo(-20);
		if(Etudiant.getPondLabo() == Etudiant.getPondmanquante())
			System.out.println("La pond�ration pour les laboratoires n'est pas valide");
		else
			System.out.println("La pond�ration pour les laboratoires est de " + Etudiant.getPondLabo());
		
		Etudiant.setPondLabo(30);
		if(Etudiant.getPondLabo() == Etudiant.getPondmanquante())
			System.out.println("La pond�ration pour les laboratoires n'est pas valide");
		else
			System.out.println("La pond�ration pour les laboratoires est de " + Etudiant.getPondLabo());
		
		Etudiant.setPondMiSession(30);
		if(Etudiant.getPondMiSession() == Etudiant.getPondmanquante())
			System.out.println("La pond�ration pour l'examen de mi-session n'est pas valide");
		else
			System.out.println("La pond�ration pour l'examen de mi-session est de " + Etudiant.getPondMiSession());
		
		Etudiant.setPondSynthese(50);
		if(Etudiant.getPondSynthese() == Etudiant.getPondmanquante())
			System.out.println("La pond�ration pour l'examen synth�se n'est pas valide");
		else
			System.out.println("La pond�ration pour l'examen synth�se est de " + Etudiant.getPondSynthese());
		
		simon.d�finirAbandon();
		System.out.println("Le num�ro d'�tudiant de Simon est " + simon.getNumEtudiant());
		
		simon.calculerNoteFinale();
		
		if(simon.calculerNoteFinale() == Etudiant.getAbandon())
			System.out.println("Simon � abandonner et n'a donc pas de note finale.");
		else if(simon.calculerNoteFinale() == Etudiant.getNotemanquante())
			System.out.println("Il manque une note dans les notes de Simon donc la note finale ne peut pas �tre comptabilis�e.");
		else if(simon.calculerNoteFinale() == Etudiant.getPondNon100())
			System.out.println("La pond�ration des 3 cours n'est pas �gal � 100 donc la note finale ne peut pas �tre comptabilis�e.");
		else if(simon.calculerNoteFinale() == Etudiant.getPondmanquante())
			System.out.println("Une ou plusieurs des pond�rations ne sont pas valide ou d�fini donc la note finale ne peut pas �tre comptabilis�e.");
		else
			System.out.println("La note final de Simon est " + unChiffre.format(simon.calculerNoteFinale()) + "%");
		
		nicolas.setNoteLabo(98);
		if(nicolas.getNoteLabo() == Etudiant.getNotemanquante())
			System.out.println("La note pour les laboratoires n'est pas valide");
		else
			System.out.println("La note pour les laboratoires est de " + nicolas.getNoteLabo() + "%");
		
		nicolas.setNoteMiSession(105);
		if(nicolas.getNoteMiSession() == Etudiant.getNotemanquante())
			System.out.println("La note pour l'examen de mi-session n'est pas valide");
		else
			System.out.println("La note pour l'examen de mi-session est de " + nicolas.getNoteMiSession() + "%");
		
		nicolas.setNoteMiSession(95);
		if(nicolas.getNoteMiSession() == Etudiant.getNotemanquante())
			System.out.println("La note pour l'examen de mi-session n'est pas valide");
		else
			System.out.println("La note pour l'examen de mi-session est de " + nicolas.getNoteMiSession() + "%");
		
		nicolas.setNoteSynthese(-5);
		if(nicolas.getNoteSynthese() == Etudiant.getNotemanquante())
			System.out.println("La note pour l'examen synth�se n'est pas valide");
		else
			System.out.println("La note pour l'examen synth�se est de " + nicolas.getNoteSynthese() + "%");
		
		if(nicolas.calculerNoteFinale() == Etudiant.getAbandon())
			System.out.println("Simon � abandonner et n'a donc pas de note finale.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getNotemanquante())
			System.out.println("Il manque une note dans les notes de Simon donc la note finale ne peut pas �tre comptabilis�e.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPondNon100())
			System.out.println("La pond�ration des 3 cours n'est pas �gal � 100 donc la note finale ne peut pas �tre comptabilis�e.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPondmanquante())
			System.out.println("Une ou plusieurs des pond�rations ne sont pas valide ou d�fini donc la note finale ne peut pas �tre comptabilis�e.");
		else
			System.out.println("La note final de Nicolas est " + unChiffre.format(nicolas.calculerNoteFinale()) + "%");
		
		nicolas.setNoteSynthese(78.5);
		if(nicolas.getNoteSynthese() == Etudiant.getNotemanquante())
			System.out.println("La note pour l'examen synth�se n'est pas valide");
		else
			System.out.println("La note pour l'examen synth�se est de " + nicolas.getNoteSynthese() + "%");
		
		if(nicolas.calculerNoteFinale() == Etudiant.getAbandon())
			System.out.println("Simon � abandonner et n'a donc pas de note finale.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getNotemanquante())
			System.out.println("Il manque une note dans les notes de Simon donc la note finale ne peut pas �tre comptabilis�e.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPondNon100())
			System.out.println("La pond�ration des 3 cours n'est pas �gal � 100 donc la note finale ne peut pas �tre comptabilis�e.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPondmanquante())
			System.out.println("Une ou plusieurs des pond�rations ne sont pas valide ou d�fini donc la note finale ne peut pas �tre comptabilis�e.");
		else
			System.out.println("La note final de Nicolas est " + unChiffre.format(nicolas.calculerNoteFinale()) + "%");
		
		Etudiant.setPondSynthese(40);
		if(Etudiant.getPondSynthese() == Etudiant.getPondmanquante())
			System.out.println("La pond�ration pour l'examen synth�se n'est pas valide");
		else
			System.out.println("La pond�ration pour l'examen synth�se est de " + Etudiant.getPondSynthese());
		
		if(nicolas.calculerNoteFinale() == Etudiant.getAbandon())
			System.out.println("Simon � abandonner et n'a donc pas de note finale.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getNotemanquante())
			System.out.println("Il manque une note dans les notes de Simon donc la note finale ne peut pas �tre comptabilis�e.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPondNon100())
			System.out.println("La pond�ration des 3 cours n'est pas �gal � 100 donc la note finale ne peut pas �tre comptabilis�e.");
		else if(nicolas.calculerNoteFinale() == Etudiant.getPondmanquante())
			System.out.println("Une ou plusieurs des pond�rations ne sont pas valide ou d�fini donc la note finale ne peut pas �tre comptabilis�e.");
		else
			System.out.println("La note final de Nicolas est " + unChiffre.format(nicolas.calculerNoteFinale()) + "%");
		
		if(nicolas.equals(simon))
			System.out.println("Les 2 �tudiants sont identiques");
		else
			System.out.println("Les 2 �tudiants sont diff�rents");
		
		System.out.println(nicolas);
		System.out.println(simon);
		
//		Test classe Etudiant
//		Le num�ro d'�tudiant de Nicolas est 801
//		Le nom de Nicolas est Tesla
//		Le pr�nom de Simon est Simon
//		Le titre du cours de Simon est Web 2
//		La date de naissance de Nicolas est ClDate[annee=1856, mois=7, jour=10]
//		La pond�ration pour les laboratoires n'est pas valide
//		La pond�ration pour les laboratoires est de 30
//		La pond�ration pour l'examen de mi-session est de 30
//		La pond�ration pour l'examen synth�se est de 50
//		Le num�ro d'�tudiant de Simon est NIL
//		Simon � abandonner et n'a donc pas de note finale.
//		La note pour les laboratoires est de 98.0%
//		La note pour l'examen de mi-session n'est pas valide
//		La note pour l'examen de mi-session est de 95.0%
//		La note pour l'examen synth�se n'est pas valide
//		Il manque une note dans les notes de Simon donc la note finale ne peut pas �tre comptabilis�e.
//		La note pour l'examen synth�se est de 78.5%
//		La pond�ration des 3 cours n'est pas �gal � 100 donc la note finale ne peut pas �tre comptabilis�e.
//		La pond�ration pour l'examen synth�se est de 40
//		La note final de Nicolas est 89,3%
//		Les 2 �tudiants sont diff�rents
//		Etudiant [numEtudiant=801, nom=Tesla, prenom=Nicolas, titreCours=Programmation objet, dateNaissance=ClDate[annee=1856, mois=7, jour=10], noteLabo=98.0, noteMiSession=95.0, noteSynthese=78.5]
//		Etudiant [numEtudiant=NIL, nom=Beaulieu, prenom=Simon, titreCours=Web 2, dateNaissance=ClDate[annee=1990, mois=4, jour=25], noteLabo=-1.0, noteMiSession=-1.0, noteSynthese=-1.0]

		
	}

}
