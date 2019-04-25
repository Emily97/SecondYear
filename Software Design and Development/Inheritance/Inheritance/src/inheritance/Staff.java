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
public class Staff {

    private int id;
    private String name;
    private String email;
    private String mobile;
    private int staffNumber;
  

    public Staff(int id, String n, String e, String m, int sn) {
        this.id = id;
        this.name = n;
        this.email = e;
        this.mobile = m;
        this.staffNumber = sn;
      
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }
    
    @Override
    public String toString()
    {
        return "Name : " + getName();
    }

   
}

