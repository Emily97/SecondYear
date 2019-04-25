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
public class Tunnel {
    private int count;
    
    public Tunnel(int c){
    count = c;
}
    public synchronized void waitTunnel(int n){
        //if count is zero the process must wait
        while(count == 0)
            try{
               wait(); 
            }catch(InterruptedException e){
    }
        //otherwise the process can continue
        count--;
        System.out.println("Car "+n+" + has Entered. " + count + " spaces left in tunnel.");
}
    public synchronized void signalTunnel(int n){
        count++;
         System.out.println("Car "+n+" has left. " + count + " spaces left in tunnel.");
         notify();
        }

}
