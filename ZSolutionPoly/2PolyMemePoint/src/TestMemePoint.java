
public class TestMemePoint {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		Point unPoint     = new Point (1,11);
		Point deuxPoint   = new Point (2,22);
		Point troisPoint  = new Point (4,44);
		Point quatrePoint = new Point (4,44);

		        
		unPoint = deuxPoint;

		deuxPoint.x = 12;
		System.out.println ( "unPoint.toString= " + unPoint.toString());
		// unPoint.toString= [12, 22]
		        


		deuxPoint.setX(33);
		System.out.println ( "unPoint.toString= " + unPoint.toString());
		// unPoint.toString= [33, 22]
			


		unPoint.setY(88);
		System.out.println ( "unPoint.toString  = " +  unPoint.toString());
		// unPoint.toString  = [33, 88]

				
		System.out.println ( "deuxPoint.toString= " +  deuxPoint.toString());
		// deuxPoint.toString= [33, 88]
		System.out.println ( "____________________________________________________ ");

			


		deuxPoint.setX(44);
		deuxPoint.setY(55);
		unPoint.setY(66);
		System.out.println ( "unPoint     setY(66)=  " + unPoint.toString());
		System.out.println ( "deuxPoint   setY(66)=  " + deuxPoint.toString());


		// unPoint     setY(66)=  [44, 66]
		// deuxPoint   setY(66)=  [44, 66]
		System.out.println ( "____________________________________________________ ");

	}
}
