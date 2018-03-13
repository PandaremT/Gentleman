import java.awt.*;
import javax.swing.*;

public class FenetreBillard extends JFrame {
	
	private TableBillard table;
	
	public FenetreBillard () {
		super ("Billard");
		
		this.setSize(new Dimension(1250, 650)); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //procedure normal de fermeture
        this.setResizable (false);
        
		table = new TableBillard ();
		
		this.setContentPane (table); //conteneur principal dans la fenetre
		this.setVisible(true);
		
	}
}
