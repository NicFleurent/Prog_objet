
public class TestVilleCapitale {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		Ville troisVille;
		Ville quatreVille;
		Ville uneVille   = new Ville ( );

		System.out.println ("une Ville: " + uneVille);
		// une Ville:  nom= nilnombre habitants= 0
				
		Ville deuxVille = new Ville ("Quebec", 400000 );

		System.out.println ("deux Ville " + deuxVille);	
		// deux Ville nom= Quebecnombre habitants= 400000
		System.out.println("------------------------------------------------------");
			

		Capitale troisCapitale;
		Capitale quatreCapitale;
		Capitale uneCapitale = new Capitale( );
		System.out.println ("une Capitale: " + uneCapitale);
		// une Capitale:  nom= nilnombre habitants= 0 pays= nil

				
		Capitale deuxCapitale = new Capitale (deuxVille, "Canada");
		System.out.println ("deux Capitale:  " + deuxCapitale);
		// deux Capitale:  nom= Quebecnombre habitants= 400000 pays= Canada
		System.out.println("-------------------------------------------------------");
			
				
		troisVille = deuxCapitale;  
		System.out.println("troisVille.getNom();" + troisVille.getNom());	
		// Québec
		System.out.println("-------------------------------------------------------");
				
				
/////		troisVille.getPays( );  
		// erreur compilation méthode indéfinie dans Ville

		System.out.println("troisVille" + troisVille); //pointe sur deuxCapitale	
		// troisVille nom= Quebecnombre habitants= 400000 pays= Canada
		System.out.println("-------------------------------------------------------");
				

////		quatreCapitale = uneVille;  // err comp,impossible convertir ville en capitale.
////		quatreCapitale = (Capitale)// deuxVille;  erreur execution, classCastException. 


////		System.out.println("quatreCapitale.getNom()= " + quatreCapitale.getNom());
		//pas initialiser
		System.out.println("-------------------------------------------------------");
				
////	System.out.println("quatreCapitale.getPays()=" + quatreCapitale.getPays());
		//pas initialiser
		System.out.println("-------------------------------------------------------");
			    



				
		quatreVille = uneVille;
		System.out.println("quatreVille.getNom( ) " + quatreVille.getNom());
		quatreVille.getNom( );// nul    pas encore été instancié.
		System.out.println("------------------------------------------------------");
						
			
////		System.out.println("quatreVille.getPays( ) " + quatreVille.getPays());
		//  erreur compilation, méthode indéfinie dans Ville
		System.out.println("-------------------------------------------------------");
		System.out.println("-------------------------------------------------------");
				

		troisVille = uneCapitale;
			
		System.out.println("troisVille.getClass().getName()= " + 
				        troisVille.getClass().getName());
		// troisVille.getClass().getName()= pkVille.Capitale
		System.out.println("-------------------------------------------------------");
				

		System.out.println(" troisVille.getNbrHab()= " + troisVille.getNbrHab());
		//  
//		System.out.println(" troisVille.getPays()  = " + troisVille.getPays() );      
		// erreur compilation, méthode indéfinie dans Ville
				

		troisVille = deuxVille;
		deuxVille.setNbrHab(500000);
		System.out.println("deuxVille " + deuxVille);
		// deuxVille  nom= Quebecnombre habitants= 500000
		System.out.println("-------------------------------------------------------");

				
////		troisCapitale = troisVille; //impossible de convertir ville en capitale.
				
		troisCapitale = new Capitale ( troisVille, "Canada");
		System.out.println("troisCapitale " + troisCapitale);
		//troisCapitale  nom= Quebec nombre habitants= 500000 pays= Canada

				
		quatreCapitale = new Capitale ( new Ville ("Ottawa", 500000), "Canada");
		quatreCapitale.setNbrHab(600000);
		System.out.println("quatreCapitale " + quatreCapitale);
		// quatreCapitale  nom= Ottawa nombre habitants= 600000 pays= Canada

				
		quatreVille = new Ville ( troisVille );
		System.out.println("quatreVille.getNbrHab " + quatreVille.getNbrHab());
		// quatreVille.getNbrHab 500000
			


		Ville cinqVille = new Capitale ( "Mexico", 20000000, "Mexique");
		System.out.println( "cinqVille.getNbrHab()= " + cinqVille.getNbrHab());
		// cinqVille.getNbrHab()= 20000000
		System.out.println("-------------------------------------------------------");

				
				
//		System.out.println( "cinqVille.getPays()= " + cinqVille.getPays());
		// erreur compilation.
		System.out.println("-------------------------------------------------------");

						
		System.out.println( "cinqVille.getNom()= " + cinqVille.getNom());
		//cinqVille.getNom()= Mexico
		System.out.println("-------------------------------------------------------");
				


////		Capitale sixCapitale = (Capitale) new Ville ( "Pekin", 18000000);
////		System.out.println( "sixCapitale.getPays()= " + sixCapitale.getPays()); 
		// erreur execution
		System.out.println("-------------------------------------------------------");		


		Ville tabVC [ ]  =  new  Ville [ 4 ] ;
					
		Ville  uneVille1               = new Ville  ( );
		Ville  deuxVille1             = new Ville  ( );
		Capitale  uneCapitale1   = new Capitale (  );
		Capitale  deuxCapitale1 = new Capitale (  );
				
		tabVC [ 0 ]   =   uneVille1;
		tabVC [ 1 ]   =  uneCapitale1;
		tabVC [ 2 ]   =  deuxVille1;
		tabVC [ 3 ]   =  deuxCapitale1;
				
				
		System.out.println ( "---------commence par sous-classe Capitale----------------" );
		for  (  int  ctr = 0;  ctr  <  tabVC.length ; ctr++ )
		      {
		     if  (  tabVC[ctr]   instanceof   Capitale  )
			System.out.println  ( "Capitale = "  +  tabVC [ ctr ] );
		     else
			System.out.println ( "Ville = "   +  tabVC [ ctr ] );
		     }
				
				
//				---------commence par sous-classe Capitale----------------
//				Ville        =  nom= nil    nombre  habitants= 0
//				Capitale  =  nom= nil    nombre  habitants= 0    pays =  nil
//				Ville        =  nom= nil    nombre  habitants= 0
//				Capitale  =  nom= nil    nombre  habitants= 0    pays =  nil
//				
				
					
		System.out.println ( "---------commence par super classe Ville----------------" );
		for  (  int  ctr = 0;  ctr  <  tabVC.length ;  ctr++  )
		      {
		      if  (  tabVC [ ctr ]    instanceof   Ville  )
			 System.out.println  ( "Ville = "  +  tabVC [ ctr ] );
		      else
			System.out.println  ( "Capitale = "    +   tabVC [ ctr ] );
		       }
				
//				---------commence par super classe Ville----------------
//				Ville =    nom= nil    nombre  habitants= 0
//				Ville =    nom= nil    nombre  habitants= 0     pays = nil
//				Ville =    nom= nil    nombre  habitants= 0
//				Ville =    nom= nil    nombre  habitants= 0     pays = ni

	}

}
