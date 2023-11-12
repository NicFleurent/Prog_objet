package pkTest;

import pkClasse.*;

public class Test {
	
	private static Ville donnees [ ] =
		{
		new Ville ( "trois-Rivieres", 20000 ),
		new Ville ( "Sherbrooke", 50000 ),
		new Ville ( "Washington", 100000 ),
		new Ville ( "Québec", 400000 )
		};
		private static BDVilles uneBD = new BDVilles ( donnees );

	public static void main(String[] args) {
		
		Ville sherbrooke = (Ville) uneBD.lire(1);
		
		System.out.println ( "\n uneBD = " + uneBD.toString ( ) );
		Ville ott = new Ville ( "Ottawa", 200000 );
		uneBD.ajouter ( new Ville ( "Montreal", 60000 ) );
		System.out.println ( " La ville à la position 2 est: " + uneBD.lire ( sherbrooke ) );
		uneBD.supprimer ( 3 ) ;
		uneBD.ajouter ( ott );
		System.out.println ( "\n la position de ottawa est= " + ( uneBD.indexOf ( ott ) + 1 ) ) ;
		System.out.println ( "\n" + uneBD.toString ( ) );
		

	}

}
