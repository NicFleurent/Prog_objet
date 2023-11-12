package pkTest;

import pkClasse.*;

public class Test {

	public static void main(String[] args) {
		Adresse unAdresse = new Adresse("5 chemin du parc", "T-R", "G8V1M9");
		Personne unePersonne = new Personne("Dubois", "Gabriel", unAdresse);
		
		System.out.println(unePersonne);
		

	}

}
