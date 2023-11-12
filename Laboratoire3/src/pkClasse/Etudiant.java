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

public class Etudiant {
	
	final	static	private	int		noteManquante 	= -1;
	final	static	private	int		abandon 		= -2;
	final	static	private	int		pondManquante 	= -3;
	final	static	private	int		pondNon100 		= -4;
	
			static	private	int		pondLabo			= -3;
			static	private	int		pondMiSession		= -3;
			static	private	int		pondSynthese		= -3;
					
					private	String	numEtudiant;
					private	String	nom;
					private	String	prenom;
					private	String	titreCours;
					private	ClDate	dateNaissance;
					private	double	noteLabo;
					private	double	noteMiSession;
					private	double	noteSynthese;
			
	public Etudiant() {
		this.numEtudiant = "100";
		this.nom = "Fleurent";
		this.prenom = "Nicolas";
		this.titreCours = "Programmation objet";
		this.dateNaissance = new ClDate();
		this.noteLabo = -1;
		this.noteMiSession = -1;
		this.noteSynthese = -1;
	}
			
	public Etudiant(String numEtudiant,String nom, String prenom, String titreCours, ClDate dateNaissance) {
		this.numEtudiant = numEtudiant;
		this.nom = nom;
		this.prenom = prenom;
		this.titreCours = titreCours;
		this.dateNaissance = dateNaissance;
		this.noteLabo = -1;
		this.noteMiSession = -1;
		this.noteSynthese = -1;
	}

	public static int getNotemanquante() {
		return noteManquante;
	}

	public static int getAbandon() {
		return abandon;
	}

	public static int getPondmanquante() {
		return pondManquante;
	}

	public static int getPondNon100() {
		return pondNon100;
	}

	public static int getPondLabo() {
		return pondLabo;
	}

	public static void setPondLabo(int _pondLabo) {
		if(_pondLabo >= 0)
			Etudiant.pondLabo = _pondLabo;
		else
			Etudiant.pondLabo = pondManquante;
	}

	public static int getPondMiSession() {
		return pondMiSession;
	}

	public static void setPondMiSession(int _pondMiSession) {
		if(_pondMiSession >= 0)
			Etudiant.pondMiSession = _pondMiSession;
		else
			Etudiant.pondMiSession = pondManquante;
	}

	public static int getPondSynthese() {
		return pondSynthese;
	}

	public static void setPondSynthese(int _pondSynthese) {
		if(_pondSynthese >= 0)
			Etudiant.pondSynthese = _pondSynthese;
		else
			Etudiant.pondSynthese = pondManquante;
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

	public double getNoteLabo() {
		return noteLabo;
	}

	public void setNoteLabo(double _noteLabo) {
		if(_noteLabo >= 1 && _noteLabo <= 100)
			noteLabo = _noteLabo;
		else
			noteLabo = noteManquante;
	}

	public double getNoteMiSession() {
		return noteMiSession;
	}

	public void setNoteMiSession(double _noteMiSession) {
		if(_noteMiSession >= 1 && _noteMiSession <= 100)
			noteMiSession = _noteMiSession;
		else
			noteMiSession = noteManquante;
	}

	public double getNoteSynthese() {
		return noteSynthese;
	}

	public void setNoteSynthese(double _noteSynthese) {
		if(_noteSynthese >= 1 && _noteSynthese <= 100)
			noteSynthese = _noteSynthese;
		else
			noteSynthese = noteManquante;
	}
	
	public void définirAbandon() {
		numEtudiant = "NIL";
	}
	
	public double calculerNoteFinale() {
		double noteFinale;
		
		if(numEtudiant != "NIL")
		{
			if(noteLabo != noteManquante && noteMiSession != noteManquante && noteSynthese != noteManquante)
			{
				if(validerPond() == 0)
				{
					noteFinale = (noteLabo / 100 * pondLabo) + (noteMiSession / 100 * pondMiSession) + (noteSynthese / 100 * pondSynthese);
				}
				else if(validerPond() == abandon)
				{
					noteFinale = abandon;
				}
				else if(validerPond() == pondNon100)
				{
					noteFinale = pondNon100;
				}
				else
				{
					noteFinale = pondManquante;
				}
			}
			else
				noteFinale = noteManquante;
		}
		else
			noteFinale = abandon;
		
		return noteFinale;
	}
	
	private int validerPond() {
		int validPond = 0;
		
		if(numEtudiant != "NIL")
		{
			if(pondLabo != pondManquante || pondMiSession != pondManquante || pondSynthese != pondManquante)
			{
				if(pondLabo + pondMiSession + pondSynthese != 100)
					validPond = pondNon100;
			}
			else
				validPond = pondManquante;
		}
		else
			validPond = abandon;
		
		
		return validPond;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateNaissance == null) ? 0 : dateNaissance.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		long temp;
		temp = Double.doubleToLongBits(noteLabo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(noteMiSession);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(noteSynthese);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((numEtudiant == null) ? 0 : numEtudiant.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((titreCours == null) ? 0 : titreCours.hashCode());
		return result;
	}

	public boolean equals(Etudiant obj) {
		return(	numEtudiant == obj.getNumEtudiant()
				&&
				nom == obj.getNom()
				&&
				prenom == obj.getPrenom()
				&&
				titreCours == obj.getTitreCours()
				&&
				dateNaissance == obj.getDateNaissance()
				&&
				noteLabo == obj.getNoteLabo()
				&&
				noteMiSession == obj.getNoteMiSession()
				&&
				noteSynthese == obj.getNoteSynthese());
	}

	public String toString() {
		return "Etudiant [numEtudiant=" + numEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", titreCours="
				+ titreCours + ", dateNaissance=" + dateNaissance + ", noteLabo=" + noteLabo + ", noteMiSession="
				+ noteMiSession + ", noteSynthese=" + noteSynthese + "]";
	}
	
	

}
