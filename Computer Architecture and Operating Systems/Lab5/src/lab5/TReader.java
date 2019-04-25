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
public class TReader implements Runnable{
    PipedInputStream pin;
    DataInputStream dataIn;
    int x;
    
    public TReader(PipedInputStream p){
        pin = p;
        dataIn = new DataInputStream(pin);
    }
    
    public void run(){
        System.out.println("The reader is running");
        try{
            x = dataIn.readInt();
            while(x != 0){
                System.out.println(x);
                x = dataIn.readInt();
            }
            System.out.println(x);
        }catch(IOException e){}
    }
        
}
