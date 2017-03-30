public class Objects implements Comparable {
  //think of a class as a data-type
  //this is a blueprint for our objects
  //An object is a particular instance of a class
  //You can create as many objects as you want from a class
  //client program: Rational p = new Rational(1,2);
  
  //primitive data types:
  //int x = 5;
  //double y = 3.0;
  
  
  //(1) instance variables/field [state]  (2)methods [behavior]
  
  //instance variables
  //should be private -> other classes can't access these variables directly
  //don't want other classes to have access to your privates
  private int numerator;
  private int denominator;
  
  //constructors -- no return type, not even void
  //name same as the class name
  //can have as many as you want if they have diffrent paramaters
  
  //default constructor
  public Objects() {
    
  }
  
  //2-argument contructor
  public Objects(int num, int denom) {
    numerator = num;
    denominator = denom;
    
  }
  
  //method that allows System.out.print() to work on object
  public String toString() {
    return numerator + "/" + denominator;
  }
  
  //makes a copy
  public Objects(Objects rat) {
    numerator = rat.numerator;
    denominator = rat.denominator;
  }
 
  //return the sum of this object + rat as a Rational
  public Objects add(Objects rat) {
    int num = rat.denominator * this.numerator + rat.numerator * this.denominator;
    int demon = rat.denominator * denominator;
  
    Objects result = new Objects(num,demon);
    return result;
  }
  
  public static Objects add(Objects p, Objects q) {
    //add p & q
    return p.add(q);
  }
  
  public Objects multiply(Objects rat) {
    int num = rat.numerator * this.numerator;
    int denom = rat.denominator * this.denominator;
    
    int gcd = Methods.gcd(num, denom);
    num /= gcd;
    denom /= gcd;
    return new Objects(num, denom);
    
  }

  public Objects divide(Objects rat) {
    //    1/4 / 1/2
    // 
    Objects recip = new Objects(rat.denominator, rat.numerator); 
    Objects result = this.multiply(recip);
    result.reduce();
    return result;
//    int num = rat.denominator * this.numerator;
//    int denom = rat.numerator * this.denominator;
//    
//    Objects output = new Objects(num, denom);
//    output.reduce();
//    return output;
  }
  
  public void square () {
    numerator = numerator * numerator;
    denominator = denominator * denominator;
    reduce();
  }
  
  private void reduce () {
    int gcd = Methods.gcd(numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;
  }
  
  public int compareTo(Object obj) {
    //return positive (e.g 1) if greater than obj
    //return negative (e.g -1) if less than obj
    int crossThis = this.numerator * ((Objects) obj).denominator;
    int crossObj = ((Objects) obj).numerator * this.denominator;
    if (crossThis > crossObj)
      return 1;
    else if (crossObj > crossThis)
      return -1;
    else
      return 0;
    
  }
}
  
  