package javaapplication30;
import java.io.*;
import java.util.*;

public class cDizionario {
    private File filedaleggere;
    private String parola;
    
    public cDizionario(File filedaleggere, String parola) {
        this.filedaleggere = filedaleggere;
        this.parola = parola;
    }

    public void stampaAnagrammi() {
        if(filedaleggere.isFile()) {
            try {
                BufferedReader input = new BufferedReader(new FileReader(filedaleggere));
                
                String testo;
                while((testo=input.readLine())!=null) {
                    if(ReturnAnagramma(testo))
                        System.out.println(testo);
                }
                input.close();
                
                
                
                
            }
            catch (IOException ioException) {
                System.out.println(ioException);
            }
        }   
    }
    
    private boolean ReturnAnagramma(String daDizionario) {
        boolean Anagramma = false;
        //CONTROLLO LUNGHEZZA
        if(parola.length() == daDizionario.length()) {
            //INIZIO ORDINAMENTO CHAR
            char[] arrayChar = parola.toCharArray();
            char[] arrayChar2 = daDizionario.toCharArray();

            Arrays.sort(arrayChar);
            Arrays.sort(arrayChar2);

            //confronto i due
            Anagramma = true;
            
            int i = 0;
            while ((Anagramma == true) && (i < arrayChar.length)) {
                
                if (arrayChar[i] != arrayChar2[i]) {
                    Anagramma = false;
                }
                i++;
                
            }
        }
        return Anagramma;
    }
}





