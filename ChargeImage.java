import javax.swing.*;
import java.awt.*;
import javax.imageio.*;

public class ChargeImage extends JFrame {
	
	public ChargeImage (){
		super("Image affiche toi !");
		
		PanneauFond p = new PanneauFond();

		// Si l'imagine n'existe pas, le JLabel est crée sans image
		ImageIcon imgIcon1 = new ImageIcon( "lul.jpg");
		JLabel j1 = new JLabel("Un Jlabel avec icone",imgIcon1, JLabel.CENTER);
		p.add(j1);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		setSize(800,600);
		setVisible(true);
	}
	
	public static void main(String[] a) {
		new ChargeImage();
	}
}
