package personne;

public class Personne {
	
	private      String        nom;
	private     String        prenom;
	private   Adresse   adressePers;

	// constructeur par défaut
	public  Personne (  )
    {
    nom        =  "Doe";
    prenom   =  "John";
    adressePers   =   new Adresse();
    }
	
	
	// constructeur parametré avec le nom ainsi que le prénom
	public  Personne (  String  _nom,  String  _prenom )
    {
    nom        =  _nom;
    prenom   =  _prenom;
    }
	
	
	public  Personne (  String  _nom,  String  _prenom,  Adresse   uneAdr  )
	            {
	            nom        =  _nom;
	            prenom   =  _prenom;
	           adressePers   =   uneAdr;
	            }
	
	public  void  setAdresse ( Adresse adr  )
	           {
	           adressePers   =   adr;
	            }

	public  Adresse  getAdresse  (  )
	             {
	             return  adressePers;
	             }

	public  String  toString (  )
	            {
	            return    " "  +  nom  +  prenom  +  adressePers.toString  (  );
	            }
	}


