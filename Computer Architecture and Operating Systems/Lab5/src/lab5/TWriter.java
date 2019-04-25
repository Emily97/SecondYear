/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.io.*;
/**
 *
 * @author N00150623
 */
public class TWriter implements Runnable{
    PipedOutputStream pout;
    DataOutputStream dataOut;
    int x;
    
    public TWriter(PipedOutputStream p){
        pout = p;
        dataOut = new DataOutputStream(pout);
    }
    
    public void run(){
        System.out.println("The writer thread is running");
        try{
            x = 1;
            while(x < 1000){
                dataOut.writeInt(x);
                //pout.write(x);
                x = x + 1;
            }
            x = 0;
            dataOut.writeInt(x);
            //pout.write(x);
        }catch(IOException e){}
    }
}
