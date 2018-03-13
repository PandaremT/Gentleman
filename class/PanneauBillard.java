import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.File;

public class PanneauBillard extends JPanel {

	private Image imgFond;
	public PanneauBillard() {
		// Faire le chargement une seule fois
		// Le try catch est là pour capturer les erreurs qui pourraient arriver si le 
		// chargement de l'image ne fonctionnait pas.
		try{
			imgFond = ImageIO.read(new File("lul.jpg"));
		} catch(Exception e) {
		}
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		// Ne JAMAIS charger une image depuis paintComponent (trop lent)
		// Dans cet exemple, on vérifie que l'image est en mémoire avant de l'afficher
		if(imgFond!=null) {
			g.drawImage(imgFond,0,0,getWidth(),getHeight(),this);
		}
	}
}
