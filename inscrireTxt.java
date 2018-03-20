import java.awt.event.*;
import java.util.*;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;

public class inscrireTxt implements ActionListener{
    private FenetreMenu fen;
    public inscrireTxt() {
        
        
    }

    
    public void actionPerformed(ActionEvent e){
		try{
		File ff=new File("userTxt.txt"); // définir l'arborescence
		ff.createNewFile();
		FileWriter ffw=new FileWriter(ff);
		ffw.write("Username");  // écrire une ligne dans le fichier resultat.txt
		ffw.write("    "); // forcer le passage à la ligne
		ffw.write("Password");
		ffw.write("\n");
		ffw.close(); // fermer le fichier à la fin des traitements
		} catch (Exception j) {}
	}
	
}		
        
        
        
        
	
        
    





