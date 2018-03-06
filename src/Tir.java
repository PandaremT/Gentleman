public class Tir {
	
	final private int MODE_RADIAN = 0;
	final private int MODE_DEGREE = 1;
	
	private double [] force;
	
	public Tir () {
		force = new double [2];
		force[0] = 0;
		force[1] = 0;
	}
	
	public Tir (double angle, double norme) {
		force = new double [2];
		force[0] = 0;
		force[1] = 0;
		
		this.setForce(angle, norme);
	}
	
	public void setForce (double[] force){
		this.force=force;
	}
	
	public void setForce (double angle, double norme) {
		force [0] = norme*Math.cos(angle);
		force [1] = norme*Math.sin(angle);
	}
	
	public double[] getForce () {
		return force;
	}
}
