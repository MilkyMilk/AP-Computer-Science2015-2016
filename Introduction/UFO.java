//a UFO is a FlyingObject
// by contract, you must write the method bodies for all methods in interface

public class UFO implements FlyingObject {
  public void fly() {
    System.out.println("I'm floating");
  }
  
  public boolean isFlying() {
    return true;
  }
}