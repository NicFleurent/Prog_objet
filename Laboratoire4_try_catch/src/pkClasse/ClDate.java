/***********************************************************************

Le fichier:			ClDate.java

Projet:				Laboratoire4_try_catch

Objectifs:			Créer une date

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-02-07

***********************************************************************/

package pkClasse;

import java.text.DecimalFormat;

public class ClDate {
	
	private int annee;
	private int mois;
	private int jour;
	
	public ClDate()
	{
		annee = 1997;
		mois = 7;
		jour = 17;
	}
	
	public ClDate(int _annee, int _mois, int _jour) throws ErreurDate
	{
		annee = _annee;
		setMois(_mois);
		setJour(_jour);
	}
	
	public void setAnnee(int _annee)
	{
		annee = _annee;
	}
	
	public int getAnnee()
	{
		return annee;
	}
	
	public void setMois(int _mois) throws ErreurDate
	{
		if(_mois >= 1 && _mois <= 12)
			mois = _mois;
		else
		{
			mois = 1;
			throw new ErreurDate("mois");
		}
	}
	
	public int getMois()
	{
		return mois;
	}
	
	public void setJour(int _jour) throws ErreurDate
	{
		if(validerDateComplete(_jour))
			jour = _jour;
		else
			jour = 1;
	}
	
	public int getJour()
	{
		return jour;
	}
	
	private boolean validerDateComplete(int _jour) throws ErreurDate
	{
		final int ANNEE_BISEX_4 = 4;
		final int ANNEE_BISEX_100 = 100;
		final int ANNEE_BISEX_400 = 400;
		
		switch (mois)
		{
		case 1:	case 3:	case 5:	case 7:	case 8: case 10: case 12:	if(_jour >= 1 && _jour <= 31) { return true; } else { jour = 1; throw new ErreurDate("jour"); }
		
		case 2:	if (annee % ANNEE_BISEX_4 == 0)
					if (annee % ANNEE_BISEX_100 == 0)
						if (annee % ANNEE_BISEX_400 == 0)				
							if(_jour >= 1 && _jour <= 29) { return true; } else { jour = 1; throw new ErreurDate("jour"); }
						else											
							if(_jour >= 1 && _jour <= 28) { return true; } else { jour = 1; throw new ErreurDate("jour"); }
					else												
						if(_jour >= 1 && _jour <= 29) { return true; } else { jour = 1; throw new ErreurDate("jour"); }
				else													
					if(_jour >= 1 && _jour <= 28) { return true; } else { jour = 1; throw new ErreurDate("jour"); }
		
		case 4:	case 6:	case 9:	case 11:	if(_jour >= 1 && _jour <= 30) { return true; } else { jour = 1; throw new ErreurDate("jour"); }
		}
		
		return false;
	}
	
	public String afficherDate()
	{
		DecimalFormat deuxChiffres = new DecimalFormat("00");
		
		return annee + "/" + deuxChiffres.format(mois) + "/" + deuxChiffres.format(jour);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annee;
		result = prime * result + jour;
		result = prime * result + mois;
		return result;
	}

	public boolean equals(ClDate obj) {
		return (this.annee == obj.getAnnee()
				&&
				this.mois == obj.getMois()
				&&
				this.jour == obj.getJour());
	}

	public String toString()
	{
		return "ClDate[annee=" + annee + ", mois=" + mois + ", jour=" + jour + "]";
	}

}
