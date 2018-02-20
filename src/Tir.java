public class Tir {
	
	private int normeV;
	private double[] directionV;
	
	private int score;
	private int numero;
	
	private static int numeroActuel;
	
	
	// construit un tir aleatoire
	public Tir () {
		
		numeroActuel += numeroActuel;
		numero = numeroActuel;
		
		directionV = new int[2];
		this.randomCreation ();
	}
	
	
	// construit un tir avec les parametres fournis
	public Tir (int generation, int normeV, double[] directionV) {
		
		numeroActuel += numeroActuel;
		numero = numeroActuel;
		
		this.normeV = normeV;
		this.directionV = directionV;
	}
	
	
	// "reproduis" le tir courant avec le tir en paramètre pour donner un troisieme tir median-aleatoire
	public Tir reproduce (Tir t2) {
		
		Tir Tf;
		// tF doit avoir des caracteristique mediane-aléatoire de celle de ses parents
		return tF
	}
	
	
	// attributs un score en fonction des resultats du tir
	public void noter () {
		
	}
	
	
	// donne des caracteristique aleatoire au tir courant
	private void randomCreation () {
		
		normeV = (int) 100*Math.random();
		
		double directionX = Math.random();
		double directionY = Math.sqrt((1-(directionX*directionX)));
		if (Math.random()<0.5) {directionY = -directionY}
		
		directionV = {directionX , directionY};
	}
}
