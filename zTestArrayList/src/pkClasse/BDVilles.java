package pkClasse;

import java.util.ArrayList;

public class BDVilles {
	
	protected ArrayList listeVilles;
	public BDVilles ( )
	{
	listeVilles = new ArrayList ( );
	}
	public BDVilles ( Ville tabVilles [ ] )
	{
	listeVilles = new ArrayList ( ) ;
	for ( int ctr=0; ctr < tabVilles.length ; ctr++ )
	listeVilles.add ( tabVilles [ ctr ] );
	}
	public ArrayList getListeVilles ( )
	{
	return listeVilles;
	}
	public void setListeVilles ( ArrayList arrayV )
	{ listeVilles = arrayV;
	}
	public void ajouter ( Object obj )
	{
	Ville uneVille = ( Ville ) obj;
	listeVilles.add ( uneVille );
	}
	public void supprimer ( Object obj )
	{
	Ville uneVille = ( Ville ) obj;
	listeVilles.remove ( uneVille );
	}
	public void supprimer ( int position )
	{
	listeVilles.remove ( position );
	}
	public void modifier ( int position, Object obj )
	{
	Ville uneVille = ( Ville ) obj;
	listeVilles.set ( position, uneVille );
	}
	public int indexOf ( Object obj )
	{
	Ville uneVille = ( Ville ) obj;
	return listeVilles.indexOf ( uneVille );
	}
	public Object lire ( Object obj )
	{
	Ville uneVille = ( Ville ) obj;
	return listeVilles.get ( this.indexOf ( uneVille ) );
	}
	public Object lire ( int position )
	{
	return listeVilles.get ( position );
	}
	public int size ( )
	{
	return listeVilles.size ( );
	}
	public String toString ( )
	{
	return listeVilles.toString ( );
	}

}
