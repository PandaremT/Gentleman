import java.awt.*; //layouts, color, ActionEvent e, ...
import javax.swing.*; //widgets (JButton, JPanel, ...)

public class FenetreBillard extends JFrame {
	
	private Panel mainPanel;
	
	public FenetreBillard () {
		super ("fenetre de dessin");
		
		this.setSize(new Dimension(1200, 600)); //fenetre avec les dimension fourni par l'utilisateur
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //procedure normal de fermeture
        
        /*
        blablabla 
        */
		mainPanel = new Panel ();
		this.setContentPane (mainPanel); //conteneur principal dans la fenetre
		this.setVisible(true);
	}
}

/*
JButton
JFrame
JLabel
JPanel
JTextField
JTextArea
*/
