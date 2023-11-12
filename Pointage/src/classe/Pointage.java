package classe;

public class Pointage {
	
	private String 	nom;
	private int		pointage;
	private int		pointageMax;
	
	public Pointage()
	{
		nom 		= "Non défini";
		pointage 	= 0;
		pointageMax	= 50;
	}
	
	public Pointage(String _nom, int _pointage, int _pointageMax)
	{
		nom = _nom;
		pointageMax = _pointageMax;
		setPointage(_pointage);
	}
	
	public void setNom(String _nom) 
	{
		nom = _nom;
	}
	
	public String getNom() {return nom;}
	
	public void setPointageMax(int _pointageMax) 
	{
		pointageMax = _pointageMax;
	}
	
	public int getPointageMax() {return pointageMax;}

	public void setPointage(int _pointage) 
	{
		if (_pointage > pointageMax)
		{
			pointage = pointageMax;
		}
		else if (_pointage < 0)
		{
			pointage = 0;
		}
		else
		{
			pointage = _pointage;
		}
		
	}
	
	public int getPointage() {return pointage;}
	
	public void ajouterPoint(int _points) 
	{
		setPointage(pointage + _points);
	}
	
	public String toString()
	{
		return ("Le nom est " + nom 
				+ "\nLe pointage est " + pointage 
				+ "\nLe pointage Maximal est " + pointageMax);
	}

}
