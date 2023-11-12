package pkClasse;

public class Robot {
	
	private	String	nom;
	private	ClDate	dateDebutTravail;
	private	ClDate	dateFinTravail;
	
	public Robot() {
		nom 				= "RobotCop";
		dateDebutTravail 	= new ClDate();
		dateFinTravail 		= new ClDate();
	}
	
	public Robot(String _nom, ClDate _dateDebutTravail, ClDate _dateFinTravail) {
		nom 				= _nom;
		dateDebutTravail 	= _dateDebutTravail;
		dateFinTravail 		= _dateFinTravail;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ClDate getDateDebutTravail() {
		return dateDebutTravail;
	}

	public void setDateDebutTravail(ClDate dateDebutTravail) {
		this.dateDebutTravail = dateDebutTravail;
	}

	public ClDate getDateFinTravail() {
		return dateFinTravail;
	}

	public void setDateFinTravail(ClDate dateFinTravail) {
		this.dateFinTravail = dateFinTravail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDebutTravail == null) ? 0 : dateDebutTravail.hashCode());
		result = prime * result + ((dateFinTravail == null) ? 0 : dateFinTravail.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}
	
	public boolean equals(Robot obj) {
		return(	nom == obj.getNom()
				&&
				dateDebutTravail == obj.getDateDebutTravail()
				&&
				dateFinTravail == obj.getDateFinTravail());
	}
	
	

	public String toString() {
		return "Robot [nom=" + nom + ", dateDebutTravail=" + dateDebutTravail + ", dateFinTravail=" + dateFinTravail
				+ "]";
	}
	
	public String verifierAgeMontant(Personne unPersonne) {
		if(unPersonne.getAge() >= 18)
		{
			if(unPersonne.getMontantArgent() >= 100)
			{
				unPersonne.setMontantArgent(unPersonne.getMontantArgent()-100);
				return nom + " souhaite la bienvenue à " + unPersonne.getNom() + " vous pouvez entrer et bonne soirée.";
			}
			else
				return nom + " se voit désolé pour " +  unPersonne.getNom() + " vous n'avez pas le montant requis.";
		}
		else
			return nom + " se voit désolé pour " +  unPersonne.getNom() + " vous n'avez pas 18 ans.";
	}
	
	
	
	

}
