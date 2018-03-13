import java.awt.*;
import javax.swing.*;

public class FenetreMenu extends JFrame {
	
	private JPanel mainPanel;
	private PanneauBillard p;
	private JLabel salut;
	private JLabel explications;
	private JPanel gauche;
	private JPanel carte;
	private JButton co;
	private JButton inscr;
	private JPanel boutons;
	private JTextArea pseudo;
	private JTextArea mdp;
	
	
	
	public FenetreMenu () {
		super ("Menu");
		
		// FORMALITES
		this.setSize(new Dimension(1200, 600)); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //procedure normal de fermeture
        //
        
        
        // HABILLAGE FENETRE
        ImageIcon ffbIm = new ImageIcon( "ffb.png");
        
        p = new PanneauBillard();
        salut = new JLabel("BIENVENUE DANS LA MEILLEURE SIMULATION DE BILLARD DE VOTRE VIE",ffbIm,JLabel.CENTER);
        explications = new JLabel("Connecte toi vite pour jouer à ce super jeu !!!!");
		gauche = new JPanel();
		carte = new JPanel(new BorderLayout());
		mainPanel = new JPanel(new FlowLayout());
		co = new JButton("Se connecter");
		inscr = new JButton("Pas de compte ? S'inscrire");
		boutons= new JPanel();
		pseudo = new JTextArea("Identifiant");
		mdp = new JTextArea("Mot de passe");
		
		co.addActionListener(new connecter(this));
		inscr.addActionListener(new inscrire(this));
		boutons.add(co);
		boutons.add(inscr);
		carte.add(boutons, BorderLayout.SOUTH);
		carte.add(salut,BorderLayout.NORTH);
		gauche.add(explications);
		carte.add(gauche, BorderLayout.WEST);
		mainPanel.add(carte);
		p.add(mainPanel);
		mainPanel.setBackground(Color.RED);
		carte.setBackground(Color.GREEN);
		boutons.setBackground(Color.BLUE);
		gauche.setBackground(Color.PINK);
		
		//
		this.setContentPane (p); //conteneur principal dans la fenetre
		this.setVisible(true);
		Audio son = new Audio();
		son.start();
	}
	
	
		
	
	
	public static void main(String[] a) {
		new FenetreMenu();
	}
}

