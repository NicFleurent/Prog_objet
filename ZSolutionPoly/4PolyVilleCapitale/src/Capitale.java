
public class Capitale extends Ville {

protected String pays;
	
	
	public Capitale( )
	{
		super ( );
		pays = "nul";
	}
	
	public Capitale ( Ville objVille, String vPays)
	{
		super (objVille);
		pays  =  vPays;
	}

	public Capitale ( String vNom, int vNbrHab, String vPays)
	{
		super ( vNom, vNbrHab);
		pays = vPays;
	}


	public void  setPays( String  vPays)
	{    
	pays  =  vPays;  
	}


	public String  getPays( )
	{   
	return pays; 
	}


      public String toString()
	{
		return super.toString() + " pays= " + pays;
	}	
	
	
}
