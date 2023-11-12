package pkTest;

import pkClasses.*;

public class TestCompagnieJeuVideo {

	public static void main(String[] args) {
		//TestCompagnieJeuVideo
		//1- Cr�ez un nouvel objet du nom d�Ubisoft  ( type Compagnie ) 
		//Te servir du constructeur par d�faut.
		Compagnie ubisoft = new Compagnie();
		System.out.println ("1------------------------------------------------------------------------");
		
		//2- Cr�ez un nouvel objet du nom de assassinCreed ( type jeuVideo) 
		//Nom : Assassin Creed, Style : Aventure et anneeParution : 2008
		JeuVideo assassinCreed = new JeuVideo("Assassin Creed", "Aventure", 2008);
		System.out.println ("2------------------------------------------------------------------------");
		
		// 3-   Affectez assassinCreed � ubisoft.
		ubisoft.setJeuVideo(assassinCreed);
		System.out.println ("3------------------------------------------------------------------------");

		// 4-   Assignez Ubisoft comme nom de l�objet ubisoft. 
		ubisoft.setNom("Ubisoft");      
		System.out.println ("4------------------------------------------------------------------------");

		// 5-   Affichez le contenu de l'objet de type Compagnie : ubisoft.
		System.out.println("5- Ubisoft: " + ubisoft);
		System.out.println  ("5------------------------------------------------------------------------");

		/* 6- Cr�ez un objet type Compagnie, du nom d�EA, avec les informations suivantes : nom : EA, anneeFondation : 1982, nombreEmploye : 9800, cr�ez un nouveau jeu �� battlefield1942�� qui aura les caract�ristiques suivantes (nom : Battlefield 1942, style : fps, anneeParution : 2002) qui sera ajout� � la compagnie eA. */
		Compagnie 	eA 				= new Compagnie("EA", 1982, new JeuVideo(), 9800);
		JeuVideo 	battlefield1942	= new JeuVideo("Battlefield", "fps", 2002);
		eA.setJeuVideo(battlefield1942);
		System.out.println ("6-------------------------------------------------------------------------");
		
		// 7- Affichez les informations de la compagnie eA
		System.out.println ("7- Les informations de la compagnie EA sont : "  +    eA   );       
		System.out.println ("7-------------------------------------------------------------------------");

		// 8-     Cr�er un autre objet jeu qui s�appellera deusEx. Ces caract�ristiques seront (nom : Deus Ex: Human Revolution, style : action, anneeParution : 2011)
		JeuVideo deusEx = new JeuVideo("Deus Ex: Human Revolution", "action", 2011);
		System.out.println ("8-------------------------------------------------------------------------");

		// 9- Cr�er un troisi�me objet Compagnie du nom de eidosMontreal. Il aura comme nom Eidos Montr�al, anneeFondation 2007, nombreEmploye : 500, le jeu sera cr�� en utilisant le constructeur par d�faut)
		Compagnie eidosMontreal = new Compagnie("Eidos Montreal", 20007, new JeuVideo(), 500);
		System.out.println ("9---------------------------------------------------------------------");

		// 10- Affichez seulement le nombre d�employ�s de l�objet eidosMontreal du type Compagnie
		System.out.println ("10- nombre d�employ�s de Eidos Montreal : " + eidosMontreal.getNombreEmploye());
		System.out.println ("10----------------------------------------------------------------------");

		//  11- On vient d�engager 1 employ� chez Eidos Montreal.
		//Ajouter un employ� � l�objet eidosMontreal en utilisant la m�thode appropri�e et afficher le nombre d�employ�s.
		eidosMontreal.ajouterEmploye();
		System.out.println ("11- nombre d�employ�s de Eidos Montreal : " + eidosMontreal.getNombreEmploye());
		System.out.println ("11---------------------------------------------------------------------");

		// 12- Changez le jeu de l�objet eidosMontreal. Son jeu sera maintenant deusEx.
		eidosMontreal.setJeuVideo(deusEx);
		System.out.println ("12---------------------------------------------------------------------");

		// 13- Affichez seulement le nom du jeu deusEx, mais � partir de l�objet de type, Compagnie eidosMontreal.  
		System.out.println ("13- Nom du jeu de Eidos Montreal apr�s le changement: " +  eidosMontreal.getJeuVideo().getNom());
		System.out.println ("13--------------------------------------------------------------------");

		// 14- Assignez les propri�t�s suivantes � l'objet motiveStudio de type Compagnie.  
		//Assignez ��Motive Studio�� comme nom.
		//Assignez 100 comme nombreEmploy�
		//Assignez l�Object deuxEx comme jeu
		//Assignez 2015 comme anneeFondation
		Compagnie motiveStudio = new Compagnie();
		motiveStudio.setNom("Motive Studio");
		motiveStudio.setNombreEmploye(100);
		motiveStudio.setJeuVideo(deusEx);
		motiveStudio.setAnneeFondation(2015);

		//Affichez l�objet motiveStudio
		System.out.println ("14- Motive studio = " + motiveStudio);
		System.out.println ("14-----------------------------------------------------------------");

		// 15- Assignez -2 comme nombre d�employ�s � l�objet motiveStudio.
		//Affichez motiveStudio
		motiveStudio.setNombreEmploye(-2);
		System.out.println ("15-  motiveStudio = " + motiveStudio);
		System.out.println ("15------------------------------------------------------------------");

		// 16- Cr�ez un nouvel objet du nom de redBarrels de type Compagnie ( const. par d�faut ).
		//Assignez lui le jeu deuxEx
		//Affichez ces informations.
		Compagnie redBarrels = new Compagnie();
		redBarrels.setJeuVideo(deusEx);
		System.out.println ("16- Red Barrels= " + redBarrels);
		System.out.println ("16----------------------------------------------------------------------");

		// 17- Enlever 2 employ�s � l�objet redBarrels en utilisant la m�thode appropri�e.
		//Affichez ses infos.
		redBarrels.enleverEmploye();
		redBarrels.enleverEmploye();
		System.out.println ("17 - Red Barrels = " + redBarrels);
		System.out.println ("17--------------------------------------------------------------------");

		// 18- Ajoutez un employ� � l�objet redBarrels.
		// Affichez seulement les attributs pour conna�tre le nombre d'employ�s de redBarrels son ann�e de fondation.
		redBarrels.ajouterEmploye();
		System.out.println ( "18- Red Barrels = " + "nombreEmploye=" + redBarrels.getNombreEmploye() + ", anneeFondation=" + redBarrels.getAnneeFondation());
		System.out.println ("18--------------------------------------------------------------------");
				
		// 19- Changez le style de deuxEx par sport. Affichez l�objet deuxEx 
		deusEx.setStyle("sport");
		System.out.println ( "19- le jeu Deus Ex = " + deusEx);
		System.out.println ("19--------------------------------------------------------------------");

		// 20-  Creez 2 objets Compagnies en utilisant le constructeur par d�faut qui seront appel�s ludia et compulsionGame.
		// 20- ----------------------------------------------------------------------------------------------------
		Compagnie ludia = new Compagnie();
		Compagnie compulsionGame = new Compagnie();

		// 21 -   Inscrivez la commande qui v�rifie si les 2 objets, ludia et compulsionGame sont �gaux.
		System.out.println ("21-  ludia et compulsionGame =  " + ludia.equals(compulsionGame));

		// 22 �   Augmentez le nombre d�employ�s de ludia de 1.                     
//		            Inscrivez la commande qui v�rifie si les 2 objets, ludia et compulsionGame sont �gaux.
		ludia.ajouterEmploye();
		System.out.println ("22-  ludia et compulsionGame =  " + ludia.equals(compulsionGame));

		// 23 -   Inscrivez la commande qui v�rifie si les 2 objets, ludia et ubisoft sont �gaux.	         
		System.out.println ("23- ludia et ubisoft =  " + ludia.equals(ubisoft)) ;

		// 24- Affectez � MEILLEUR_PLATEFORME_GAMING la valeur la valeur � PC �, vous devez le faire directement dans la classe Compagnie. Affichez ensuite cette valeur.
		System.out.println ("24- la meilleure plateforme de gaming est = " + Compagnie.getMeilleurPlateformeGaming());
		System.out.println ("24------------------------------------------------------------------");   

		// 25 - Affichez le nombre de compagnies qui a �t� cr��.
		System.out.println ("25- Le nombre de compagnies est: " + Compagnie.getNombreCompagnie());
		System.out.println ("25-------------------------------------------------------------------");


		// 26 - Ins�rez vos r�sultats en commentaire ici.
//		1------------------------------------------------------------------------
//		2------------------------------------------------------------------------
//		3------------------------------------------------------------------------
//		4------------------------------------------------------------------------
//		5- Ubisoft: Compagnie [nom=Ubisoft, anneeFondation=0, jeuVideo=JeuVideo [nom=Assassin Creed, style=Aventure, anneeParrution=2008], nombreEmploye=1]
//		5------------------------------------------------------------------------
//		6-------------------------------------------------------------------------
//		7- Les informations de la compagnie EA sont : Compagnie [nom=EA, anneeFondation=1982, jeuVideo=JeuVideo [nom=Battlefield, style=fps, anneeParrution=2002], nombreEmploye=9800]
//		7-------------------------------------------------------------------------
//		8-------------------------------------------------------------------------
//		9---------------------------------------------------------------------
//		10- nombre d�employ�s de Eidos Montreal : 500
//		10----------------------------------------------------------------------
//		11- nombre d�employ�s de Eidos Montreal : 501
//		11---------------------------------------------------------------------
//		12---------------------------------------------------------------------
//		13- Nom du jeu de Eidos Montreal apr�s le changement: Deus Ex: Human Revolution
//		13--------------------------------------------------------------------
//		14- Motive studio = Compagnie [nom=Motive Studio, anneeFondation=2015, jeuVideo=JeuVideo [nom=Deus Ex: Human Revolution, style=action, anneeParrution=2011], nombreEmploye=100]
//		14-----------------------------------------------------------------
//		15-  motiveStudio = Compagnie [nom=Motive Studio, anneeFondation=2015, jeuVideo=JeuVideo [nom=Deus Ex: Human Revolution, style=action, anneeParrution=2011], nombreEmploye=1]
//		15------------------------------------------------------------------
//		16- Red Barrels= Compagnie [nom= , anneeFondation=0, jeuVideo=JeuVideo [nom=Deus Ex: Human Revolution, style=action, anneeParrution=2011], nombreEmploye=1]
//		16----------------------------------------------------------------------
//		17 - Red Barrels = Compagnie [nom= , anneeFondation=0, jeuVideo=JeuVideo [nom=Deus Ex: Human Revolution, style=action, anneeParrution=2011], nombreEmploye=1]
//		17--------------------------------------------------------------------
//		18- Red Barrels = nombreEmploye=2, anneeFondation=0
//		18--------------------------------------------------------------------
//		19- le jeu Deus Ex = JeuVideo [nom=Deus Ex: Human Revolution, style=ind�fini, anneeParrution=2011]
//		19--------------------------------------------------------------------
//		21-  ludia et compulsionGame =  true
//		22-  ludia et compulsionGame =  false
//		23- ludia et ubisoft =  false
//		24- la meilleure plateforme de gaming est = PC
//		24------------------------------------------------------------------
//		25- Le nombre de compagnies est: 7
//		25-------------------------------------------------------------------


	}

}
