package personne;

public class Adresse {

	
		private  String  rue;
		private  String  ville;
		private  String   codePostal;
		
	

		public   Adresse (  )    {
			
			rue         =   "1er";
			ville       =   "Trois-Rivières";
			codePostal  =   "HOH1HO";
			
			
			
		}
		public   Adresse  ( String  _rue,  String  _ville ,  String  _cp )
		   {
		   rue               	=   _rue;
		   ville             	=   _ville;
		   codePostal  			=   _cp;
		   }

		public  String  toString (  )
        {
        return    " "  +  rue  +  ville  +  codePostal;
        }
	
	
}
