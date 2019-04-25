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
public class TReaderSQRT implements Runnable{
    int x;
    double sqrt;
    PipedInputStream pin;
    DataInputStream dataIn;
    
    public TReaderSQRT(PipedInputStream p){
        pin = p;
        dataIn = new DataInputStream(pin);
    }
    
    public void run(){
        System.out.println("The reader is running");
        try{
            x = dataIn.readInt();
            while(x != 0){
                System.out.println(sqrt);
                x = dataIn.readInt();
                sqrt = Math.sqrt(x); 
            }
            System.out.println(sqrt);
        }catch(IOException e){}
    }
       
}
