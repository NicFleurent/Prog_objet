
public class TestCompteEpargne {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement

		Compte unCompte = new  Compte (  "128" , 200 );
		CompteEpargne  deuxCompte;
		deuxCompte      = new  CompteEpargne ( "99", 100, 2 , 5 );
		        
		Compte troisCompte         = new Compte ( );
		CompteEpargne quatreCompte = new CompteEpargne ( );
		        
		deuxCompte.setAnnee ( 2 );
		//-------------------------------------------------------------------------
			
			
		Compte c;
		c = unCompte;
		System.out.println( " c.getNoCompte( )= " + c.getNoCompte());
		//  c.getNoCompte( )= 128
			
			
		System.out.println( " L'argent qui dort ne rapporte rien  == c.getSolde()= " +  c.getSolde (  ));
		// L'argent qui dort ne rapporte rien  == c.getSolde()= 200.0
		System.out.println("-----------------------------------------------------");
					



		c = deuxCompte;
		System.out.println( " c.getNoCompte( )= " + c.getNoCompte());
		// c.getNoCompte( )= 99
		System.out.println( "L'argent qui dort ne rapporte rien=c.getSolde()= "+c.getSolde( ));
		// L'argent qui dort ne rapporte rien  == c.getSolde()= 900.0
		System.out.println("-----------------------------------------------------");
		//  redéfinition de la méthode getSolde ( )
		//  solde = super.getSolde( )   solde = 100  
		//  méthode getSolde de la classe Compte
		//  Retourne le 100$ qu’il y a dans la classe deuxCompte.
		//  Premier tour
//		    solde    =  solde * ( 1 + taux )
//		      300    =  100   * ( 1 + 2 ) =>   100 * (3) =>   300 
//		             		 
		//  Deuxième tour
//		    solde    =  solde * ( 1 + taux )
//		      900    =  300   * ( 1 + 2 ) =>   300 * (3) =>   900 
//		             		


//		-----------------------------------------------------------------------------
//////		deuxCompte = troisCompte; 
		// erreur compilation, impossible convertir compte en compte epargne
								
		CompteEpargne cinqCompte = new CompteEpargne( unCompte, 3, 2);
		System.out.println( " cinqCompte= " + cinqCompte);
		// cinqCompte= noCompte= 128 solde= 200.0 taux= 3.0 annne= 2
		System.out.println("-----------------------------------------------------");

//		-----------------------------------------------------------------------------
				
		troisCompte = cinqCompte;
		System.out.println( " troisCompte.getNoCompte( )= " + troisCompte.getNoCompte());
		// troisCompte.getNoCompte( )= 128
		System.out.println("-----------------------------------------------------");
				
				
		System.out.println( " troisCompte.getSolde();= " + troisCompte.getSolde());
		// troisCompte.getSolde();=  3200    
		System.out.println("-----------------------------------------------------");
				
				
		System.out.println( " cinqCompte.getSolde()= " + 	cinqCompte.getSolde());
		// cinqCompte.getSolde()=  3200    
		System.out.println("-----------------------------------------------------");
		//  redéfinition de la méthode getSolde ( )
		//  solde = super.getSolde( )   solde = 200  
		//  méthode getSolde de la classe Compte
		//  Retourne le 100$ qu’il y a dans la classe deuxCompte.
		//  Premier tour
//		    solde    =  solde * ( 1 + taux )
//		      800    =  200   * ( 1 + 3 ) =>   200 * (4) =>   800 
//		             		 
		//  Deuxième tour
//		    solde     =  solde * ( 1 + taux )
//		      3200    =  800   * ( 1 + 3 ) =>   800 * (4) =>   3200 
//		             		
				
				


		System.out.println( " unCompte.getSolde()= " + unCompte.getSolde());
		// unCompte.getSolde()= 200.0
		System.out.println("-----------------------------------------------------");
				
				
		System.out.println( " cinqCompte.getTaux()= " + cinqCompte.getTaux());
		//  cinqCompte.getTaux()=  3.0
		System.out.println("-----------------------------------------------------");
				
				
////		System.out.println( " troisCompte.getTaux( )= " + troisCompte.getTaux( ));
		// erreur compilation -- méthode indéfinie pour le classe Compte  3Compte.
		System.out.println("-----------------------------------------------------");
				
		    
////		System.out.println( "unCompte.getTaux()= " + unCompte.getTaux());
		// erreur compilation	-- méthode indéfinie pour le classe Compte.	
				
		System.exit(0);

		}


}
