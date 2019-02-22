/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author pirovano_giacomo
 */
public class Csemafori {
    int valore;

    public Csemafori(int initial) {
        valore = initial;
    }

    synchronized public void Wait() {
        while (valore == 0) {            
            try {
                wait();
            } 
            catch (InterruptedException e) {
            }
        }
        valore--;                          
    } 
    synchronized public void Signal() {
        valore++;                          
        notify();                          
    }
    
    synchronized public void P() {
        while (valore == 0) {            
            try {
                wait();
            } 
            catch (InterruptedException e) {
            }
        }
        valore--;                          
    } 
    synchronized public void V() {
        valore++;                          
        notify();                          
    }
}
