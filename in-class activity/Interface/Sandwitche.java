
/**
 * Write a description of class Sandwitche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sandwitche implements MenuItem
{
    private String name;
    private double price;
    
    public Sandwitche(String str, double p) {
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
