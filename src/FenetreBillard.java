import java.awt.*;
import javax.swing.*;

public class FenetreBillard extends JFrame {
	
	private Panel mainPanel;
	
	public FenetreBillard () {
		super ("Gentleman");
		
		this.setSize(new Dimension(1200, 600)); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //procedure normal de fermeture
        
		mainPanel = new Panel ();
		this.setContentPane (mainPanel); //conteneur principal dans la fenetre
		this.setVisible(true);
	}
}
