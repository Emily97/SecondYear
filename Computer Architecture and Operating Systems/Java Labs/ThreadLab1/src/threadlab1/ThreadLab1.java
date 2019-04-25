/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadlab1;


/**
 *
 * @author N00150623
 */
public class ThreadLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread myFirstThread = new MyThread("I am thread one", 5000);
        MyThread mySecondThread = new MyThread("I am thread two", 10000);
        MyThread myThirdThread = new MyThread("I am thread three", 1000);
        
        Thread t1 = new Thread(myFirstThread);
        t1.start();
        
        Thread t2 = new Thread(mySecondThread);
        t2.start();
        
        Thread t3 = new Thread(myThirdThread);
        t3.start();
    }
    
}
