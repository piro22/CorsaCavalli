/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giacomo_pirovano
 *
 * @version 1.0
 */
public class Esercizio2 {

    /**
     * @param args the command line arguments
     *
     *
     */
    public static void main(String[] args) throws InterruptedException {
        //try {
            // TODO code application logic here
            java.io.BufferedReader console =new java.io.BufferedReader (new java.io.InputStreamReader(System.in));
            Scanner input=new Scanner(System.in);
            
            
            Csemafori mutex = new Csemafori(1);
            Csemafori ths1 = new Csemafori(0);
            Csemafori ths2 = new Csemafori(0);
            Csemafori ths3 = new Csemafori(0);
            Csemafori ths4 = new Csemafori(0);
            Csemafori ths5 = new Csemafori(0);
            
            DatiCondivisi dC = new DatiCondivisi(0, 0, 0, 0, 0, mutex, ths1, ths2, ths3, ths4, ths5);
            
            
            int[] classificaPassi = new int[5];
            int[] classifica = new int[5];
            
            
            ThreadClop1 tc1 = new ThreadClop1(dC);
            ThreadClop2 tc2 = new ThreadClop2(dC);
            ThreadClop3 tc3 = new ThreadClop3(dC);
            ThreadClop4 tc4 = new ThreadClop4(dC);
            ThreadClop5 tc5 = new ThreadClop5(dC);
            
            tc1.start();
            tc2.start();
            tc3.start();
            tc4.start();
            tc5.start();
            
            ths1.wait();
            ths2.wait();
            ths3.wait();
            ths4.wait();
            ths5.wait();
            
            int p1 = dC.getNumPassi1();
            int p2 = dC.getNumPassi2();
            int p3 = dC.getNumPass13();
            int p4 = dC.getNumPassi4();
            int p5 = dC.getNumPassi5();
            int[] array1 = new int[5];
            int[] array2 = new int[5];
            
            array1[0] = p1;
            array1[1] = p2;
            array1[2] = p3;
            array1[3] = p4;
            array1[4] = p5;
            
            array2[0] = 1;
            array2[1] = 2;
            array2[2] = 3;
            array2[3] = 4;
            array2[4] = 5;
            
            for(int i = 0; i < 5; i++){
                for(int j = i + 1; j < 5; j++){
                    if(array1[i] > array1[j]){
                        int temp1 = array1[i];
                        array1[i] = array1[j];
                        array1[j] = temp1;
                        
                        int temp2 = array2[i];
                        array2[i] = array2[j];
                        array2[j] = temp2;
                    }
                }
            }
            
            System.out.println("/n" + "ha vinto il cavallo n°" + array2[0]);
            
            //console.readLine();
            
            
            /*tc1.interrupt();
            tc2.interrupt();
            tc3.interrupt();
            tc4.interrupt();
            tc5.interrupt();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Esercizio2.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        

    }
}
