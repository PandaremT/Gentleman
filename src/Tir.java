public class Tir {
	
	private int normeV;
	private double[] directionV;
	
	
	//construit un tir aleatoire
	public Tir () {
		
		directionV = new int[2];
		this.randomCreation ();
	}
	
	// construit un tir avec les parametres fournis
	public Tir (int normeV, double[] directionV) {
		
		this.normeV = normeV;
		this.directionV = directionV;
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
