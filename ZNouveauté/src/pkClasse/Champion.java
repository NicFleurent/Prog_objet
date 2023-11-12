package pkClasse;

public class Champion {
	
	double ad;
	double ap;
	
	public Champion() {
		ad = 0;
		ap = 0;
	}
	
	public Champion(double _ad, double _ap) {
		ad = _ad;
		ap = _ap;
	}
	
	public double attaque(String type) {
		calculRune();
		calculMasteries();
		if(type == "Magique") {
			return ap;
		}
		else {
			return ad;
		}
	}
	
	
	@Deprecated(since="v2", forRemoval=true)
	public void calculRune() {
		ap *= 1.05;
	}
	
	public void calculMasteries() {
		ap *= 1.1;
	}

}


