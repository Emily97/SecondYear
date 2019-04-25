/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author N00150623
 */
public class cinemaTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Please enter your name: ");
        String name = in.nextLine();
        
        System.out.println("Please enter your age: ");
        int age = reader.nextInt();
        if(age>=65){
           System.out.println("Hello "+ name +" , you get a discount for being over 65 years of age."); 
        }
        else if(age<18){
           System.out.println("Hello "+ name +" , you get a child's ticket as you are less than 18 years of age."); 
        }
        else if(age>=18){
            System.out.println("Hello "+ name +" , you pay full price for the ticket.");
        }
    }
    
}
