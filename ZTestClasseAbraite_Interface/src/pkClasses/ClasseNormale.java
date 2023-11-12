package pkClasses;

public class ClasseNormale extends ClasseAbstraite implements Interface {
	
	public ClasseNormale(){
		degat = 99;
	}
	
	public ClasseNormale(int _degat){
		degat = _degat;
	}
	
	public int attaque() {
		return degat + degat * 2;
	}
	
	public double attaqueRunique() {
		return attaque() * RUNE;
	}

}
