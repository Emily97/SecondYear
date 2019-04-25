/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;
import java.util.Scanner;
/**
 *
 * @author user10
 */
public class ClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Change the progs array length to be 5
        Programmer[] progs = new Programmer[5];
        
        for (int i = 0; i < progs.length; i++) {
            System.out.println("Enter ID for programmer " + (i+1) + " :");
            int id = in.nextInt();
            in.nextLine();
            
            System.out.println("Enter Name for programmer " + (i+1) + " :");
            String name = in.nextLine();          
            
            System.out.println("Enter Email for programmer " + (i+1) + " :");
            String email = in.nextLine();      
            
            System.out.println("Enter Phone for programmer " + (i+1) + " :");
            String phone = in.nextLine();
            
            System.out.println("Enter Staff Number for programmer " + (i+1) + " :");
            int staffNumber = in.nextInt();
            in.nextLine();
            
            System.out.println("Enter Skills for programmer " + (i+1) + " :");
            String skills = in.nextLine();
            
            System.out.println("Enter Salary for programmer " + (i+1) + " :");
            double salary = in.nextDouble();
            
            progs[i] =   new Programmer(id, name, email, phone, staffNumber, skills, salary);
        }
        
        for (int i = 0; i < progs.length; i++) {
            System.out.println(progs[i].getId());
            System.out.println(progs[i].getName());
            System.out.println(progs[i].getEmail());
            System.out.println(progs[i].getMobile());
            System.out.println(progs[i].getStaffNumber());
            System.out.println(progs[i].getSkills());
            System.out.println(progs[i].getSalary());
            System.out.println("");
        }
        
        
        
        // Create programmers for elements 3 and 4 and place them in the array. 
        
        
        
        // now get the rest of the instance variables for progs[0]
        // Once you print Programmer 0 alter the code to use a for loop to print all elements in the array
    }
    
}
