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
public class NewspaperSubscription extends Subscription{
    
    private String newspaperName;
    private double dailyRate;
    
    public NewspaperSubscription(int id, String n, String a, String e, int cc, double c, String nn, double dr){   
        super(id,n,a,e,cc,c);
        this.newspaperName = nn;
        this.dailyRate = dr;
    }
    
    public String getNewspaperName(){
        return newspaperName;
    }
    
    public void setNewspaperName(String newspaperName){
        this.newspaperName = newspaperName;
    }

   
    @Override
    public void printBill(){
        System.out.println("Newspaper Subscription:" + dailyRate*5);
    }
    
    public double getDailyRate() {
        return dailyRate;
    }

   
    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
    
}

