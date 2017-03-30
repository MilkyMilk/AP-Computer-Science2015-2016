public class APLine {
  private int a;
  private int b;
  private int c;
  private double slope;
  public APLine(int inA, int inB, int inC) {
    a = inA;
    b = inB;
    c = inC;
    slope = -1.0 * a / b; 
  }
  
  public double getSlope() {
    return slope;
  }
  
  public boolean isOnLine(int x, int y) {
    if (a*x + b*y + c == 0)
      return true;
    else
      return false;
  }
  
  public static void main(String args[]) {
    APLine line1 = new APLine(5, 4, -17);
    System.out.println(line1.getSlope());
    System.out.println(line1.isOnLine(5, -2));
    
    APLine line2 = new APLine(-25, 40, 30);
    System.out.println(line2.getSlope());
    System.out.println(line2.isOnLine(5, -2));
    System.out.println(line2.toString());
  }
  
  @Override
  public String toString() {
    return "Slope: " + slope + " Equation: y" + a + " X" + b;
  }
  
}