
public class Cercle extends Point {
   protected double rayon;

	   
	   public Cercle()
	   {
	   	  setRayon( 0 );
	   }
	   
	
	   public Cercle( int coordonneeX, int coordonneeY, double rayonCercle )
	   {
	  	super( coordonneeX, coordonneeY );
  	      setRayon( rayonCercle );
	   }
	   

	   
	   public void setRayon ( double rayonCercle )
	   {
	      rayon = ( rayonCercle >= 0.0 ? rayonCercle : 0.0 );
	   }

	   

	   public double getRayon( )
	   {
	      return rayon;
	   }


	  
	   public double aire( )
	   {
	      return Math.PI * rayon * rayon;
	   }


	  
	  public String toString()
	   {
	      return "Cercle = " + super.toString() +"; Rayon = " + rayon;
	   }
	  

}
