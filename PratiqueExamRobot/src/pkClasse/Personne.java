package pkClasse;

public class Personne {
	
	private	String	nom;
	private	int		age;
	private double	montantArgent;
	
	public Personne() {
		nom = "Nicolas";
		age	= 25;
		montantArgent = 0;
	}
	
	public Personne(String _nom, int _age, double _montantArgent) {
		nom = _nom;
		setAge(_age);
		setMontantArgent(_montantArgent);
	}

	public Personne(Personne unePersonne) {
		nom = unePersonne.getNom();
		age = unePersonne.getAge();
		montantArgent = unePersonne.getMontantArgent();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int _age) {
		if(_age >= 0)
			age = _age;
		else
			age = 0;
	}

	public double getMontantArgent() {
		return montantArgent;
	}

	public void setMontantArgent(double _montantArgent) {
		if(_montantArgent >= 0)
			montantArgent = _montantArgent;
		else
			montantArgent = 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(montantArgent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	public boolean equals(Personne obj) {
		return(	nom == obj.getNom()
				&&
				age == obj.getAge()
				&&
				montantArgent == obj.getMontantArgent());
	}

	public String toString() {
		return "Personne [nom=" + nom + ", age=" + age + ", montantArgent=" + montantArgent + "]";
	}

}
