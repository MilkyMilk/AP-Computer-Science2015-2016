public class DecimaltoBinary {
  public static void main(String[] args) {
    //System.out.println(Integer.toString(Integer.parseInt(args[0]),2));

    int decimal = Integer.parseInt(args[0]);
    String values = "";

    while (decimal > 0) {
      int oneorNah = decimal % 2;
      decimal = decimal / 2;
      if (oneorNah == 1)
        values += "1";
      else
        values += "0";
      //if (decimal == 0)
        //break;
    }

    String binary = new StringBuffer(values).reverse().toString();
    System.out.println(binary);

    }

  }
