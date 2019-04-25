/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user10
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ArrayList<Programmer> programmers = new ArrayList<>();
        ArrayList<HourlyWorker> hourlyWorker = new ArrayList<>();

        programmers.add(
                new Programmer(
                        "Joe Bloggs", "joe@bloggs.com", "087-6543210",
                        1234, "Java C++ C#", 70000.00));

        programmers.add(
                new Programmer(
                        "Anne Bloggs", "anne@bloggs.com", "087-7654321",
                        2345, "HTML CSS JavaScript", 75000.00));

        programmers.add(
                new Programmer(
                        "Fred Bloggs", "fred@bloggs.com", "087-8765432",
                        3456, "UML JUnit Git", 78000.00));

        programmers.add(
                new Programmer(
                        "Mary Bloggs", "mary@bloggs.com", "087-9876543",
                        4567, "PHP MySQL", 80000.00));
        
        hourlyWorker.add(
                new HourlyWorker(
                        "Tim Bloggs", "tim@bloggs.com", "087-654910",
                        1234, 10.00));
                 
                 
        for(Programmer p : programmers)
        {
               System.out.println(p.getName());
        }
        
        for(HourlyWorker h : hourlyWorker){
            System.out.println(h.getName());
        }
     }
            
          
}
  