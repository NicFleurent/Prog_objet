package pkClasse;

public class Ville {
	
	protected String nom;
	protected int nbrHabitant;
	public Ville ( )
	{
	nom = "nil";
	nbrHabitant = 0;
	}
	public Ville ( Ville obj )
	{
	nom = obj.getNom ( );
	nbrHabitant = obj.getNbrHab ( );
	}
	public Ville ( String vNom, int vNbrHab )
	{
	nom = vNom;
	nbrHabitant = vNbrHab;
	}
	public void setNom ( String vNom )
	{
	nom = vNom;
	}
	public String getNom ( )
	{
	return nom;
	}
	public void setNbrHab ( int vNbrHab )
	{
	nbrHabitant = vNbrHab;
	}
	public int getNbrHab ( )
	{
	return nbrHabitant;
	}
	public String toString ( )
	{
	return " nom= " + nom + " nombre habitants= " + nbrHabitant + System.getProperty ( "line.separator" );
	}

}
