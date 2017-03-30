
/**
 * Write a description of class Coke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coke implements MenuItem
{
    private String name;
    private double price;
    
    public Coke(String str, double p) {
        name = str;
        price = p;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
}
