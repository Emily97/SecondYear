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
        Programmer p =   new Programmer(1, "Joe Bloggs", "joe@bloggs.com", "087-6543210",
                        1234, "Java C++ C#", 70000.00, "Gotham City"); //object
        
        String name = p.getName();
        System.out.println("Programmer Name : " + name);
        
        String email = p.getEmail();
        System.out.println("Programmer Email: " + email);
        
        String phone = p.getMobile();
        System.out.println("Phone Number: " + phone);
        
        int id = p.getId();
        System.out.println("Programmer_id: " + id);
        
        int staffNumber = p.getStaffNumber();
        System.out.println("Staff Number is : " + staffNumber);
        
        String skills = p.getSkills();
        System.out.println("Skills are : " + skills);
        
        double salary = p.getSalary();
        System.out.println("Salary: " + salary);
        
        String address = p.getAddress();
        System.out.println("Address : " + address);
        
        
        
        // use the get methods to get Staff Id, Skills and Salary and assign to variables as appropriate
        // Print these variables to the screen. 
        
        // Another way to do the above, without assigning the retrieved instance variable to a variable in main. 
        System.out.println("Name is : " + p.getName());
        System.out.println("Email is : " + p.getEmail());
        System.out.println("Phone Number is : " + p.getMobile());
        System.out.println("Programmer_id : " + p.getId());
        System.out.println("Staff Number : " + p.getStaffNumber());
        System.out.println("Skills : " + p.getSkills());
        System.out.println("Salary : " + p.getSalary());
        System.out.println("Address : " + p.getAddress());
        
        // now get the rest of the instance variables and print to the screen. 
    }
    
}
