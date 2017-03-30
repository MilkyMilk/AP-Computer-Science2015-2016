import java.util.*;
/**
 * Write a description of class CafeSandwitche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CafeSandwitche
{
    public static void main(String[] args) {
        Sandwitche sand = new Sandwitche("Chicken", 6.99);
        Coke pepsi = new Coke("pepsi", 1.99);
        Salad cesar = new Salad("cesar", 4.99);
        Trio spc = new Trio(sand, pepsi, cesar);
        
        List<MenuItem> menu = new ArrayList<MenuItem>();
        Collections.addAll(menu, sand, pepsi, cesar, spc);
        
        for (MenuItem i : menu) {
            System.out.println(i.getName() + " | " + i.getPrice());
        }
        
    }
}
