/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazine;

/**
 *
 * @author N00150623
 */
class Subscription {
    private int customerId;
    private String customerName;
    private String address;
    private double price;
    private int age;
    private boolean deals;
    
    // Constructor - a special method with the same name as the Class. It is called when creating a Programmer object. 
    // Its purpose is to assign values to the instance variables.
    public Subscription(int id, String n, String a, double p, int g, boolean d){
        this.customerId = id;
        this.customerName = n;
        this.address = a;
        this.price = p;
        this.age = g;
        this.deals = d;
    }
    
    // Accessor methods - get Methods. You need a get method for every instance variable above. 
    // get Methods accept no parameter and return the instance variable type
    public int getCustomerId() {
        return customerId;
    }
    
    // mutator methods - set Methods. You need a set method for every instance variable above. 
    // set methods accept one parameter the tpye depends on the instance variable you are setting. 
    // It usually has one line - assigning the value passed in to the instance variable. 
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public boolean getDeals(){
        return deals;
    }
    
    public void setDeals(boolean deals){
        this.deals = deals;
    }

}
