/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giacomo
 *
 * @version 1.0
 */
public class ThreadClop1 extends Thread {

    /**
     * @author giacomo_pirovano
     *
     *
     */
    public boolean faiYield = true;
    public boolean faiSleep = false;
    public DatiCondivisi dC;
    Csemafori mutex;
    int i = 0;

    public ThreadClop1(DatiCondivisi dati) {
        dC = dati;
        this.mutex = dC.getMutex();
    }

    public void run() {
        try {
            while (i != 2001) {
                
                mutex.Wait();
                int p = dC.getNumPassi1();
                dC.setNumPassi1(p + 1);
                i++;
                mutex.Signal();
                
                
                
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
                System.out.println("clop1");
                if (faiYield) {
                    Thread.yield();
                }
                if (faiSleep) {

                    Thread.sleep(100);

                }

            }
        } catch (InterruptedException ex) {
        }
    }

}
