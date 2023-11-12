/***********************************************************************

Le fichier:			Temps.java

Projet:				Laboratoire2

Objectifs:			Créer un temps

Logiciel: 			Éclipse 4.16.0

Plateforme:			Windows

Auteur:				Nicolas Fleurent

Date de création:	2023-02-03

***********************************************************************/

package pkClasse;

import java.text.DecimalFormat;

public class Temps {
	
	private int heure;
	private int minute;
	private int seconde;
	
	public Temps()
	{
		setTemps(0, 0, 0);
	}
	
	public Temps(int _heure)
	{
		setTemps(_heure, 0, 0);
	}
	
	public Temps(int _heure, int _minute)
	{
		setTemps(_heure, _minute, 0);
	}
	
	public Temps(int _heure, int _minute, int _seconde)
	{
		setTemps(_heure, _minute, _seconde);
	}
	
	public void setTemps(int _heure, int _minute, int _seconde)
	{
		setHeure(_heure);
		setMinute(_minute);
		setSeconde(_seconde);
	}
	
	public void setHeure(int _heure)
	{
		heure = ( (_heure >= 0 && _heure < 24) ? _heure : 0);
	}
	
	public int getHeure()
	{
		return heure;
	}
	
	public void setMinute(int _minute)
	{
		minute = ( (_minute >= 0 && _minute < 60) ? _minute : 0);
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public void setSeconde(int _seconde)
	{
		seconde = ( (_seconde >= 0 && _seconde < 60) ? _seconde : 0);
	}
	
	public int getSeconde()
	{
		return seconde;
	}
	
	public String afficherUniverselle()
	{
		DecimalFormat deuxChiffres = new DecimalFormat("00");
		
		return 	deuxChiffres.format(heure) + ":" +
				deuxChiffres.format(minute) + ":" + 
				deuxChiffres.format(seconde);
	}
	
	public String afficherAmericain()
	{
		DecimalFormat chiffresHeure = new DecimalFormat("#0");
		DecimalFormat deuxChiffres = new DecimalFormat("00");
		
		final int DIFF_AM_PM = 12;
		int heureDiff;
		
		if(heure > DIFF_AM_PM)
		{
			heureDiff = heure - DIFF_AM_PM;
			
			return 	chiffresHeure.format(heureDiff) + ":" +
					deuxChiffres.format(minute) + ":" + 
					deuxChiffres.format(seconde) + " PM";
		}
		else if(heure == DIFF_AM_PM)
		{
			return 	chiffresHeure.format(heure) + ":" +
					deuxChiffres.format(minute) + ":" + 
					deuxChiffres.format(seconde) + " PM";
		}
		else if(heure == 0)
		{
			heureDiff = heure + DIFF_AM_PM;
			
			return 	chiffresHeure.format(heureDiff) + ":" +
					deuxChiffres.format(minute) + ":" + 
					deuxChiffres.format(seconde) + " AM";
		}
		else
		{
			return 	chiffresHeure.format(heure) + ":" +
					deuxChiffres.format(minute) + ":" + 
					deuxChiffres.format(seconde) + " AM";
		}
		
		
	}
	
	public String toString()
	{
		return 	"Heures : " + heure +
				"\nMinutes : " + minute + 
				"\nSecondes : " + seconde;
	}

}
