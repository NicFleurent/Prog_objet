package pkTest;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		
		Vector<String> vecteur = new Vector<String>();
		
		vecteur.add("telephone");
		vecteur.add("souris");
		vecteur.add("clavier");
		
		System.out.println(vecteur);
		
		Vector<Integer> vecteur2 = new Vector<Integer>();
		
		vecteur2.add(1);
		vecteur2.add(2);
		vecteur2.add(3);
		vecteur2.add(10);
		vecteur2.add(5);
		vecteur2.add(6);
		vecteur2.add(7);
		vecteur2.add(8);
		vecteur2.add(9);
		vecteur2.add(4);
		
		vecteur2.remove(2);
		vecteur2.remove(5);
		vecteur2.remove(new Integer(9));
		
		System.out.println(vecteur2);
		
		
		int somme = 0;
		for(int ctr = 0 ; ctr < vecteur2.size(); ctr++) {
			somme += vecteur2.get(ctr);
		}
		System.out.println(somme);

		int max = 0;
		for(int ctr = 0 ; ctr < vecteur2.size(); ctr++) {
			if(max < vecteur2.get(ctr))
				max = vecteur2.get(ctr);
		}
		System.out.println(max);
		
		System.out.println(remplirVecteur(10));
		
		System.out.println(somme(vecteur2));

		System.out.println(max(vecteur2));
		

	}
	
	public static Vector<Integer> remplirVecteur(int size){
		
		Vector<Integer> nombresAleatoire = new Vector<Integer>();
		
		int nombre;
		
		for(int ctr = 0 ; ctr < size ; ctr++) {
			nombre = 1 + (int) (Math.random() * 100);
		
			nombresAleatoire.add(nombre);
		}
		
		return nombresAleatoire;
	}
	
	public static int somme(Vector<Integer> vector) {
		int somme = 0;
		
		for(int ctr = 0 ; ctr < vector.size() ; ctr++) {
			somme += vector.get(ctr);
		}
		
		return somme;
	}
	
	public static int max(Vector<Integer> vector) {
		int max = 0;
		
		
		for(int ctr = 0 ; ctr < vector.size() ; ctr++) {
			if(max < vector.get(ctr))
				max = vector.get(ctr);
		}
		
		return max;
	}

}
