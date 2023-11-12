package pkClasse;

import java.text.NumberFormat;

public class Billetterie {
	
	final	static	private	double	BILLET_STANDARD 	= 40;
	final	static	private	double	BILLET_SCENE 	= 70;
	final	static	private	double	BILLET_BALCON 	= 50;
	
			static	private	double	montantTotalVendu	= 0;
			static	private	int		nbrTotalBilletVendu	= 0;
			
					private	double	prixBillet;
					private	double	montantPaye;

	public Billetterie() {
		prixBillet = BILLET_STANDARD;
		montantPaye = 0;
	}

	public Billetterie(int nbr) {
		if(nbr == 1)
			prixBillet = BILLET_SCENE;
		else if(nbr == 2)
			prixBillet = BILLET_BALCON;
		else
			prixBillet = BILLET_STANDARD;
		
		montantPaye = 0;
	}

	public double getPrixBillet() {
		return prixBillet;
	}

	public double getMontantPaye() {
		return montantPaye;
	}
	
	public static double getMontantTotalVendu() {
		return montantTotalVendu;
	}

	public static double getNbrTotalBilletVendu() {
		return nbrTotalBilletVendu;
	}

	public static double getBILLET_STANDARD() {
		return BILLET_STANDARD;
	}

	public static double getBILLET_SCENE() {
		return BILLET_SCENE;
	}

	public static double getBILLET_BALCON() {
		return BILLET_BALCON;
	}

	public double calculerRestantPayable() {
		return(prixBillet - montantPaye);
	}
	
	public void payerBillet(double montant) {
		if(montantPaye + montant < prixBillet)
			montantPaye += montant;
		else
		{
			montantPaye 		= prixBillet;
			montantTotalVendu 	+= prixBillet;
			nbrTotalBilletVendu++;
		}
		
	}
	
	private String afficherBillet() {
		if(calculerRestantPayable() == 0)
			return "Voici votre billet officiel pour l'évènement.";
		else
			return "Désolé l’impression du billet est impossible, il vous reste encore à payer: " + calculerRestantPayable();
	}
	
	public String afficherBlocInfo() {
		String affichage = "";
		NumberFormat deuxChiffres = NumberFormat.getCurrencyInstance();
		
		affichage += "Le prix de votre billet est de: " + deuxChiffres.format(getPrixBillet());
		affichage += "\nLa somme amassée pour votre billet est de: " + deuxChiffres.format(getMontantPaye());
		affichage += "\nLe reste du montant à payer est de: " + deuxChiffres.format(calculerRestantPayable());
		affichage += "\nLe reste du montant à payer est de: " + afficherBillet();
		affichage += "\nLe nombre total de billets vendu est de: " + getNbrTotalBilletVendu();
		affichage += "\nLe montant total amassé de la machine est de: " + deuxChiffres.format(getMontantTotalVendu());
		
		return affichage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(montantPaye);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prixBillet);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Billetterie obj) {
		return(	prixBillet == obj.getPrixBillet()
				&&
				montantPaye == obj.getMontantPaye());
	}

	public String toString() {
		return "Billetterie [prixBillet=" + prixBillet + ", montantPaye=" + montantPaye + 
				", montantTotalVendu=" + montantTotalVendu + ", nbrTotalBilletVendu=" + nbrTotalBilletVendu +
				", BILLET_STANDARD=" + BILLET_STANDARD + ", BILLET_SCENE=" + BILLET_SCENE +
				", BILLET_BALCON=" + BILLET_BALCON + "]";
	}
}
