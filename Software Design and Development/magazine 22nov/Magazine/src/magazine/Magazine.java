/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazine;
import java.util.*;
//import java.util.Scanner;
/**
 *
 * @author N00150623
 */
public class Magazine {
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\u001B[0m";
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Model model = Model.getInstance();
        
        Subscription s;
        
        int opt;
        //this creates an option menu for the program for the user to decide what he/she would like to do
        //the four options avaliable to the user is creating, deleting, viewing and exiting the program
        do {
            System.out.println(RED +"Press 1 to create a new subscriber");
            System.out.println(RED +"Press 2 to delete existing subscriber");
            System.out.println(RED +"Press 3 to view all subscribers");
            System.out.println(RED +"Press 4 to update a subscriber information");
            System.out.println(RED +"Press 5 when you are finished");
            System.out.println();
            
            //this asks the user to input a number to go to one of the four options
            //opt is an integer variable which will go to any four of the cases the user inputs
            System.out.print(BLUE+"Enter option: ");
            String line = input.nextLine();
            opt = Integer.parseInt(line);
            
            //this is the 4 cases that can happen for now
            System.out.println(BLUE+"You chose option " +PURPLE+ opt);
            switch (opt) {
                case 1: {
                    System.out.println(BLUE+"Creating programmer");
                    s = readSubscription(input);
                    model.addSubscription(s);
                    
                    break;
                }
                case 2: {
                    System.out.println(BLUE+"Deleting subscriber");
                    deleteSubscription(input, model);
                    break;
                }
                case 3: {
                    System.out.println(BLUE+"View all subscribers");
                    viewSubscription(model);
                    break;
                }
                case 4: {
                    System.out.println(BLUE+"Update a subscriber");
                    updateSubscription(input,model);
                    break;
                }
            }
        }
        while (opt != 5);
        System.out.println("Thank you and Goodbye");
    }
    
    //this is what is called for case one
    private static Subscription readSubscription(Scanner inpu) {
        int customerId, age;
        String customerName, address;
        double price;
        boolean deals;
        String line;

        customerName = getString(inpu, "Enter name: ");
        address = getString(inpu, "Enter email: ");
        line = getString(inpu, "Enter customer number: ");
        customerId = Integer.parseInt(line);
        line = getString(inpu, "Enter customer age: ");
        age = Integer.parseInt(line);
        line = getString(inpu, "Enter price: ");
        price = Double.parseDouble(line);
        line = getString(inpu, "Does customer wish to receive info on offers:(insert Y or N) ");
        deals = Boolean.getBoolean(line);
        
        

        Subscription s = 
                new Subscription(customerId, customerName, address, 
                        price, age, deals);
        
        return s;
    }
    
    //this is what is called for case two
    private static void deleteSubscription(Scanner it, Model model) {
        System.out.print("Enter the customer number of the subscriber to delete:");
        int customerId = Integer.parseInt(it.nextLine());
        Subscription s;

        s = model.findSubscriptionByCustomerId(customerId);
        if (s != null) {
            if (model.removeSubscription(s)) {
                System.out.println("Subscriber deleted");
            }
            else {
                System.out.println("Subscriber not deleted");
            }
        }
        else {
            System.out.println("Subscriber not found");
        }
    }
    
    //this is what is called for case three
    private static void viewSubscription(Model model) {
        List<Subscription> subscription = model.getSubscription();
        //subscription is an arrayList full of Subscription Objects
        for (Subscription sr : subscription) {
            System.out.println("CustomerId: " +PURPLE+ sr.getCustomerId());
            System.out.println("Name: " +PURPLE+ sr.getCustomerName());
            System.out.println("Address: " +PURPLE+ sr.getAddress());
            System.out.println("Price plan: " +PURPLE+ sr.getPrice());
            System.out.println("Age: " +PURPLE+ sr.getAge());
            System.out.println("Deals info: " +PURPLE+ sr.getDeals());
        }
    }
    
    //referencing getString in the readSubscription class
    private static String getString(Scanner input, String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }
    
    private static Boolean getBoolean(Scanner input, String prompt){
        System.out.print(prompt);
        
        String line = input.nextLine();
        boolean opt = false;
        if(line.equalsIgnoreCase("Y")){
            opt = true;
        }
        else if(line.equalsIgnoreCase("N")){
            opt = false;
        }
        return opt;
    }
    
