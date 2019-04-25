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
public class SchedulingDisplayTest3 implements Runnable{
    private String name;
    private static Object screen = new Object();

    SchedulingDisplayTest3(String n) {
        this.name = n;
    }
    
    public void run(){
    
    Thread t = Thread.currentThread();
    
    int count = 100;
    while (count != 0) {
        
    int p = t.getPriority();
    String name2 = t.getName();
    
    synchronized(screen) {
        System.out.println();
        System.out.println(name);
        System.out.println("My priority is: " + name2);
        
        
    }
        count--;
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
        }

      }
    }    
}
