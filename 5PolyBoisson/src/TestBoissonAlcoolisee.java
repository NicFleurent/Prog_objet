
public class TestBoissonAlcoolisee {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		Boisson                eau  =  new  Boisson  ("eau minerale", 4 );
		BoissonAlcoolisee   whisky  =  new BoissonAlcoolisee ( "whisky",  7,  40 );

		Boisson     boisson;
		BoissonAlcoolisee     boissonForte;

		Boisson     boissonInconnue  = null;

			
		//  IMPORTANT -------------------------------------------------------------
		//  les instructions se suivent les unes après les autres.
		//  Toutes les classes sont dans le même package.
		//  -----------------------------------------------------------------------
		//  Quand une instruction a une erreur de compilation ou d'exécution
		//  mettre cette instruction en commentaire pour continuer l'exécution.
		//  -----------------------------------------------------------------------

						
				
		boisson    =    (Boisson)  whisky;

		System.out.println("boisson.getNom()= " +  boisson.getNom( ) );


		// resultat =     boisson.getNom()= whisky
		// la variable référence boisson pointe sur whisky de type BoissonAlcoolisee
		// transtypage ascendant
		// L'instruction   boisson = whisky;  est équivalente. 
		// une vue de Boisson est donc permis sur BoissonAlcoolisee
		// la méthode getNom est héritée dans BoissonAlcoolisee
		// et le résultat est en fonction du type BoissonAlcoolisee
		// System.out.println( "----------------------------------------------");

		        
		      
////		System.out.println("boisson.getDegreAlcool= " + boisson.getDegreAlcool() );

		// erreur compilation --  méthode indéfinie pour le type Boisson.
		// dans la classe Boisson , la méthode getDegreAlcool n'existe pas donc
		// le polymorphisme ne peut être appliqué correctement.
		// System.out.println( "----------------------------------------------");
		        
		  
		boissonForte  =  (BoissonAlcoolisee) boisson;

		// DOWNCASTING -  ATTENTION DANGER
		//compilation OK -- parce que force le système à le voir comme (BoissonAlcoolisee).
		// exécution (DOWNCASTING)-->    CELA VA-T-IL PLANTER OU NON ?   NON
		// PCQ  boisson type Boisson mais boisson pointe sur 
//		      whisly qui lui est de type (BoissonAlcoolisee)
		// donc c'est comme si boisson est percu de type boisson alcoolisee
		// donc boissonForte (BoissonAlcoolisee ) pointe sur 
//		      boisson (lui pointe sur whisky (BoissonAlcoolisee))
		// Nous avons donc une BoissonAlcoolisee vers une BoissonAlcoolisee.
		// transtypage descendant OK.
				


		// si nous voulions connaître exactement de quel type est boisson ?
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
		// donc va chercher la méthode getDegreAlcool( )  de la classe whisky.
		System.out.println( "----------------------------------------------");
				
						

		System.out.println( "boissonForte.getNom()= " + boissonForte.getNom());
		// resultat =      boissonForte.getNom()= whisky
		System.out.println( "----------------------------------------------");
				
				

		System.out.println( "boissonForte.getPrix()= " + boissonForte.getPrix());
		// resultat =        boissonForte.getPrix()= 14.0
		// Redéfinition de la méthode getPrix() dans la classe BoissonAlcolisee.
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
		// resultat =  erreur exécution  --  NullPointerException.
		// ce résultat est du au fait que boissonInconnue pointe sur rie (null).
		// System.out.println( "----------------------------------------------");

				
						
////		boissonForte    =  (BoissonAlcoolisee)  eau;

		// compilation OK
		// exécution -- ClassCastException.
		// DOWNCASTING  ==  DANGER
		// un objet de type BoissonAlcoolisee pointe sur un type Boisson.
		// un objet d'une super classe n'est pas un objet d'une sous-classe.
				
