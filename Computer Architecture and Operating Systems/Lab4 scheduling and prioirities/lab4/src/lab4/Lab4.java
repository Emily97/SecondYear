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
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Thread t1 = new Thread(new SchedulingDisplay("T1"));
//        Thread t2 = new Thread(new SchedulingDisplay("T2"));
//        Thread t3 = new Thread(new SchedulingDisplay("T3"));
//          
//        
//        Thread t1 = new Thread(new SchedulingDisplayTest2("T1"));
//        Thread t2 = new Thread(new SchedulingDisplayTest2("T2"));
//        Thread t3 = new Thread(new SchedulingDisplayTest2("T3"));
        
        Thread t1 = new Thread(new SchedulingDisplayTest3("T1"));
        Thread t2 = new Thread(new SchedulingDisplayTest3("T2"));
        Thread t3 = new Thread(new SchedulingDisplayTest3("T3"));
        
        t1.setName("I'm the best");
        t2.setName("I'm the average");
        t3.setName("I'm the least");
            
        t1.start();
        t2.start();
        t3.start();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        
    }
    
}
