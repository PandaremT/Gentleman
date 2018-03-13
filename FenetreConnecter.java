import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedList;

public class FenetreConnecter extends JFrame {
	
	JLabel n;
	JLabel m;
	JButton co;
	JTextField en;
	JTextField em;
	JPanel tou;
	
	
	public  FenetreConnecter(){
		super("Se connecter");
		
		tou = new JPanel(new FlowLayout());
		co = new JButton("Se connecter");
		n = new JLabel("Pseudo du winner (contient entre 4 et 8 lettres ou chiffres)",10);
		en = new JTextField("MauriceLeKing",15);
		em = new JTextField("azerty1",15);
		m = new JLabel("Mot de passe du winner (contient entre 4 et 8 lettre ou chiffres)", 10);
		co.setBackground(Color.RED);
		co.setOpaque(true);
		tou.setBackground(Color.MAGENTA);

			
		
		
		tou.add(n);
		tou.add(en);
		tou.add(m);
		tou.add(em);
		tou.add(co);
		
		//co.addActionListener(new NouveauJoueur(this));
	
		
		
		
		this.setContentPane(tou);

        this.setSize(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		}
        
}

