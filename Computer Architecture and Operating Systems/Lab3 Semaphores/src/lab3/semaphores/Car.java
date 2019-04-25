/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.semaphores;

/**
 *
 * @author N00150623
 */
public class Car implements Runnable {
    //instance variable - the shared
    //resource
    Tunnel t;
    int num; //A number identifying each car
    
    public Car(Tunnel t1, int n){
      t = t1;
      num = n;
    }
    
    public void run(){
        t.waitTunnel(num);
        //you should make the thread 
        //sleep for 10 seconds here
        try{
                Thread.sleep(10000);
            }
            catch(InterruptedException e){
                
            }
        t.signalTunnel(num);
        
    }
        
            
}
