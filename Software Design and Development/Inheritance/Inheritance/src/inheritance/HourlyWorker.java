/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author N00150623
 */
public class HourlyWorker extends Staff{
    
    private double hourlyRate;
    
    public HourlyWorker(int id, String n, String e, String m, int sn, double hr) {
       super(id,n,e,m,sn);
        this.hourlyRate = hr;
    }
    
    public HourlyWorker(String n, String e, String m, int sn, double hr) {
       super(-1,n,e,m,sn);
        this.hourlyRate = hr;
    }
    
    public Double getHourlyRate(){
        return hourlyRate;
    }
    
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public String toString(){
         return super.toString() + " Hourly Rate " + getHourlyRate();
        
    }
}
