
public class TestPointCercle {

	public static void main(String[] args) {
		// TODO Stub de la m�thode g�n�r� automatiquement
		Point point1, point2;
		Cercle cercle1, cercle2;

		point1  = new Point ( 1, 2 );
		cercle1 = new Cercle( 4, 5 , 2);
				    

		cercle1.x  = 23 ;     
		//  Lien d'h�ritage avec m�thode d'acc�s protected aux attributs.
		//  L'acc�s est donc comme public � l'int�rieur de la hi�rarchie.

				  
		point2 = cercle1;   
		//  transtypage?      OUI      Transtypage ascendant.
		//  la variable r�f�rence est point2 qui pointe sur un objet de type Cercle.
		//  on a donc une vue de Point sur l'objet Cercle.
		//  on ne voit donc que les attributs et m�thodes de Point et 
		//  on ne voit pas les attributs et m�thodes de l'objet Cercle.

				    
		System.out.println ("point2.toString= " + point2.toString());
		// resultat =  point2.toString= Centre = [23, 5]; Rayon = 2.0
		// la classe Point et Cercle ont tous les deux une m�thode toString ( )
		// h�ritage, red�finition donc les 2 conditions sont l� pour que
//		           le polymorphisme soit appliqu� correctement.
		// c'est donc la m�thode toString de la classe Cercle qui sera ex�cut�e.


		System.out.println("point2.getY = " + point2.getY());
		// resultat =  point2.getY = 5
		// La classe Cercle h�rite de la m�thode getY de la classe Point.
		// Donc va donner la valeur du Y pour la classe Cercle.

		System.out.println("point2.getX = " + point2.getX());
		// point2.getX = 23
				
		System.out.println("cercle1.getX = " + cercle1.getX());
		// cercle1.getX = 23    



		cercle1.setPoint(22, 22);
				    
		System.out.println("point2 ==  " + point2);
		// point2==  Cercle = [22, 22]; Rayon = 2.0
				
		System.out.println("cercle1==  " + cercle1);		
		// cercle1==  Cercle = [22, 22]; Rayon = 2.0


//////		System.out.println("point2.getRayon( ) = " + point2.getRayon());
		//  resultat =  erreur compilation - 
//		              la m�thode getRayon est ind�finie pour le type Point.
		//  car on a une vue de Point sur la classe Cercle
//		         et dans la classe Point on a pas de m�thode getRayon.
		//  il n'y a pas de red�finition de la m�thode
		//  Donc le polymorphisme ne peut pas �tre appliqu� correctement.


			
		Point point5 = new Cercle( );

/////		System.out.println("point5.getRayon( )= " + point5.getRayon( ) );
		// resultat =  erreur compilation.    m�thode ind�finie pour Point
		// la variable r�f�rence point5 a une vue de Point sur un objet de type Cercle.
		// la m�thode getRayon n'existe pas dans la classe Point 
		// on ne peut donc appliquer le polymorphisme car 
		// il n'y a pas red�finition de m�thode.
					   
					   
		System.out.println("point5.getX( )= " + point5.getX( ) );
		// resultat =  point5.getX( )= 0
		// la variable r�f�rence point5 pointe vers un objet de type Cercle.
		// le cercle h�rite de la m�thode getX.
		// donc cela donne le r�sultat du X de la classe Cercle
					   
/////		System.out.println("point5.aire( )= " + point5.aire( ) );
		// resultat =  erreur compilation, m�thode ind�fnie pour le type Point
		// La variable r�f�rence point5 pointe sur un type Cercle
		// la variable r�f�rence point5 a une vue de point 
		// sur un objet de type cercle.
		// la m�thode aire( )  n'existe pas dans la classe Point 
		// on ne peut donc appliquer le polymorphisme car 
		// il n'y a pas red�finition de m�thode. 
					   
		point5.setPoint(10, 20);

///		point5.setRayon(2);   
		// erreur compilation

		System.out.println("point5.toString( )= " + point5.toString( ) );
		// point5.toString( )= Cercle = [10, 20]; Rayon = 0.0
		// Va ex�cuter la m�thode toString de la classe Cercle, polymorphisme.

					   
///		Cercle cercle5 = new Point( );
		//  Erreur compilation --  impossible de convertir Point en Cercle.
		//  transtypage descendant. downcasting.

	}

}
