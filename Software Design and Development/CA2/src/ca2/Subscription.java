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
public abstract class Subscription {
    private int creditCardInfo;
    private double deliveryCharge;
    
    private int customerId;

    public Subscription(int cc, double c, int customer) {
        this.creditCardInfo = cc;
        this.deliveryCharge = c;
        this.customerId = customer;
    }
    
    public abstract void printBill();
        
    

    public int getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(int id){
        this.customerId = id;
    }
    
    public int getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(int creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }
    
    public double getDeliveryCharge() {
        return deliveryCharge;
    }

    public void setDeliveryCharge(double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }
    
    @Override
    public String toString()
    {
        return "Name : " + getCustomerId();
    }
    
}
