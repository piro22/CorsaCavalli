/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giacomo
 *
 * @version 1.0
 */
public class ThreadClop5 extends Thread {

    private boolean faiYield = true;
    private boolean faiSleep = false;
    private DatiCondivisi dC;
    Csemafori mutex;
    int i = 0;
    
    public ThreadClop5(DatiCondivisi dati){
        dC = dati;
        mutex = dC.getMutex();
    }

    public void run() {
        try {
            while(i != 2001) {
                
                mutex.Wait();
                int p = dC.getNumPassi5();
                dC.setNumPassi5(p + 1);
                i++;
                mutex.Signal();
                
                if(p == 49){
                    this.interrupt();
                }
                
                if(Thread.currentThread().isInterrupted()){
                    return;
                }
                System.out.println("clop5");
                if (faiYield) {
                    Thread.yield();
                }
                if (faiSleep) {

                    Thread.sleep(100);

                }
                
            }
        } catch (InterruptedException ex) {}
    }

}
