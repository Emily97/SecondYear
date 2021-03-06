package magazine;
import java.util.*;
/**
 *
 * @author N00150623
 */
public class Model {
    
    private static Model instance = null;
        
        
    public static synchronized Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    //ArrayList refering to the subscription class that will create models called subscription
    private final List<Subscription> subscription;
    
    //A private class is only accessible within the same class as it is declared.
    private Model(){
        this.subscription = new ArrayList<Subscription>();
        
        this.subscription.add(
                new Subscription(
                        001, "Joe Bloggs", "Main st", 25.00, 25, true));
        
        this.subscription.add(
                new Subscription(
                        002, "Anne Bloggs", "Main st", 30.00, 23, false));
        this.subscription.add(
                new Subscription(
                        003, "Sue Bloggs", "Main st", 25.00, 24, true));
    }

    public List<Subscription> getSubscription() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new ArrayList<Subscription>(this.subscription);
    }
    
    public void addSubscription(Subscription s){
        //s is a sunscription object
        //this creates a subscriber for the magazine class
        this.subscription.add(s);
    }
    
    public boolean removeSubscription(Subscription s){
        return this.subscription.remove(s);
    }
    
    public Subscription findSubscriptionByCustomerId(int customerId) {
        Subscription p = null;
        int i = 0;
        boolean found = false;
        
        // Loop from the start of the arrayList until the end of the arrayList(size()) or until the required programmer is found
        while (i < this.subscription.size() && !found) {
            // get the programmer object in position i. (0,1,2,3,4....size) assign it to p. 
            p = this.subscription.get(i);
            if (p.getCustomerId() == customerId) {
                found = true;
            } else {
                i++;
            }
        }
        if (!found) {
            // programmer not found so return null 
            p = null;
        }
        // if you get to this point, p should have the programmer object with the staffNumber that was passed in. 
        return p;
    }
     
}

    

