/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author user10
 */
public class Programmer  extends Staff{

   
    private String skills;
    private double salary;

    public Programmer(int id, String n, String e, String m, int sn, String sk, double sl) {
       super(id,n,e,m,sn);
        this.skills = sk;
        this.salary = sl;
    }
    
     public Programmer(String n, String e, String m, int sn, String sk, double sl) {
       super(-1,n,e,m,sn);
        this.skills = sk;
        this.salary = sl;
    }

    
  
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
         return super.toString() + " Skills " + getSkills() + " Salary " + getSalary();
        
    }
}

