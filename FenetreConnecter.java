import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedList;

public class FenetreConnecter extends JFrame {
	
	private JLabel n;
	private JLabel m;
	private JButton co;
	public JTextField en;
	public JTextField em;
	private JPanel tou;
	private JLabel ima;
	
	
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
		ImageIcon Im = new ImageIcon( "vite.jpg");
		ima = new JLabel("CONNECTE TOI  !!!",Im,JLabel.CENTER);
		co.addActionListener(new connecterTxt());

			
		
		
		tou.add(n);
		tou.add(en);
		tou.add(m);
		tou.add(em);
		tou.add(ima);
		tou.add(co);
		
		//co.addActionListener(new NouveauJoueur(this));
	
		
		
		
		this.setContentPane(tou);

        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		}
        
}

