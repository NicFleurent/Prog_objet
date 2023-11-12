package pkClasse;

public interface test {


		public interface Summoners {						public interface ErreurAttaque {
			public int AD(int baseAD, int bonusAD);				public String logErreur();
		}													}
		
		public interface Graphique {						public interface Lore {
			public int definirNbrPanel(int i);					static final int PAYS_RUNETERRA = 12;
			public String changerNomFrame(String nom);			public String ajouterLoreChampion(String ajout);
		}													}



}
