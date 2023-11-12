
public class TestPointCercle {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		Point point1, point2;
		Cercle cercle1, cercle2;

		point1  = new Point ( 1, 2 );
		cercle1 = new Cercle( 4, 5 , 2);
				    

		cercle1.x  = 23 ;     
		//  Lien d'héritage avec méthode d'accès protected aux attributs.
		//  L'accès est donc comme public à l'intérieur de la hiérarchie.

				  
		point2 = cercle1;   
		//  transtypage?      OUI      Transtypage ascendant.
		//  la variable référence est point2 qui pointe sur un objet de type Cercle.
		//  on a donc une vue de Point sur l'objet Cercle.
		//  on ne voit donc que les attributs et méthodes de Point et 
		//  on ne voit pas les attributs et méthodes de l'objet Cercle.

				    
		System.out.println ("point2.toString= " + point2.toString());
		// resultat =  point2.toString= Centre = [23, 5]; Rayon = 2.0
		// la classe Point et Cercle ont tous les deux une méthode toString ( )
		// héritage, redéfinition donc les 2 conditions sont là pour que
//		           le polymorphisme soit appliqué correctement.
		// c'est donc la méthode toString de la classe Cercle qui sera exécutée.


		System.out.println("point2.getY = " + point2.getY());
		// resultat =  point2.getY = 5
		// La classe Cercle hérite de la méthode getY de la classe Point.
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
//		              la méthode getRayon est indéfinie pour le type Point.
		//  car on a une vue de Point sur la classe Cercle
//		         et dans la classe Point on a pas de méthode getRayon.
		//  il n'y a pas de redéfinition de la méthode
		//  Donc le polymorphisme ne peut pas être appliqué correctement.


			
		Point point5 = new Cercle( );

/////		System.out.println("point5.getRayon( )= " + point5.getRayon( ) );
		// resultat =  erreur compilation.    méthode indéfinie pour Point
		// la variable référence point5 a une vue de Point sur un objet de type Cercle.
		// la méthode getRayon n'existe pas dans la classe Point 
		// on ne peut donc appliquer le polymorphisme car 
		// il n'y a pas redéfinition de méthode.
					   
					   
		System.out.println("point5.getX( )= " + point5.getX( ) );
		// resultat =  point5.getX( )= 0
		// la variable référence point5 pointe vers un objet de type Cercle.
		// le cercle hérite de la méthode getX.
		// donc cela donne le résultat du X de la classe Cercle
					   
/////		System.out.println("point5.aire( )= " + point5.aire( ) );
		// resultat =  erreur compilation, méthode indéfnie pour le type Point
		// La variable référence point5 pointe sur un type Cercle
		// la variable référence point5 a une vue de point 
		// sur un objet de type cercle.
		// la méthode aire( )  n'existe pas dans la classe Point 
		// on ne peut donc appliquer le polymorphisme car 
		// il n'y a pas redéfinition de méthode. 
					   
		point5.setPoint(10, 20);

///		point5.setRayon(2);   
		// erreur compilation

		System.out.println("point5.toString( )= " + point5.toString( ) );
		// point5.toString( )= Cercle = [10, 20]; Rayon = 0.0
		// Va exécuter la méthode toString de la classe Cercle, polymorphisme.

					   
///		Cercle cercle5 = new Point( );
		//  Erreur compilation --  impossible de convertir Point en Cercle.
		//  transtypage descendant. downcasting.

	}

}
