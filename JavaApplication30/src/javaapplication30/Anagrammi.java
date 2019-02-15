package javaapplication30;
import java.util.*;
import java.io.*;

public class Anagrammi {

    
    public static void main(String[] args) throws IOException{
        java.io.BufferedReader console=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        System.out.print("Inserire parola da cercare: ");
        String parola = console.readLine();
        
        File leggi=new File("dizionarioItaliano.txt");
        cDizionario dizionario = new cDizionario(leggi, parola);
        dizionario.stampaAnagrammi();
    }
    
}
