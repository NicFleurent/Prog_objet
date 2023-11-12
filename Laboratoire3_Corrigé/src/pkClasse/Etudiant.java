/***********************************************************************

Le fichier:			Etudiant.java

Projet:				Laboratoire3

Objectifs:			Créer un étudiant

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-02-10

***********************************************************************/

package pkClasse;

import java.util.Arrays;

public class Etudiant {
	
	final	static	private	int		NOTE_MANQUANTE 		= -1;
	final	static	private	int		ABANDON 			= -2;
	final	static	private	int		POND_MANQUANTE 		= -3;
	final	static	private	int		POND_NON_100 		= -4;
	
			static	private	int		ponderation[]		= {POND_MANQUANTE, POND_MANQUANTE, POND_MANQUANTE};
			static 	private boolean	validNoteManquante	= false;
			static 	private boolean	validPondManquante	= false;
					
					private	String	numEtudiant;
					private	String	nom;
					private	String	prenom;
					private	String	titreCours;
					private	ClDate	dateNaissance;
					private	double	note[] = new double[3];
			
	public Etudiant() {
		this.numEtudiant = "100";
		this.nom = "Fleurent";
		this.prenom = "Nicolas";
		this.titreCours = "Programmation objet";
		this.dateNaissance = new ClDate();
		for(int ctr = 0 ; ctr < note.length ; ctr++)
		{
			note[ctr] = NOTE_MANQUANTE;
		}
	}
			
	public Etudiant(String numEtudiant,String nom, String prenom, String titreCours, ClDate dateNaissance) {
		this.numEtudiant = numEtudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.titreCours = titreCours;
		this.dateNaissance = dateNaissance;
		for(int ctr = 0 ; ctr < note.length ; ctr++)
		{
			note[ctr] = NOTE_MANQUANTE;
		}
	}

	//Pour les get de constante, est-ce qu'il faut tous les mettre en majuscule aussi?
	public static int getNOTE_MANQUANTE() {
		return NOTE_MANQUANTE;
	}

	public static int getABANDON() {
		return ABANDON;
	}

	public static int getPOND_MANQUANTE() {
		return POND_MANQUANTE;
	}

	public static int getPOND_NON_100() {
		return POND_NON_100;
	}

	//Dans le cas d'un tableau, est-ce qu'on retourne les 3 pondérations ou ma façon de procédé, sois en demandant la position, est bonne?
	public static int getPonderation(int position) {
		return ponderation[position];
	}

	//Dans le cas d'un tableau, est-ce qu'on retourne les 3 pondérations ou ma façon de procédé, sois en demandant la position, est bonne?
	public static void setPonderation(int position, int _ponderation) {
		if(_ponderation >= 0)
			Etudiant.ponderation[position] = _ponderation;
		else
			Etudiant.ponderation[position] = POND_MANQUANTE;
	}

	public String getNumEtudiant() {
		return numEtudiant;
	}

	public void setNumEtudiant(String numEtudiant) {
		this.numEtudiant = numEtudiant;
	}

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

	public String getTitreCours() {
		return titreCours;
	}

	public void setTitreCours(String titreCours) {
		this.titreCours = titreCours;
	}

	public ClDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(ClDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public double getNote(int position) {
		return note[position];
	}

	public void setNote(int position, double _note) {
		if(_note >= 1 && _note <= 100)
			note[position] = _note;
		else
			note[position] = NOTE_MANQUANTE;
	}
	
	public void definirAbandon() {
		numEtudiant = "NIL";
	}
	
	public double calculerNoteFinale() {
		double noteFinale = 0;
		
		validNoteManquante = false;
		
		if(numEtudiant != "NIL")
		{
			for(int ctr = 0 ; ctr < note.length ; ctr++)
			{
				if(note[ctr] == NOTE_MANQUANTE)
					validNoteManquante = true;
			}
			
			if(validNoteManquante)
			{
				noteFinale = NOTE_MANQUANTE;
			}
			else
			{
				if(validerPond() == 0)
				{
					for(int ctr = 0 ; ctr < note.length ; ctr++)
					{
						noteFinale += note[ctr] / 100 * ponderation[ctr];
					}
				}
				else if(validerPond() == ABANDON)
				{
					noteFinale = ABANDON;
				}
				else if(validerPond() == POND_NON_100)
				{
					noteFinale = POND_NON_100;
				}
				else
				{
					noteFinale = POND_MANQUANTE;
				}
			}
				
		}
		else
			noteFinale = ABANDON;
		
		return noteFinale;
	}
	
	private int validerPond() {
		int validPond = 0;
		int totalPond = 0;
		
		validPondManquante = false;
		
		if(numEtudiant != "NIL")
		{
			for(int ctr = 0 ; ctr < ponderation.length ; ctr++)
			{
				if (ponderation[ctr] == POND_MANQUANTE)
					validPondManquante = true;
			}
			
			if(validPondManquante)
			{
				validPond = POND_MANQUANTE;
			}
			else
			{
				for(int ctr = 0 ; ctr < ponderation.length ; ctr++)
				{
					totalPond += ponderation[ctr];
				}
				
				if(totalPond != 100)
					validPond = POND_NON_100;
			}
		}
		else
			validPond = ABANDON;
		
		return validPond;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + Arrays.hashCode(note);
		result = prime * result + ((numEtudiant == null) ? 0 : numEtudiant.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((titreCours == null) ? 0 : titreCours.hashCode());
		return result;
	}

	public boolean equals(Etudiant obj) {
		boolean validNote = true;
		
		for(int ctr = 0 ; ctr < note.length ; ctr++)
				{
					if(note[ctr] == obj.getNote(ctr))
						validNote = false;
				}
		
		return(	numEtudiant == obj.getNumEtudiant()
				&&
				nom.equals(obj.getNom())
				&&
				prenom.equals(obj.getPrenom())
				&&
				titreCours.equals(obj.getTitreCours())
				&&
				dateNaissance.equals(obj.getDateNaissance())
				&&
				validNote);
	}

	public String toString() {
		String affichage = "";
		
		affichage += "Etudiant [numEtudiant=" + numEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", titreCours="
				+ titreCours + ", dateNaissance=" + dateNaissance;
		
		for(int ctr = 0 ; ctr < note.length ; ctr++)
		{
			affichage += ", note" + ctr + "=" + note[ctr];
		}
		
		affichage += "]";
		
		return affichage;
	}
	
	

}
