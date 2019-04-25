/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author user10
 */
public class ClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Change the progs array length to be 5
        Programmer[] progs = new Programmer[5];
        
        progs[0] =   new Programmer(1, "Joe Bloggs", "joe@bloggs.com", "087-6543210",
                        1234, "Java C++ C#", 70000.00);
        
        progs[1] =   new Programmer(2, "Sam Boylan", "sam@iadt.com", "087-2221121",
                        1235, "Ruby on Rails", 65000.00);
        
        progs[2] =   new Programmer(3, "Nancy Harp", "nh@yahoo.com", "085-9994322",
                        1236, "CMS", 34000.00);
        
        progs[3] = new Programmer (4, "Batman", "darknight@gmail.com", "999", 
                        1237, "Alfred", 100000.00);
        
        progs[4] = new Programmer (5, "Joker", "joker@gmail.com", "911", 
                        1238, "Harley", 80000.00);
        
        
        // Create programmers for elements 3 and 4 and place them in the array. 
        
        
        String name = progs[0].getName();
        System.out.println("Programmer Name : " + name);
        
        String email = progs[0].getEmail();
        System.out.println("Programmer Email: " + email);
        
        String phone = progs[0].getMobile();
        System.out.println("Phone Number: " + phone);
        
        String skills = progs[0].getSkills();
        System.out.println("Skills: " + skills);
        
        int id = progs[0].getId();
        System.out.println("Programmer_id: " + id);
        
        int staffNumber = progs[0].getStaffNumber();
        System.out.println("Staff Number is : " + staffNumber);
        
        double salary = progs[0].getSalary();
        System.out.println("Salary: " + salary);
                 
        // now get the rest of the instance variables for progs[0]
        // Once you print Programmer 0 alter the code to use a for loop to print all elements in the array
    }
    
}
