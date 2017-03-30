public class ObjectClient {
  public static void main(String[] args) {
    Objects p = new Objects(1,2);
    //System.out.println(p);
    
    Objects q;
    q = new Objects(1,4);
    
    //p.reduce();
    Objects total = p.divide(q);
    Objects product = p.multiply(q);
    p.square();
    
//    Objects oneThird = new Objects(1,3);
//    Objects twoFiths = new Objects(2,5);
//    Objects sixSeven = new Objects(6,7);
//    Objects top = oneThird.add(twoFiths);
//    Objects result = top.divide(sixSeven);
//    System.out.println(result);
    
    System.out.println(new Objects(1,3).add(new Objects(2,5)).divide(new Objects(6,7)));
    
    System.out.println(new Objects(2,1).multiply(
                                                 (new Objects(7,3).divide((
                                                                           new Objects(5,7).add(new Objects(3,13)))))));
    
    
    //System.out.println(p);
    System.out.println("divide: " + total);
    System.out.println("multiply: " + product);
    System.out.println("square: " + p);
   //System.out.println(q);
    
    //Objects sum = p.add(q);
    //System.out.println(sum);
    
    
  }
}