
public class CompteEpargne  extends Compte{	
	protected  double   taux;
	protected  int      annee;


	public CompteEpargne ( )
	{
		taux = 0;   annee = 0;
	}

	public  CompteEpargne ( String no, double montant, double vTaux, int  
                              vAnnee)
	{          
		super  (no, montant);
		taux   =  vTaux; 
		annee  =  vAnnee;  
	}

	public CompteEpargne ( Compte unCompte, double vTaux, int vAn )
	{
		super(unCompte);
		taux  = vTaux;
		annee = vAn;
	}


	public  void setAnnee ( int an )
	{     
		if ( an >= 0)
			annee = an;
	}

	public int getAnnee (  )
	{   
		return  annee;
	}

	
	public double getTaux(  )
	{ 
		return taux;
	}
	
	
	public double getSolde(  )
	{
	 	double  solde  =  super.getSolde ( );
 
  	 	for ( int ctr = 0; ctr <  annee ; ctr++ )
	       	solde  *= 1 +  taux;
	 	
return solde;
	}


	public String toString ( )
	{
		return super.toString() + " taux= " + taux + " annee= " + annee;
	}

}
