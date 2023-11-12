/***********************************************************************

Le fichier:			Facture.java

Projet:				Laboratoire4_try_catch

Objectifs:			Créer une facture

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-02-09

***********************************************************************/

package pkClasse;

public class Facture {
	
	static	private	double	tps 			= 5;
	static	private	double	tvq				= 9.75;
	static	private int		nbrTotalFacture = 999;

			private	int		numFacture;
			private	String	nomClient;
			private String	nomItem;
			private	double	prixItem;
			private	int		qteItem;
			private ClDate	dateFacture;
	
	public Facture() {
		numFacture = ++nbrTotalFacture;
		nomClient = "Nicolas";
		nomItem = "Chaussette";
		prixItem = 9.99;
		qteItem = 1;
		dateFacture = new ClDate();
	}
	
	public Facture(String nomClient, String nomItem, double prixItem, int qteItem, ClDate dateFacture) throws ErreurOperation {
		numFacture = ++nbrTotalFacture;
		this.nomClient = nomClient;
		this.nomItem = nomItem;
		setPrixItem(prixItem);
		setQteItem(qteItem);
		this.dateFacture = dateFacture;
	}

	public int getNumFacture() {
		return numFacture;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getNomItem() {
		return nomItem;
	}

	public void setNomItem(String nomItem) {
		this.nomItem = nomItem;
	}

	public double getPrixItem() {
		return prixItem;
	}

	public void setPrixItem(double _prixItem) throws ErreurOperation {
		if(_prixItem >= 0)
			this.prixItem = _prixItem;
		else
		{
			this.prixItem = 0;
			throw new ErreurOperation("negatif");
		}
	}

	public int getQteItem() {
		return qteItem;
	}

	public void setQteItem(int _qteItem) throws ErreurOperation {
		if(_qteItem >= 0)
			this.qteItem = _qteItem;
		else
		{
			this.qteItem = 0;
			throw new ErreurOperation("negatif");
		}
	}

	public ClDate getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(ClDate dateFacture) {
		this.dateFacture = dateFacture;
	}

	public static double getTps() {
		return tps;
	}

	public static void setTps(double _tps) throws ErreurOperation {
		if(_tps >= 0)
			Facture.tps = _tps;
		else
		{
			Facture.tps = 0;
			throw new ErreurOperation("negatif");
		}
	}

	public static double getTvq() {
		return tvq;
	}

	public static void setTvq(double _tvq) throws ErreurOperation {
		if(_tvq >= 0)
			Facture.tvq = _tvq;
		else
		{
			Facture.tvq = 0;
			throw new ErreurOperation("negatif");
		}
	}

	public static int getNbrTotalFacture() {
		return nbrTotalFacture;
	}
			
	public double calculerTps() {
		double montantTps;
		
		montantTps = prixItem * qteItem * (tps/100);
		
		return montantTps;
	}
	
	public double calculerTvq() {
		double montantTvq;
		
		montantTvq = prixItem * qteItem * (tvq/100);
		
		return montantTvq;
	}
	
	public double calculerTaxe() {
		double montantTaxe;
		
		montantTaxe = calculerTps() + calculerTvq();
		
		return montantTaxe;
	}
	
	public double calculerSousTotal() {
		double sousTotal;
		
		sousTotal = prixItem * qteItem;
		
		return sousTotal;
	}
	
	public double calculerTotal() {
		double montantTotal;
		
		montantTotal = calculerSousTotal() + calculerTps() + calculerTvq();
		
		return montantTotal;
	}

	public boolean equals(Facture obj) {
		return (numFacture == obj.getNumFacture()
				&&
				nomClient.equals(obj.getNomClient()) 
				&&
				nomItem.equals(obj.getNomItem())
				&&
				prixItem == obj.getPrixItem()
				&&
				qteItem == obj.getQteItem()
				&&
				dateFacture.equals(obj.getDateFacture()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateFacture == null) ? 0 : dateFacture.hashCode());
		result = prime * result + ((nomClient == null) ? 0 : nomClient.hashCode());
		result = prime * result + ((nomItem == null) ? 0 : nomItem.hashCode());
		result = prime * result + numFacture;
		long temp;
		temp = Double.doubleToLongBits(prixItem);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + qteItem;
		return result;
	}

	public String toString() {
		return "Facture [numFacture=" + numFacture + ", nomClient=" + nomClient + ", nomItem=" + nomItem + ", prixItem="
				+ prixItem + ", qteItem=" + qteItem + ", dateFacture=" + dateFacture + "]";
	}
	
	
	
}
