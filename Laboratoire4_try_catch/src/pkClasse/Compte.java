/***********************************************************************

Le fichier:			Compte.java

Projet:				Laboratoire4_try_catch

Objectifs:			Créer un compte

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-02-07

***********************************************************************/

package pkClasse;

public class Compte {
	
	private	static	double	tauxInteretAnuel;
	private	static	double	fraisMensuels;
	private	static	int		nbrTotalCompte = 0;
	
	private			double	solde;
	private			int		numCompte;
	private			String	nomProprio;
	private			ClDate	dateOuverture;
	
	public Compte() 
	{
		solde = 0;
		numCompte = ++nbrTotalCompte;
		nomProprio = "non défini";
		dateOuverture = new ClDate();
	}
	
	public Compte(double solde, String nomProprio, ClDate dateOuverture) 
	{
		this.solde = solde;
		this.numCompte = ++nbrTotalCompte;
		this.nomProprio = nomProprio;
		this.dateOuverture = dateOuverture;
	}

	public static double getInteretAnuel() {
		return tauxInteretAnuel;
	}

	public static void setInteretAnuel(double interetAnuel) {
		Compte.tauxInteretAnuel = interetAnuel;
	}

	public static double getFraisMensuels() {
		return fraisMensuels;
	}

	public static void setFraisMensuels(double fraisMensuels) {
		Compte.fraisMensuels = fraisMensuels;
	}

	public double getSolde() {
		return solde;
	}

	public int getNumCompte() {
		return numCompte;
	}

	public String getNomProprio() {
		return nomProprio;
	}

	public void setNomProprio(String nomProprio) {
		this.nomProprio = nomProprio;
	}

	public ClDate getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(ClDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	public void retrait(double retrait) throws ErreurOperation
	{
		if(retrait >= 0)
		{
			if(retrait <= solde)
			{
				solde -= retrait;
			}
			else
				throw new ErreurOperation("montantRetraitInf");
		}
		else
			throw new ErreurOperation("negatif");
	}
	
	public void depot(double depot) throws ErreurOperation
	{
		if(depot >= 0)
		{
			solde += depot;
		}
		else
			throw new ErreurOperation("negatif");
	}
	
	public double interet()
	{
		double interet;
		
		interet	= solde * ((tauxInteretAnuel / 12) / 100);
		solde 	+= interet;
		
		return interet;
	}
	
	public double frais()
	{
		solde -= fraisMensuels;
		
		return fraisMensuels;
	}
	
	public boolean equals(Compte obj)
	{
		return (solde == obj.getSolde()
				&&
				numCompte == obj.getNumCompte()
				&&
				nomProprio.equals(obj.getNomProprio())
				&&
				dateOuverture.equals(obj.getDateOuverture()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOuverture == null) ? 0 : dateOuverture.hashCode());
		result = prime * result + ((nomProprio == null) ? 0 : nomProprio.hashCode());
		result = prime * result + numCompte;
		long temp;
		temp = Double.doubleToLongBits(solde);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public String toString() {
		return "Compte [solde=" + solde + ", numCompte=" + numCompte + ", nomProprio=" + nomProprio + ", dateOuverture="
				+ dateOuverture + "]";
	}
	
}
