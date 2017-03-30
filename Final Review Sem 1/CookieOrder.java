public class CookieOrder {
  private String cookieVariety;
  private int numberBoxes;
  
  
  public CookieOrder (String variety, int numBoxes) {
    cookieVariety = variety;
    numberBoxes = numBoxes;
  }
  
  public String getVariety() {
    return this.cookieVariety;
  }
  
  public int getNumBoxes() {
    return this.numberBoxes;
  }
}