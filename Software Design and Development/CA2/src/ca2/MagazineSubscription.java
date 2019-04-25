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
public class MagazineSubscription extends Subscription{
    
    private String magazineName;
    private double monthlyRate;

    public MagazineSubscription(String n, String a, String e, int cc, double c, String mn, double mr) {
        // Calling the Superclass constructor - Staff 
        // This constructor expects and ID, name, email, mobile and staffnumber passed in
        // Since we don't have an id yet we pass in -1 (ie. this programmer is not yet created in the database.)
        super(-1, n,a,e,cc,c);
        this.magazineName = mn;
        this.monthlyRate = mr;
    }
    
       public MagazineSubscription(int id, String n, String a, String e, int cc, double c, String mn, double mr) {
        super(id,n,a,e,cc,c);
        this.magazineName = mn;
        this.monthlyRate = mr;
        
        // call to superclass constructor must be the first line in sub-class constructor
        // super(id,n,e,m,sn);
        
    }

  
   public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    public double getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }
    
    
     @Override
    public void printBill(){
        System.out.println("Magazine Subscription" + monthlyRate*5);
    }
    
    
    @Override
    public String toString()
    {
        // super.toString() calls the super class Staff's toString method() 
        // this returns a string of all tge staff instance variables which is added to these other strings below. 
        // and the whole string is returned to the calling program (in our case the test program in main(). 
        return super.toString();
    }
}
