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
public class MyThread implements Runnable {

    //
    private String print;
    private int time;

    public MyThread(String p, int t) {
        this.time = t;
        this.print = p;
    }

    public MyThread() {
       
    }

    public void run() {
        
        for (;;) { //infinite loop
            try {
                //Thread.sleep(5000); //sleeps for 5 seconds between each display
                Thread.sleep(time);
            } catch (InterruptedException e) {
                return;
            }
            //System.out.println("Thread1");
            System.out.println(print); //prints out my name continuously

        }

    }
}
