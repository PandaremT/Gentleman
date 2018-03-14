import java.lang.*;
public class Bille {


		int Niter=10000;
		private int CordoneeX;
		private int CordoneeY;
		private double Rayon;
		private double[][] Vitesse= new double [2][Niter];
		private double[][] Acceleration=new double [2][Niter];
		private double[][] Position= new double [2][Niter];
		private double[][] ForceImpact= new double[2][Niter];
		private double Masse;
		private double Delta_t=0.01;
		private double FrottementRoule;

		public Bille(int Yinitial, int Xinitial){
			Yinitial=CordoneeY;
			Xinitial= CordoneeX;
			Rayon= 0.0615;

			Vitesse[1][0]= 0.0;
			Vitesse[2][0]= 0.0;
			Acceleration[1][0]=0.0;
			Acceleration[2][0]=0.0;
			Position[1][0]= Xinitial;
			Position[2][0]= Yinitial;
			ForceImpact[1][0]=0.0;
			ForceImpact[2][0]=0.0;
			Masse= 0.209;
		}

		public double getX(){
			return Position[1][0];
		}

		public double getY(){
			return Position[2][0];
		}


		public void colisionBille(double[] Force){

							for(int i=0; i<Niter ; i++){
									for(int j=1; j<=2 ;j++){
										Acceleration[j][i+1]= ((Force[j])/(Masse));
										Vitesse[j][i+1]= Vitesse[j][i] + Acceleration[j][i+1]*Delta_t;
										Position [j][i+1]= Position[j][i] + Vitesse[j][i+1]*Delta_t;

									}

							}

		}
}
