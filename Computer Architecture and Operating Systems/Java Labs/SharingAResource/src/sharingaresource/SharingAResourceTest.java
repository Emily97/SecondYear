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
public class SharingAResourceTest {
    public static void main (String[] args){
        //create the threads
        Runnable joes = new SharingAResource("Eat at Joe's", 2);
        Runnable bills = new SharingAResource("Eat at Bill's", 4);
        Thread j = new Thread(joes);
        Thread b = new Thread(bills);
        
        //start the threads
        j.start();
        b.start();
        
        try{
            j.join();
            b.join();
        }catch(InterruptedException r){
            return;
        }
        System.out.println("BILLBOARD CLOSED");
    }
}
