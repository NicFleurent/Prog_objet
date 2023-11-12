package pkTest;

import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {
		
		StringTokenizer uneChaine = new StringTokenizer("Hello my dear:world");
		
		while(uneChaine.hasMoreElements()) {
			System.out.println(uneChaine.nextToken());
		}
		
		
		StringTokenizer deuxChaine = new StringTokenizer("Hello my dear:world", ":");
		
		while(deuxChaine.hasMoreElements()) {
			System.out.println(deuxChaine.nextToken());
		}
		
		System.out.println(longueurMoyenne("J'aime vraiment beaucoups les patates lorsqu'elles sont bien cuites"));

		StringTokenizer troisChaine = new StringTokenizer("Hello my dear,world", ",");
		
		System.out.println(troisChaine.countTokens());
		
		System.out.println(motEnS("Je m'appel Nicolas et j'aime les pommes"));
		
		System.out.println(sommeIntChaine("1,2,150,banane,carotte"));

	}
	
	public static double longueurMoyenne(String nom) {
		
		StringTokenizer str = new StringTokenizer(nom);
		int nbrMot = str.countTokens();
		int longueurMot = 0;
		
		while(str.hasMoreElements()) {
			String mot = str.nextToken();
			longueurMot += mot.length();
		}
		
		return (double) longueurMot / nbrMot;
	}
	
	public static String motEnS(String mot) {
		StringTokenizer chaine = new StringTokenizer(mot);
		
		String listeMot = "";
		
		while(chaine.hasMoreTokens()) {
			String motCourantString = chaine.nextToken();
			
			if(motCourantString.contains("s")) {
				listeMot += motCourantString + ", ";
			}
		}
		
		return listeMot;
	}
	
	public static int sommeIntChaine(String chaine) {
		StringTokenizer token = new StringTokenizer(chaine, ",");
		
		int resultat = 0;
		
		while(token.hasMoreTokens()) {
			String motCourantString = token.nextToken();
			
			try {
				resultat += Integer.parseInt(motCourantString);
			}
			catch(NumberFormatException nfe){
				System.out.println(motCourantString + " n'est pas un nombre.");
			}
		}
		
		return resultat;
	}

}
