import java.util.*;
public class MasterOrder {
  private List<CookieOrder> orders;
  
  public MasterOrder () {
    orders = new ArrayList<CookieOrder>();
  }
  
  public void addOrder(CookieOrder theOrder) {
    orders.add(theOrder);
  }
  
  public int getTotalBoxes() {
    int count = 0;
    for (int i = 0; i < orders.size(); i++) {
      count += orders.get(i).getNumBoxes();
    }
    return count;
  }
  
  public int removeVariety(String cookieVar) {
    int count = 0;
    for (int i = orders.size()-1; i >= 0; i--) {
      if (orders.get(i).getVariety().equals(cookieVar)) {
        count += orders.get(i).getNumBoxes();
        orders.remove(i);
      }
    }
    return count;
  }
  
  public static void main(String args[]) {
   CookieOrder test = new CookieOrder("mint", 5);
   CookieOrder test1 = new CookieOrder("mint", 5);
   MasterOrder order = new MasterOrder();
   order.addOrder(test);
   order.addOrder(test1);
   System.out.println(order.getTotalBoxes());
   System.out.println(order.removeVariety("mint"));
  }
  
}