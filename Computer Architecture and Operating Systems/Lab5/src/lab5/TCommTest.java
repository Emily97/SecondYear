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
public class TCommTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PipedInputStream pin = new PipedInputStream();
        PipedOutputStream pout = new PipedOutputStream();
        
        try{
            pin.connect(pout);
        }catch(IOException e){}
        
        //Associated reader with input stream
        //TReader reader = new TReader(pin);
        TReaderSQRT reader = new TReaderSQRT(pin);
        //Associated writer with new output stream
        TWriter writer = new TWriter(pout);
        
        Thread t1 = new Thread(reader);
        Thread t2 = new Thread(writer);
        
        t1.start();
        t2.start();
    }
    
}
