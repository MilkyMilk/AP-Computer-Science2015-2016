public class Quadratic { 

    public static void main(String[] args) { 
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double discriminant = b*b - (4.0*a*c);
        double sqroot =  Math.sqrt(discriminant);
        
        if (discriminant > 0 && a != 0) {
           double root1 = (-b + sqroot) / (2.0 * a);
           double root2 = (-b - sqroot) / (2.0 * a);
           
           System.out.println(root1);
           System.out.println(root2);
        } else {
           System.out.println("No real solutions");
        }
    }
}