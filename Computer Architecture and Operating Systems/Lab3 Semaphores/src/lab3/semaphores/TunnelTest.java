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
public class TunnelTest {
    public static void main(String[]args){
        //create the tunnel, all cars will be passed the same resource
        Tunnel portTunnel = new Tunnel(10);
        
        for(int j = 0;j < 15; j = j +1){
            new Thread(new Car(portTunnel, j)).start();
            //sleep for .2 seconds
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                
            }
        }
    }
}
