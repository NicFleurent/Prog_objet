package etudiant;

public class Adresse {
	
	
	private  String  rue;
	private  String  ville;
	private  String  province;
	private  String   codePostal;
	


	public   Adresse (  )    {
		
		rue         =   "1er";
		ville       =   "Trois-Rivières";
		codePostal  =   "HOH1HO";
		province    =   "Quebec";
		
		
	}
	public   Adresse  ( String  _rue,  String  _ville , String _province, String  _cp )
	   {
	   rue               	=   _rue;
	   ville             	=   _ville;
	   codePostal  			=   _cp;
	   province				=	_province;
	   }

	public  String  toString (  )
    {
    return    " "  +  rue + ", "  +  ville+ ", " + province+ ", " +  codePostal ;
    }
}