		// avant de faire l'instruction  boissonForte = (BoissonAlcoolisee) eau;
		// il peut être raisonnable d'inscrire les instructions suivantes pour
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
		// la variable référence eau pointe sur l'objet boisson de type Boisson
		// mais par l'instruction précédente    boisson    =    (Boisson)  whisky;
		// boisson pointait sur l'objet ( whisky )  de type BoissonAlcoolisee.
		// donc l'objet eau (type Boisson) pointe sur l'objet whisky (type BA ).
		// un objet d'une sous-classe peut être un objet d'une super classe.
				
				
///		System.out.println(" eau.getDegreAlcool()= " + eau.getDegreAlcool()); 
		// la méthode getDegreAlcool( ) est indéfinie pour le type Boisson.
		// donc pas de redéfinition de la méthode, donc pas de polymorphisme.

				
		BoissonAlcoolisee vin = new BoissonAlcoolisee ( "vin", 15, 22 );
		        
		  

///		vin = eau;   
		        
		//  erreur  compilation 
		//  impossible de convertir une Boisson en BoissonAlcoolisee

		//  Voici les instrcutions précédentes pour bien comprendre ce numéro
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
		// avant d'exécuter l'instruction
		// eau = vin;  	
		// si je mets en commentaire l'instruction précédente soit:
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

		 // affecte à 2 le prix d'une bouteille d'eau.

		 eau.setPrix(2);
		    	
		    	
		System.out.println("eau.getPrix() " + eau.getPrix());
		System.out.println("eau.getNom()  " + eau.getNom());
		// resultat =  eau.getPrix() 4.0  
//		 	           eau.getNom() whisky


		    	// il faut bien comprendre que la méthode getPrix est redéfinie 
		    	// dans la sous-classe BoissonAlcoolisee
		    	// et que     eau -->  boisson -->  whisky
		    	// donc exécute la méthode getPrix de la classe whisky (sous-classe)
		    	// à cause du polymorphisme
		    	
		  
		System.out.println( "\n\n----------------------------------------------");
		System.out.println( " vin= " + vin );
		System.out.println( " eau= " + eau );
		System.out.println( " boisson= " + boisson );
		System.out.println( " whisky= " + whisky );
		System.out.println( "----------------------------------------------\n\n");
		    	
		    	
//		    	  attention le prix revient à 2 pour tous ces objets.
//		      	----------------------------------------------
//		    	 vin=      nom = whisky     prix = 2.0   degreAlcool = 40
//		    	 eau=      nom = whisky     prix = 2.0   degreAlcool = 40
//		    	 boisson=  nom = whisky     prix = 2.0   degreAlcool = 40
//		    	 whisky=   nom = whisky     prix = 2.0   degreAlcool = 40
//		    	----------------------------------------------
//		    	
		    	
		    	
		    	
		        	
/////		System.out.println( "eau.getDegreAlcool= " + eau.getDegreAlcool());

		// resultat =  erreur compilation -- méthode indéfinie pour le type Boisson
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
		// boisson (Boisson) a une méthode getPrix
		// boisson --> whisky (BoissonAlcoolisee) a une redéfinition
		// de la méthode donc prend la méthode de whisky (BoissonAlcoolisee).
		    	
		         
		        
		    	
		System.out.println( "vin.getDegreAlcool() " + vin.getDegreAlcool());

		// resultat =  vin.getDegreAlcool() 40
		// vu que     vin -->  eau -->  boisson -->  whisky 
		// ATTENTION  vin et whisky ont une méthode getDegreAlcool
		// ATTENTION  eau et boisson n'en ont pas.
		// ATTENTION  redéfinition entre plusieurs niveaux dans la hiérarchie.
		    	
		    	
		    	
		System.out.println( "vin.getPrix() " + vin.getPrix());

		// resultat =  vin.getPrix() 4.0
		// vu que   vin -->  eau -->  boisson -->  whisky 
		// redéfinition de la méthode dans toutes les classes
		// il exécute la méthode de la classe pointée soit whisky.
		    	
		    	
		    	
		    	
		System.exit(0);

	}

	}


