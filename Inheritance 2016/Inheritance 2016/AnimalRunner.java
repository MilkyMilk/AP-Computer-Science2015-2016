
/**
 * Write a description of class AnimalRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimalRunner
{
    public static void main(String[] args) {
        //create a polymorphic array of Animal objects
        
        Animal[] animals = new Animal[4];
        
        animals[0] = new Cat();
        animals[1] = new Tiger();
        animals[2] = new Lion();
        animals[3] = new Bear();
        
        for (Animal i : animals) {
            i.roar();
        }
    }
}
