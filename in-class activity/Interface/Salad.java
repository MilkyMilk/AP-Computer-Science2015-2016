
/**
 * Write a description of class Salad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salad implements MenuItem
{
    private String name;
    private double price;
    
    public Salad(String str, double p) {
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