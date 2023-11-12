package facture;

public class TestFacture {

	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement

		ClDate uneDate = new ClDate();
		uneDate.setAnnee(2022);
		uneDate.setMois(02);
		uneDate.setJour(07);
		
		Facture uneFacture = new Facture();
		uneFacture.setDate(uneDate);
		
		ClDate deuxDate = new ClDate();
		uneDate.setAnnee(2010);
		uneDate.setMois(01);
		uneDate.setJour(01);
		
		Facture deuxFacture = new Facture(1, "première", "0101f", 2, 50, deuxDate);
		System.out.println(deuxFacture);
		
		System.out.println(deuxFacture.getDate());
		System.out.println(deuxFacture.getDate().getAnnee());
		deuxFacture.getDate().setJour(28);
		deuxFacture.getDate().setAnnee(2000);
		System.out.println(deuxFacture.getDate().getJour());
	}

}
