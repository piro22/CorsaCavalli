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
public class DatiCondivisi {
    int numPassi1 = 0;
    int numPassi2 = 0;
    int numPass13 = 0;
    int numPassi4 = 0;
    int numPassi5 = 0;
    Csemafori mutex;
    
    public DatiCondivisi(){

    }

    public DatiCondivisi(int numPassi1, int numPassi2, int numPass13, int numPassi4, int numPassi5, Csemafori mutex) {
        this.numPassi1 = numPassi1;
        this.numPassi2 = numPassi2;
        this.numPass13 = numPass13;
        this.numPassi4 = numPassi4;
        this.numPassi5 = numPassi5;
        this.mutex = mutex;
    }

    public int getNumPassi1() {
        return numPassi1;
    }

    public int getNumPassi2() {
        return numPassi2;
    }

    public int getNumPass13() {
        return numPass13;
    }

    public int getNumPassi4() {
        return numPassi4;
    }

    public int getNumPassi5() {
        return numPassi5;
    }

    public void setNumPassi1(int numPassi1) {
        this.numPassi1 = numPassi1;
    }

    public void setNumPassi2(int numPassi2) {
        this.numPassi2 = numPassi2;
    }

    public void setNumPass13(int numPass13) {
        this.numPass13 = numPass13;
    }

    public void setNumPassi4(int numPassi4) {
        this.numPassi4 = numPassi4;
    }

    public void setNumPassi5(int numPassi5) {
        this.numPassi5 = numPassi5;
    }

    public Csemafori getMutex() {
        return mutex;
    }
    
    
    
}
