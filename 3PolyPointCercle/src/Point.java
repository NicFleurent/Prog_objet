
public class Point {
	   protected int x, y; 
		


	   public Point()
	   {
	 	 setPoint( 0, 0 );
	   }

	   
	   public Point( int coordonneeX, int coordonneeY )
	   {
	      setPoint( coordonneeX, coordonneeY );
	   }


	   public void setPoint( int coordonneeX, int coordonneeY )
	   {
	      x = coordonneeX;
	      y = coordonneeY;
	   }

	 
	   public int getX()
	   {
	      return x;
	   }


	   public int getY()
	   {
	      return y;
	   }


	   public String toString()
	   {
	      return "[" + x + ", " + y + "]";
	   }

}
