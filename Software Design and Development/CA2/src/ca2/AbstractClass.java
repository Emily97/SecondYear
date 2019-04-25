/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2;

/**
 *
 * @author N00150623
 */
public class AbstractClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Oncomment the following line - why do we have an error?
       //  Staff s1 = new Staff();
        
        MagazineSubscription m1 = new MagazineSubscription(1, "Joe", "somewhere", "joe@iadt.ie", 29382, 2.50,"Fashion Magazine",12.00);
        m1.printBill();
        System.out.println(m1.toString());
        
        
        
        // Staff is abstract - do we cannot instantiate(create) objects of type staff
        // But what if we know we will create some staff member but not sure which one it will be???
        Subscription someSubscriber;
        
        //someStaffMember might refer to an HourlyWorker or a Programmer and you can also switch between them 
        
        someSubscriber =  new MagazineSubscription(2, "Jim", "where", "jim@iadt.ie", 29372, 2.50,"Sport Magazine",12.00);
        someSubscriber.printBill();
    }
    
}
