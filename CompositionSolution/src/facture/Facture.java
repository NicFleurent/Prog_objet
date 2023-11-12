package facture;

public class Facture {

	   private     int       noFact;
	   private     String    nom;
	   private     String    noItem;
	   private     double    prixUnit;
	   private     int       qte;
	   private	   ClDate    date;
	
	   public Facture() {
			noFact = 0;
			nom = "";
			noItem = "";
			prixUnit = 0;
			qte = 0;
			date = new ClDate();
		}  
	      
	   
	   
	public Facture(int _noFact, String _nom, String _noItem, double _prixUnit, int _qte, ClDate _date) {
		noFact = _noFact;
		nom = _nom;
		noItem = _noItem;
		prixUnit = _prixUnit;
		qte = _qte;
		date = _date;
	}
	
	
	public int getNoFact() {
		return noFact;
	}
	public void setNoFact(int _noFact) {
		this.noFact = _noFact;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String _nom) {
		this.nom = _nom;
	}
	public String getNoItem() {
		return noItem;
	}
	public void setNoItem(String _noItem) {
		this.noItem = _noItem;
	}
	public double getPrixUnit() {
		return prixUnit;
	}
	public void setPrixUnit(double _prixUnit) {
		this.prixUnit = _prixUnit;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int _qte) {
		this.qte = _qte;
	}

	public ClDate getDate() {
		return date;
	}

	public void setDate(ClDate date) {
		this.date = date;
	}


	public String toString() {
		return "Facture [noFact=" + noFact + ", nom=" + nom + ", noItem=" + noItem + ", prixUnit=" + prixUnit + ", qte="
				+ qte + ", date=" + date + "]";
	}
	
	
	
	
	}

