
public class TestBoissonAlcoolisee {

	public static void main(String[] args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		Boisson                eau  =  new  Boisson  ("eau minerale", 4 );
		BoissonAlcoolisee   whisky  =  new BoissonAlcoolisee ( "whisky",  7,  40 );

		Boisson     boisson;
		BoissonAlcoolisee     boissonForte;

		Boisson     boissonInconnue  = null;

			
		//  IMPORTANT -------------------------------------------------------------
		//  les instructions se suivent les unes apr�s les autres.
		//  Toutes les classes sont dans le m�me package.
		//  -----------------------------------------------------------------------
		//  Quand une instruction a une erreur de compilation ou d'ex�cution
		//  mettre cette instruction en commentaire pour continuer l'ex�cution.
		//  -----------------------------------------------------------------------

						
				
		boisson    =    (Boisson)  whisky;

		System.out.println("boisson.getNom()= " +  boisson.getNom( ) );


		// resultat =     boisson.getNom()= whisky
		// la variable r�f�rence boisson pointe sur whisky de type BoissonAlcoolisee
		// transtypage ascendant
		// L'instruction   boisson = whisky;  est �quivalente. 
		// une vue de Boisson est donc permis sur BoissonAlcoolisee
		// la m�thode getNom est h�rit�e dans BoissonAlcoolisee
		// et le r�sultat est en fonction du type BoissonAlcoolisee
		// System.out.println( "----------------------------------------------");

		        
		      
////		System.out.println("boisson.getDegreAlcool= " + boisson.getDegreAlcool() );

		// erreur compilation --  m�thode ind�finie pour le type Boisson.
		// dans la classe Boisson , la m�thode getDegreAlcool n'existe pas donc
		// le polymorphisme ne peut �tre appliqu� correctement.
		// System.out.println( "----------------------------------------------");
		        
		  
		boissonForte  =  (BoissonAlcoolisee) boisson;

		// DOWNCASTING -  ATTENTION DANGER
		//compilation OK -- parce que force le syst�me � le voir comme (BoissonAlcoolisee).
		// ex�cution (DOWNCASTING)-->    CELA VA-T-IL PLANTER OU NON ?   NON
		// PCQ  boisson type Boisson mais boisson pointe sur 
//		      whisly qui lui est de type (BoissonAlcoolisee)
		// donc c'est comme si boisson est percu de type boisson alcoolisee
		// donc boissonForte (BoissonAlcoolisee ) pointe sur 
//		      boisson (lui pointe sur whisky (BoissonAlcoolisee))
		// Nous avons donc une BoissonAlcoolisee vers une BoissonAlcoolisee.
		// transtypage descendant OK.
				


		// si nous voulions conna�tre exactement de quel type est boisson ?
		// Quelle instruction aurions-nous faite?
		// -----------------------------------------------------------------------

		if ( boisson  instanceof BoissonAlcoolisee )
		     System.out.println( "Transtypage (downcasting) correct");
		else
		     System.out.println( "Transtypage (downcasting) incorrect");	

		//  resultat =    Transtypage (downcasting) correct

				


		System.out.println( "boissonForte.getDegreAlcool()= " + 
		                     boissonForte.getDegreAlcool());

		// resultat =     boissonForte.getDegreAlcool()= 40
		// BoissonForte qui pointe sur whisky
		// donc va chercher la m�thode getDegreAlcool( )  de la classe whisky.
		System.out.println( "----------------------------------------------");
				
						

		System.out.println( "boissonForte.getNom()= " + boissonForte.getNom());
		// resultat =      boissonForte.getNom()= whisky
		System.out.println( "----------------------------------------------");
				
				

		System.out.println( "boissonForte.getPrix()= " + boissonForte.getPrix());
		// resultat =        boissonForte.getPrix()= 14.0
		// Red�finition de la m�thode getPrix() dans la classe BoissonAlcolisee.
		// System.out.println( "----------------------------------------------");

			

		//System.out.println( "eau.getPrix()= " + eau.getPrix());
		// eau.getPrix()= 4.0
		//System.out.println( "----------------------------------------------");
				
				
				
		boissonForte  =  (BoissonAlcoolisee)  boissonInconnue;

		// COMPILATION =  OK
		// EXECUTION   =  DOWNCASTING  ==  DANGER
		// un objet de type BoissonAlcoolisee pointe sur un type Boisson.
		// un objet d'une super classe n'est pas un objet d'une sous-classe.
				
		// System.out.println ( "boissonForte.getPrix()= " +  boissonForte.getPrix());
		// resultat =  erreur ex�cution  --  NullPointerException.
		// ce r�sultat est du au fait que boissonInconnue pointe sur rie (null).
		// System.out.println( "----------------------------------------------");

				
						
////		boissonForte    =  (BoissonAlcoolisee)  eau;

		// compilation OK
		// ex�cution -- ClassCastException.
		// DOWNCASTING  ==  DANGER
		// un objet de type BoissonAlcoolisee pointe sur un type Boisson.
		// un objet d'une super classe n'est pas un objet d'une sous-classe.
				
		// avant de faire l'instruction  boissonForte = (BoissonAlcoolisee) eau;
		// il peut �tre raisonnable d'inscrire les instructions suivantes pour
		// savoir si le downcasting va fonctionner correctement.
				
		if ( eau  instanceof BoissonAlcoolisee )
		   {
		    System.out.println("transtypage (downcasting) correct");
		    boissonForte    =  (BoissonAlcoolisee)  eau;
		    System.out.println ( "boissonForte.getNom( )= " + boissonForte.getNom( ) );
		   }
		else
		    System.out.println( "transtypage (downcasting) incorrect");	

				
		// resultat  = downcasting incorrect
		System.out.println( "----------------------------------------------");

				
				
				
		eau = boisson;
				
		System.out.println(" eau.getNom()= " + eau.getNom()); 
		// resultat =  eau.getNom()= whisky
		// la variable r�f�rence eau pointe sur l'objet boisson de type Boisson
		// mais par l'instruction pr�c�dente    boisson    =    (Boisson)  whisky;
		// boisson pointait sur l'objet ( whisky )  de type BoissonAlcoolisee.
		// donc l'objet eau (type Boisson) pointe sur l'objet whisky (type BA ).
		// un objet d'une sous-classe peut �tre un objet d'une super classe.
				
				
///		System.out.println(" eau.getDegreAlcool()= " + eau.getDegreAlcool()); 
		// la m�thode getDegreAlcool( ) est ind�finie pour le type Boisson.
		// donc pas de red�finition de la m�thode, donc pas de polymorphisme.

				
		BoissonAlcoolisee vin = new BoissonAlcoolisee ( "vin", 15, 22 );
		        
		  

///		vin = eau;   
		        
		//  erreur  compilation 
		//  impossible de convertir une Boisson en BoissonAlcoolisee

		//  Voici les instrcutions pr�c�dentes pour bien comprendre ce num�ro
		//  Boisson  eau  =  new  Boisson  ("eau minerale", 4 );
		//  BoissonAlcoolisee whisky = new BoissonAlcoolisee ("whisky", 7, 40 );
		//  Boisson     boisson;
		//  boisson    =    (Boisson)  whisky;
		//  eau = boisson;
		//  BoissonAlcoolisee vin = new BoissonAlcoolisee ( "vin", 15, 22 );
		//  vin = eau;  
		//
		//  resume:      vin  -->  eau  -->  boisson -->  whisky       
//		               vin ( BoissonAlcoolisee )   -->  whisky(BoissonAlcoolisee) 
		//  mais cela devrait fonctionner
		//  alors comment faire fonctionner cette instruction fonctionne?
		        

		        
		vin = (BoissonAlcoolisee) eau;


		// COMPILATION  --  OK
		// EXECUTION    --  OK
		// System.out.println( " vin.getNom()= " + vin.getNom());
		// resultat =   vin.getNom()= whisky
		        
		        
		System.out.println( " vin.getDegreAlcool()= " + vin.getDegreAlcool());
		// resultat =  vin.getDegreAlcool()= 40
		// vin  -->  eau  -->  boisson -->  whisky   
		// il prend donc le degre d'alcool de whisky.
		eau = vin;
        

		// l'objet eau de type (Boisson) pointe sur l'objet vin(BoissonAlcoolisee).
		//  un objet d'une sous-classe peut toujours se prendre pour un objet d'une super classe.
		// eau -->  vin -->  eau -->  boisson -->  whisky 


		System.out.println( "\n\n----------------------------------------------");
		System.out.println( " vin= " + vin );
		System.out.println( " eau= " + eau );
		System.out.println( " boisson= " + boisson );
		System.out.println( " whisky= " + whisky );
		System.out.println( "----------------------------------------------\n\n");

		     
		// tous ces objets pointent vers whisky
//		    	vin=      nom = whisky   prix = 7.0   degreAlcool = 40
//		          eau=      nom = whisky   prix = 7.0   degreAlcool = 40
//		          boisson=  nom = whisky   prix = 7.0   degreAlcool = 40
//		          whisky=   nom = whisky   prix = 7.0   degreAlcool = 40
		    	
		   


		//-------------------------------------------------------------------------
		// avant d'ex�cuter l'instruction
		// eau = vin;  	
		// si je mets en commentaire l'instruction pr�c�dente soit:
		// vin = (BoissonAlcoolisee) eau;
		// le resulatat sera
		//-------------------------------------------------------------------------
		// resultat			eau  -->  vin
		//
		    	
//		    	eau= nom = vin prix = 15.0 degreAlcool = 22
//		    	----------------------------------------------
		//
		//
//		    	----------------------------------------------
//		    	 vin=     nom = vin    prix = 15.0   degreAlcool = 22
//		    	 eau=     nom = vin    prix = 15.0   degreAlcool = 22
//		    	 boisson= nom = whisky prix = 7.0    degreAlcool = 40
//		    	 whisky=  nom = whisky prix = 7.0    degreAlcool = 40
//		    	----------------------------------------------
//		    	
//		    	
		        
		//---------------------------------------------------------------        
//		    	 la ligne suivante ne sera plus en commentaire
//		    	 vin = (BoissonAlcoolisee) eau;
		//----------------------------------------------------------------

		 // affecte � 2 le prix d'une bouteille d'eau.

		 eau.setPrix(2);
		    	
		    	
		System.out.println("eau.getPrix() " + eau.getPrix());
		System.out.println("eau.getNom()  " + eau.getNom());
		// resultat =  eau.getPrix() 4.0  
//		 	           eau.getNom() whisky


		    	// il faut bien comprendre que la m�thode getPrix est red�finie 
		    	// dans la sous-classe BoissonAlcoolisee
		    	// et que     eau -->  boisson -->  whisky
		    	// donc ex�cute la m�thode getPrix de la classe whisky (sous-classe)
		    	// � cause du polymorphisme
		    	
		  
		System.out.println( "\n\n----------------------------------------------");
		System.out.println( " vin= " + vin );
		System.out.println( " eau= " + eau );
		System.out.println( " boisson= " + boisson );
		System.out.println( " whisky= " + whisky );
		System.out.println( "----------------------------------------------\n\n");
		    	
		    	
//		    	  attention le prix revient � 2 pour tous ces objets.
//		      	----------------------------------------------
//		    	 vin=      nom = whisky     prix = 2.0   degreAlcool = 40
//		    	 eau=      nom = whisky     prix = 2.0   degreAlcool = 40
//		    	 boisson=  nom = whisky     prix = 2.0   degreAlcool = 40
//		    	 whisky=   nom = whisky     prix = 2.0   degreAlcool = 40
//		    	----------------------------------------------
//		    	
		    	
		    	
		    	
		        	
/////		System.out.println( "eau.getDegreAlcool= " + eau.getDegreAlcool());

		// resultat =  erreur compilation -- m�thode ind�finie pour le type Boisson
		// vu que    vin -->  eau -->  boisson -->  whisky 
		// ATTENTION  meme s'il pointe vers un type BoissonAlcoolisee
		// eau demeure toujours du type Boisson
		// et dans Boisson il n'y a pas de methode getDegreAlcool( )
		// donc le polymorphisme ne s'applique pas.

		        

		// Change le nom de whisky pour WhiskyDouble en promotion 2 pour 1.

		whisky.setNom("whiskyDouble");
		       
		        
		System.out.println( "\n\n----------------------------------------------");
		System.out.println( " vin= " + vin );
		System.out.println( " eau= " + eau );
		System.out.println( " boisson= " + boisson );
		System.out.println( " whisky= " + whisky );
		System.out.println( "----------------------------------------------\n\n");

//		    	
//		    	 vin= nom =     whiskyDouble prix = 2.0 degreAlcool = 40
//		    	 eau= nom =     whiskyDouble prix = 2.0 degreAlcool = 40
//		    	 boisson= nom = whiskyDouble prix = 2.0 degreAlcool = 40
//		    	 whisky= nom =  whiskyDouble prix = 2.0 degreAlcool = 40
//		        
//		    	

		    	

		System.out.println( "boisson.getPrix() " + boisson.getPrix());
		        
		// resultat =  boisson.getPrix() 4.0
		// vu que   vin -->  eau -->  boisson -->  whisky 
		// boisson (Boisson) a une m�thode getPrix
		// boisson --> whisky (BoissonAlcoolisee) a une red�finition
		// de la m�thode donc prend la m�thode de whisky (BoissonAlcoolisee).
		    	
		         
		        
		    	
		System.out.println( "vin.getDegreAlcool() " + vin.getDegreAlcool());

		// resultat =  vin.getDegreAlcool() 40
		// vu que     vin -->  eau -->  boisson -->  whisky 
		// ATTENTION  vin et whisky ont une m�thode getDegreAlcool
		// ATTENTION  eau et boisson n'en ont pas.
		// ATTENTION  red�finition entre plusieurs niveaux dans la hi�rarchie.
		    	
		    	
		    	
		System.out.println( "vin.getPrix() " + vin.getPrix());

		// resultat =  vin.getPrix() 4.0
		// vu que   vin -->  eau -->  boisson -->  whisky 
		// red�finition de la m�thode dans toutes les classes
		// il ex�cute la m�thode de la classe point�e soit whisky.
		    	
		    	
		    	
		    	
		System.exit(0);

	}

	}


