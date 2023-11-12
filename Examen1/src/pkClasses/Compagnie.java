package pkClasses;

public class Compagnie {
	
	final	static	public	String		MEILLEUR_PLATEFORME_GAMING = "PC";
			static	private	int			nombreCompagnie = 0;
	
					private	String		nom;
					private	int			anneeFondation;
					private	JeuVideo	jeuVideo;
					private	int			nombreEmploye;

	public Compagnie() {
		this.nom = " ";
		this.anneeFondation = 0;
		this.jeuVideo = new JeuVideo();
		this.nombreEmploye = 1;
		nombreCompagnie++;
	}
					
	public Compagnie(String nom, int anneeFondation, JeuVideo jeuVideo, int _nombreEmploye) {
		this.nom = nom;
		this.anneeFondation = anneeFondation;
		this.jeuVideo = jeuVideo;
		setNombreEmploye(_nombreEmploye);
		nombreCompagnie++;
	}

	public static String getMeilleurPlateformeGaming() {
		return MEILLEUR_PLATEFORME_GAMING;
	}

	public static int getNombreCompagnie() {
		return nombreCompagnie;
	}

	public static void setNombreCompagnie(int nombreCompagnie) {
		Compagnie.nombreCompagnie = nombreCompagnie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnneeFondation() {
		return anneeFondation;
	}

	public void setAnneeFondation(int anneeFondation) {
		this.anneeFondation = anneeFondation;
	}

	public JeuVideo getJeuVideo() {
		return jeuVideo;
	}

	public void setJeuVideo(JeuVideo jeuVideo) {
		this.jeuVideo = jeuVideo;
	}

	public int getNombreEmploye() {
		return nombreEmploye;
	}

	public void setNombreEmploye(int _nombreEmploye) {
		if(_nombreEmploye <= 1)
		{
			nombreEmploye = 1;
		}
		else
		{
			nombreEmploye = _nombreEmploye;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anneeFondation;
		result = prime * result + ((jeuVideo == null) ? 0 : jeuVideo.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + nombreEmploye;
		return result;
	}

	public boolean equals(Compagnie obj) {
		return(	nom == obj.getNom()
				&&
				anneeFondation == obj.getAnneeFondation()
				&&
				jeuVideo.equals(obj.getJeuVideo())
				&&
				nombreEmploye == obj.getNombreEmploye());
	}

	public String toString() {
		return "Compagnie [nom=" + nom + ", anneeFondation=" + anneeFondation + ", jeuVideo=" + jeuVideo
				+ ", nombreEmploye=" + nombreEmploye + "]";
	}
					
	public void ajouterEmploye() {
		nombreEmploye++;
	}
	
	public void enleverEmploye() {
		if(nombreEmploye > 1)
			nombreEmploye--;
	}

}
