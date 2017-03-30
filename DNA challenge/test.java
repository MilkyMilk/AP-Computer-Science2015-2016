import java.util.*; 
public class test {
  public static void main(String[]args){
    //ArrayList<String> permutations = merFrequency.permutes();
    //System.out.println(permutations.size());
    System.out.println(permutes());
    merFrequency.count("AAAAG",3);
  }
  
  public static ArrayList permutes(){ //how to make this take an int X and make X for loops?
    ArrayList<String> letters = new ArrayList<String>();
    letters.addAll(Arrays.asList("A","C","T","G"));
    ArrayList<String> permutations = new ArrayList<String>();
    //1,2,3,4 increasing and makes all the possible combos
    for (int q = 0; q < 4; q++) {
      for (int w = 0; w < 4; w++) {
        for (int e = 0; e < 4; e++) {
            permutations.addAll(Arrays.asList(letters.get(q) + letters.get(w) + 
                                              letters.get(e)));
        }
      }
    }
    return permutations;
  }
  
  //permutations
  //for (int i = permutations.size() -1; i >=0; i--) {
  //   
  //}
  
}