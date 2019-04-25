/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author N00150623
 */
public class addTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Java is bae <3");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a first number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter a second number: ");
        int m = reader.nextInt(); 
        int sum = m + n;
        System.out.println("The sum is equal to "+ sum);
    }
    
}
