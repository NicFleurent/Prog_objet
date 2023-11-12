import java.util.*;

public class Personne implements Comparable, Comparator {
	private String nom;
	private String prenom;
	private int age;
	private String concentration;
	private String ville;
	
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getConcentration() {
		return concentration;
	}



	public void setConcentration(String concentration) {
		this.concentration = concentration;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public int compareTo(Object obj) {
		int resultat;
		Personne unePersonne = (Personne) obj;
		resultat = nom.compareTo(unePersonne.getNom());
		
		return resultat == 0 ? prenom.compareTo(unePersonne.getPrenom()) : resultat;
	}
	
	@Override
	public int compare(Object obj1, Object obj2) {
		Personne unePersonne = (Personne) obj1;
		Personne deuxPersonne = (Personne) obj2;
		return unePersonne.getVille().compareTo(deuxPersonne.getVille());
	}
}
