/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author N00150623
 */
public class Customer {
    private int customerId;
    private String customerName;
    private int age;
    private String address;
    private String email;
    
    private List<Subscription> subscription;
    
    public Customer(int id, String n, int g, String a, String e){
        this.customerId = id;
        this.customerName = n;
        this.age = g;
        this.address = a;
        this.email = e;
        
        subscription = new ArrayList();
    }
    
    // add a new subscription to the customers list of subscriptions
    public void addSubscription(Subscription s){
        subscription.add(s);
    }
    
    // remove a subscription from the customers list of subscriptions
    public void removeSubscription(Subscription s){
        subscription.remove(s);
    }
    
    public int getCustomerId(){
        return customerId;
    }
    
    public
}
