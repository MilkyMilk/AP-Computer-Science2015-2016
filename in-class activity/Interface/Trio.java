import java.util.*;
/**
 * Write a description of class Trio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trio implements MenuItem
{
    private String name;
    private double price;
    
    public Trio(Sandwitche sand, Coke coke, Salad salad) {
        name = sand.getName() + "/" + coke.getName() + "/" + salad.getName();
        double[] pr = {sand.getPrice(), coke.getPrice(), salad.getPrice()};
        Arrays.sort(pr);
        price = pr[1] + pr[2];
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
}