/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author n00147025
 */

public class SchedulingDisplay implements Runnable{
    private String name;
    private static Object screen = new Object();

    SchedulingDisplay(String n) {
        this.name = n;
    }
    
    public void run(){
    
    Thread t = Thread.currentThread();
    
    int count = 100;
    while (count != 0) {
        
    int p = t.getPriority();
    synchronized(screen) {

        System.out.print(name + " ");
        System.out.println("My priority is: " + p);
        
    }
        count--;
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
        }

      }
    }
    // name is an instance variable, passed as a parameter to the constructor

    
}
