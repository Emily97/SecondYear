/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author N00150623
 */
public class printString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user_input = new Scanner(System.in);
        String info;
        System.out.println("Please enter information: ");
        info = user_input.next();
        int num;
        System.out.println("Please enter number of repeats: ");
        num = user_input.nextInt();
        for(int i = 0; i<num;i++){
            System.out.println(info);
        }
    }
    
}