    private static void updateSubscription(Scanner input, Model model) {
        String line;
        line = getString(input,"Enter the customer number of the subscriber to update:");
        int customerId = Integer.parseInt(line);
        System.out.println();
        Subscription s;
        int age;
        String customerName, address;
        double price;
        boolean deals;
        //line = input.nextLine();
        s = model.findSubscriptionByCustomerId(customerId);
        
        int opt2;
        do {
            System.out.println("Press 1 to update customerId");
            System.out.println("Press 2 to update customer name");
            System.out.println("Press 3 to update customer address");
            System.out.println("Press 4 to update customer subscription price");
            System.out.println("Press 5 to update customer age");
            System.out.println("Press 6 to update customer subscription plan");
            System.out.println("Press 7 to return to main menu");
            System.out.println();
            
            //this asks the user to input a number to go to one of the four options
            //opt is an integer variable which will go to any four of the cases the user inputs
            System.out.print("Enter option: ");
            String line2 = input.nextLine();
            opt2 = Integer.parseInt(line2);
            
            //this is the 4 cases that can happen for now
            System.out.println("You chose option " + opt2);
            switch (opt2) {
                case 1: {
                    line = getString(input, "Update customer id:");
                    customerId = Integer.parseInt(line);
                    s.setCustomerId(customerId);
                    
                    break;
                }
                case 2: {
                    customerName = getString(input, "Update customer name:");
   
                    s.setCustomerName(customerName);
                    
                    break;
                }
                case 3: {
                    address = getString(input, "Update customer address:");
   
                    s.setAddress(address);
                    
                    break;
                }
                case 4: {
                    line = getString(input,"Update customer subscription price:");
                    price = Double.parseDouble(line);
                    s.setPrice(price);
                    break;
                }
                case 5: {
                    line = getString(input,"Update customer age:");
                    age = Integer.parseInt(line);
                    s.setAge(age);
                    break;
                }
                case 6: {
                    line = getString(input,"Update customer subscription plan:");
                    deals = Boolean.getBoolean(line);
                    s.setDeals(deals);
                    break;
                }
            }
        }
        while (opt2 != 7);
        System.out.println("Thank you and Goodbye");
    }
    
}


//old code
        // programmers is an arrayList full of Programmer Objects
        // ArrayLists are similar to arrays..more on this in lecture
        //List<Subscription> subscription = model.getSubscription();
        
        // Now loop through the arrayList and print the programmer object using get methods.
        
    
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//          Scanner in = new Scanner(System.in);
//        ArrayList<Subscription> subs = new ArrayList<Subscription>();
//        
//        Subscription[] sub = new Subscription[5];
//        
//        Subscription p;
//        p = new Subscription(1,"Joe Blogs","Elm Street",25.00,18,true);
//        
//        System.out.println("CustomerId is : " + p.getCustomerId());
//        System.out.println("CustomerName is : " + p.getCustomerName());
//        System.out.println("Address is : " + p.getAddress());
//        System.out.println("Magazine Subscription price is : " + p.getPrice());
//        System.out.println("Age is : " + p.getAge());
//        System.out.println("Does the customer wish to be informed of third party deals :" + p.getDeals());
//        
//        for (int i = 0; i < sub.length; i++) {
//            System.out.println("Enter ID for customer " + (i+1) + " :");
//            int customerId = in.nextInt();
//            in.nextLine();
//            
//            System.out.println("Enter Name for customer " + (i+1) + " :");
//            String customerName = in.nextLine();          
//            
//            System.out.println("Enter Address for customer " + (i+1) + " :");
//            String address = in.nextLine();
//            
//            System.out.println("Enter Subscription Price for customer " + (i+1) + " :");
//            double price = in.nextDouble();
//            
//            System.out.println("Enter Age for customer " + (i+1) + " :");
//            int age = in.nextInt();
//            in.nextLine();
//            
//            System.out.println("Enter if customer " + (i+1) + "wishes to be informed of third party deals :");
//            boolean deals = in.nextBoolean();
//            
//            
//            
//            subs.add( new Subscription(customerId, customerName, address, price, age, deals));
//        }
//        
//        for (int i = 0; i < subscription.size(); i++) {
//            System.out.println("CustomerId : " + subscription.get(i).getCustomerId());
//            System.out.println("CustomerName : " + subscription.get(i).getCustomerName());
//            System.out.println("CustomerAddress : " + subscription.get(i).getAddress());
//            System.out.println("SubscriptionPrice : " + subscription.get(i).getPrice());
//            System.out.println("CustomerAge : " + subscription.get(i).getAge());
//            System.out.println("CustomerDeals : " + subscription.get(i).getDeals());
//            System.out.println("");
        
          
        

