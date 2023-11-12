package pkClasses;

public class JeuVideo {
	
	private String 	nom;
	private String 	style;
	private	int		anneeParrution;
	
	public JeuVideo() {
		this.nom = " ";
		this.style = " ";
		this.anneeParrution = 0;
	}
	
	public JeuVideo(String nom, String style, int anneeParrution) {
		this.nom = nom;
		this.style = style;
		this.anneeParrution = anneeParrution;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getStyle() {
		return style;
	}


	public void setStyle(String _style) {
		if(_style == "fps" || _style == "aventure" || _style == "action" || _style == "stratégie" || _style == "moba" || _style == "indéfini")
		{
			style = _style;
		}
		else 
		{
			style = "indéfini";
		}
		
	}

	public int getanneeParrution() {
		return anneeParrution;
	}


	public void setanneeParrution(int anneeParrution) {
		this.anneeParrution = anneeParrution;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + anneeParrution;
		result = prime * result + ((style == null) ? 0 : style.hashCode());
		return result;
	}

	public boolean equals(JeuVideo obj) {
		return(	nom == obj.getNom()
				&&
				style == obj.getStyle()
				&&
				anneeParrution == obj.getanneeParrution());
	}

	public String toString() {
		return "JeuVideo [nom=" + nom + ", style=" + style + ", anneeParrution=" + anneeParrution + "]";
	}
	
}
