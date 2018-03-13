import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedList;

public class FenetreInscrire extends JFrame {
	
	JLabel n;
	JLabel m;
	JButton co;
	JTextField en;
	JTextField em;
	JPanel tou;
	JLabel annee;
	JTextField age;
	
	
	public  FenetreInscrire(){
		super("S'inscrire");
		
		tou = new JPanel(new FlowLayout());
		co = new JButton("S'inscrire");
		n = new JLabel("Pseudo du futur winner (contient entre 4 et 16 lettres ou chiffres)",10);
		en = new JTextField("gemlaiboul41",10);
		em = new JTextField("mdp357",10);
		m = new JLabel("Mot de passe du futur winner (contient entre 4 et 16 lettres ou chiffres)", 10);
		annee = new JLabel("Quel âge as-tu ? N'oublies pas que c'est un jeu pour adulte !",10);
		age = new JTextField("13anaitoutemaidan",10);
		co.setBackground(Color.GREEN);
		co.setOpaque(true);
		tou.setBackground(Color.RED);

			
		
		
		tou.add(n);
		tou.add(en);
		tou.add(m);
		tou.add(em);
		tou.add(annee);
		tou.add(age);
		tou.add(co);
		
		//co.addActionListener(new NouveauJoueur(this));
	
		
		
		
		this.setContentPane(tou);

        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		}
        
}



