/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author N00150623
 */
public class Lab4 {
    
 
    public static void readStudent(){
       //Task 1 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Scanner user_input;
        user_input = new Scanner(System.in);
        String name;
        System.out.println("Please enter your name: ");
        name = user_input.next();
        int studentNumber;
        System.out.println("Please enter your Student number: ");
        studentNumber = user_input.nextInt();
        String address;
        System.out.println("Please enter your address: ");
        address = user_input.next();
        for(int i = 0; i <10;i++){
            System.out.println("Your name is "+ name + ". Your Student Number is N"+ studentNumber +". Your address is "+ address);
        }
        */
        Scanner user_input;
        user_input = new Scanner(System.in);
        for(int i = 0; i<3;i++){
            String name;
            System.out.println("Are you a day patient? If yes please enter y or n if your a night patient: ");
            name = user_input.next();
            if(user_input = "y"){
                System.out.println("");
            }
        }
    }

}
