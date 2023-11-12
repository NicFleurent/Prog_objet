package personne;

public class TestPersonneAdresse {

	public static void main(String[] args) {
		
		
		Personne unePersonne    =  new Personne ( "Dubois", "Gabriel" );
		Adresse     uneAdresse        =  new Adresse      ( "5 chemin du Parc", "Trois-Rivières", "G8V 1M9"  );
		unePersonne.setAdresse     ( uneAdresse );
		System.out.println(unePersonne);
		
		
		Personne deuxPersonne   = new Personne ( "Dupuis", "Jean-Luc" );
		deuxPersonne.setAdresse   ( new Adresse   ( "8 Chemin ",  "TR " ,  "G7P 1N9" ) );
		deuxPersonne.setAdresse   ( unePersonne.getAdresse ( ) );
		deuxPersonne.setAdresse   ( uneAdresse );
		System.out.println(unePersonne);
		System.out.println(deuxPersonne);
		
		
		Adresse  adresseCommune  =  new Adresse ( "3500 de Courval", "T-R","J8N 9K0" );
		unePersonne.setAdresse           ( adresseCommune );
		deuxPersonne.setAdresse         ( adresseCommune );
		System.out.println(unePersonne);
		System.out.println(deuxPersonne);

	}

}
