package etudiant;

public class TestEtudiant {

	public static void main(String[] args) {
	
	Adresse cegep = new Adresse("500 de Courval", "Trois-Rivières", "Québec", "g2m1m8");
	
	Adresse kerenna = new Adresse("1010  boul Parent", "Trois-Rivières", "Québec", "H1O1M8");
	
	Adresse maisonA = new Adresse("888 Alysson", "T-R", "Québec", "G8V1N2");
	
	Adresse maisonT = new Adresse("209 Therrien", "T-R", "Québec", "J9V0D6");
	
	Etudiant alice = new Etudiant("Lagacé","Alice", maisonA, cegep);
	
	Etudiant thomas = new Etudiant("Durand","Thomas", maisonT, kerenna);
	
	Etudiant emile = new Etudiant();

	thomas.setAdresseEcole(kerenna);
	System.out.println(thomas);
	
	emile.setAdresseMaison(maisonT);
	emile.setAdresseEcole(cegep);
	emile.setNom("emile");
	emile.setPrenom("turgeon");
	System.out.println(emile);
	
	alice.setAdresseMaison(new Adresse("222 Lajoie","T-R","Québec","g8v1n2"));
	System.out.println(alice);
	
	alice.setAdresseMaison(thomas.getAdresseMaison());
	System.out.println(alice);
	
	Adresse adrCommune = new Adresse ("9 amoureux","T-R","Québec","l9n4k5");
	alice.setAdresseMaison(adrCommune);
	thomas.setAdresseMaison(adrCommune);
	
	
	}
}
