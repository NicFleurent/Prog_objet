
public class Compte {
	protected  String  noCompte;
	protected  double  solde;


	public Compte ( )
	{
		noCompte = "nil";
		solde = 0;
	}
	
	public Compte ( String noC, double montant )
	{     
		noCompte  =  noC;
		solde     =  montant;
	}	
	
    public Compte ( Compte unCompte)
		{
			noCompte = unCompte.getNoCompte();
			solde    = unCompte.getSolde();
		}


	public void setNoCompte(String noCompte) {
		this.noCompte = noCompte;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getNoCompte (  )
	{         
		return   noCompte;
	}

	public  double  getSolde( )
	{
		return  solde;
	}
	
	
        public String toString ( )
        {
     		return "noCompte= " + noCompte + " solde= " + solde;
        }

}
