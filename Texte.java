import java.util.*;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.file.Files;




public class Texte{


    private List<String> listeLignes;


    public String toString(){
        
        String texteComplet;
        texteComplet = "";
        
        for (String ligne : listeLignes){
            texteComplet = texteComplet + ligne + "\n";
        }
        return texteComplet;
    }

    public String[] decoupe(){
        String texteComplet;
        texteComplet = this.toString();
        
        String[] tableauGroupesLettres;
        
        tableauGroupesLettres = texteComplet.split("[ \n]+");
        if(tableauGroupesLettres[0].equals("")){
            // si le premier mot est le mot vide on le supprime
            for(int i=0; i<tableauGroupesLettres.length-1; i++){
                tableauGroupesLettres[i] = tableauGroupesLettres[i+1];
            }
        }
        
        return tableauGroupesLettres;
    }

    public Texte(String nomFichier){
        try{
            listeLignes = Files.readAllLines(Paths.get(nomFichier), Charset.defaultCharset());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

