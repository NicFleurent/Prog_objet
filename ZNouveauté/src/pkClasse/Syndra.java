package pkClasse;

public class Syndra extends Champion {
	
	public Syndra() {
		super();
	}
	
	public Syndra(double _ad, double _ap) {
		super(_ad, _ap);
	}

	
	@SuppressWarnings("removal")
	@Override
	public double attaque(String type) {
		calculRune();
		calculMasteries();
		
		if(type == "Magique") {
			return ap * 2;
		}
		else {
			return ad / 2;
		}
	}
	
	

}
