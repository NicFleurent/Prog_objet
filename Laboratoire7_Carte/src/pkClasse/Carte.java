/***********************************************************************

Le fichier:			Carte.java

Projet:				Laboratoire7_Carte

Objectifs:			Créer les cartes

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-03-30

***********************************************************************/

package pkClasse;

public class Carte implements Comparable<Carte> {
	
	protected String couleur;
	protected int	 face;
	
	public Carte() {
		this.couleur = "coeur";
		this.face = 1;
	}
	
	public Carte(String couleur, int face) {
		this.couleur = couleur;
		this.face = face;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getFace() {
		return face;
	}

	public void setFace(int face) {
		this.face = face;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((couleur == null) ? 0 : couleur.hashCode());
		result = prime * result + face;
		return result;
	}

	public boolean equals(Carte obj) {
		return(	couleur.equals(obj.getCouleur()) &&
				face == obj.getFace());
	}

	public String toString() {
		return convertirFace() + " de " + couleur + "\n";
	}

	public int compareTo(Carte uneCarte) {
		if(couleur.compareTo(uneCarte.getCouleur()) < 0) {
			return -1;
		}
		else if(couleur.compareTo(uneCarte.getCouleur()) == 0) {
			if(face < uneCarte.getFace()) {
				return -1;
			}
			else if(face == uneCarte.getFace()){
				return 0;
			}
			else {
				return 1;
			}
		}
		else {
			return 1;
		}	
	}
	
	private String convertirFace() {
		switch(face)
		{
		case 1 : return "As";
		case 2 : return "Deux";
		case 3 : return "Trois";
		case 4 : return "Quatre";
		case 5 : return "Cinq";
		case 6 : return "Six";
		case 7 : return "Sept";
		case 8 : return "Huit";
		case 9 : return "Neuf";
		case 10 : return "Dix";
		case 11 : return "Valet";
		case 12 : return "Reine";
		case 13 : return "Roi";
		default : return "n/d";
		}
	}
	
}
