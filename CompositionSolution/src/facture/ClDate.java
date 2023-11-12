package facture;

public class ClDate {

	private  int  annee;
	private  int  mois;
	private  int  jour;

	public  ClDate ( )
	{
	annee  =  1900;
	mois    =  1;
	jour    =   1;
	}


	public ClDate ( int  _annee,  int  _mois,  int  _jour )
	{	annee     =  _annee;
		setMois ( _mois );
		setJour  ( _jour );
	}

	public  void  setMois ( int  _mois ) 
	{       if (  _mois  >  0   &&  _mois  <=  12 )
		       mois  =  _mois;
			else
		       mois  =  1;
	}

	public void  setJour ( int  _jour ) 
	{   
	     if  ( validerDateComplete ( _jour )  )
	           jour  =  _jour;
	     else
	           jour  =    1;
	}

	private  boolean validerDateComplete (int _jour)         {
		 //A faire dans le lab 
		return true;
	}    

	
	
	public int getAnnee() {
		return annee;
	}


	public void setAnnee(int _annee) {
		this.annee = _annee;
	}


	public int getMois() {
		return mois;
	}


	public int getJour() {
		return jour;
	}


	public  String  toString (   )  
	{	
	      return  "ClDate [annee="  +  annee  +  " mois="  +  mois  +  " jour="  +  jour + "]";
	}

	
	
}
