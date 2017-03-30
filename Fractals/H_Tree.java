public class H_Tree {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    draw(n,0.5,0.5,0.5);
  }
  
  public static void draw(int n, double length, double x, double y) {
    if (n == 0)
      return;
    
   double x0 = x - length/2;
   double x1 = x + length/2;
   double y0 = y - length/2;
   double y1 = y + length/2;
   
   //draw an H
   StdDraw.line(x0,y0,x0,y1);
   StdDraw.line(x1,y0,x1,y1);
   StdDraw.line(x0,y,x1,y);
   
   //recursivly draw H tree on each of the four coners with depth n-1;
  // draw(n-1, length/2, x/2, y/2);
   //draw(n-1, length/2, x*2, y/2);
   draw(n-1, length, x0, y0);
   draw(n-1, length/2, x1, y0);
   draw(n-1, length/3, x0, y1);
   draw(n-1, length, x1, y1);
   
  }
}