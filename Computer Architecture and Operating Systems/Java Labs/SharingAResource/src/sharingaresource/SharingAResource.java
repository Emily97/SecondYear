/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharingaresource;

/**
 *
 * @author N00150623
 */
public class SharingAResource implements Runnable{

    private String message;
    private int pause; //in seconds
    
    //Each thread gets its message and pause time 
    //when its created
    SharingAResource(String m, int p){
        message = m;
        pause = p * 1000;
}
    public void run(){
        //print the message to the screen 10 times
        for(int i = 0;i < 10;i++){
            try{
                Thread.sleep(pause);
            }catch(InterruptedException e){
                return;
            }
            System.out.println(message);
        }
    }
}
