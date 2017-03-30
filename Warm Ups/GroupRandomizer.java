import java.util.*; 
public class GroupRandomizer {
  public static void main(String[] args) {
     ArrayList<String> apCompSci = new ArrayList<String>();
     Collections.addAll(apCompSci, "Emmet", "Shingo", "Akshay", "Kevin", "Ira", "Adam", "Arman", "Malcolm", "Anthony", "Dawson", "Timmy");  
     Collections.shuffle(apCompSci);
     
     for (int i = 0; i < apCompSci.size(); i++) {
       System.out.print(apCompSci.get(i) + ", ");
       if (i % 3 == 0 && i > 0) {
         System.out.println();
       }
     }
     
     
    }
  
  }