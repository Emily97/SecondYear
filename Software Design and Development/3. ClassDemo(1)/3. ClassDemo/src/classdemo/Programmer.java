/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author user10
 */
public class Programmer {
    
    // Instance variables - these variables exist for every programmer you create 
    private int id;
    private String name;
    private String email;
    private String mobile;
    private int staffNumber;
    private String skills;
    private double salary;
    private String address;
  
    // Constructor - a special method with the same name as the Class. It is called when creating a Programmer object. 
    // Its purpose is to assign values to the instance variables.
    //Constructor
    public Programmer(int id, String n, String e, String m, int sn, String sk, double sl, String a) {
        this.id = id;
        this.name = n;
        this.email = e;
        this.mobile = m;
        this.staffNumber = sn;
        this.skills = sk;
        this.salary = sl;
        this.address = a;
      
    }

   
    // Accessor methods - get Methods. You need a get method for every instance variable above. 
    // get Methods accept no parameter and return the instance variable type 
    //get methods
    public int getId() {
        return id;
    }

    // mutator methods - set Methods. You need a set method for every instance variable above. 
    // set methods accept one parameter the tpye depends on the instance variable you are setting. 
    // It usually has one line - assigning the value passed in to the instance variable. 
    //set methods
    public void setId(int id) {
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
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
}
