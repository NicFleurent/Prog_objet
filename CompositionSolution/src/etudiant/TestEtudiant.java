package etudiant;

public class TestEtudiant {

	public static void main(String[] args) {
	
	Adresse cegep = new Adresse("500 de Courval", "Trois-Rivi�res", "Qu�bec", "g2m1m8");
	
	Adresse kerenna = new Adresse("1010  boul Parent", "Trois-Rivi�res", "Qu�bec", "H1O1M8");
	
	Adresse maisonA = new Adresse("888 Alysson", "T-R", "Qu�bec", "G8V1N2");
	
	Adresse maisonT = new Adresse("209 Therrien", "T-R", "Qu�bec", "J9V0D6");
	
	Etudiant alice = new Etudiant("Lagac�","Alice", maisonA, cegep);
	
	Etudiant thomas = new Etudiant("Durand","Thomas", maisonT, kerenna);
	
	Etudiant emile = new Etudiant();

	thomas.setAdresseEcole(kerenna);
	System.out.println(thomas);
	
	emile.setAdresseMaison(maisonT);
	emile.setAdresseEcole(cegep);
	emile.setNom("emile");
	emile.setPrenom("turgeon");
	System.out.println(emile);
	
	alice.setAdresseMaison(new Adresse("222 Lajoie","T-R","Qu�bec","g8v1n2"));
	System.out.println(alice);
	
	alice.setAdresseMaison(thomas.getAdresseMaison());
	System.out.println(alice);
	
	Adresse adrCommune = new Adresse ("9 amoureux","T-R","Qu�bec","l9n4k5");
	alice.setAdresseMaison(adrCommune);
	thomas.setAdresseMaison(adrCommune);
	
	
	}
}
