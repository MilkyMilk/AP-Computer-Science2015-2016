public class sierpinskiTriangle {
  public static void main(String[] args) {
    int n = 6;
    //draw(n,0.5,0.5,0.6,0.5,0.55,0.6732);
    draw(n,0.5,0.5,0.9,0.5,0.7,0.7598,1);
  }
  
  public static void draw(int n,double x0, double y0, double x1, double y1, double x2, double y2, int repeat) {
    if (n == 0)
      return;
    
   //draw an /\
   StdDraw.line(x0, y0, x1, y1);
   StdDraw.line(x0, y0, x2, y2);
   StdDraw.line(x1, y1, x2, y2);
   
   double nx0, ny0, nx1, ny1, nx2, ny2; //calculate midpoints
   nx0 = (x0 + x1) / 2;
   ny0 = (y0 + y1) / 2;
   
   nx1 = (x1 + x2) / 2;
   ny1 = (y1 + y2) / 2;
   
   nx2 = (x0 + x2) / 2;
   ny2 = (y0 + y2) / 2;
   //StdDraw.line(n-1, nx0, ny0, nx1, ny1, nx2, ny2);
   
   
   
   //recursivly draw /\ tree connecting midpoint of each side
   //draw(n-1, x0, y0, nx0, ny0, nx1, ny1);  
   //draw(n-1, nx0, ny0, x1, y1, nx2, ny2);
   //draw(n-1, nx1, ny1, nx2, ny2, x2, y2);
   
   if (repeat == 1 || repeat == 0) {
     draw(n-1, nx0, ny0, nx1, ny1, nx2, ny2,0);
   }
   else {
     //draw(n-1, nnx0, nny0, nx1, ny1, x2, y2,0);
     //draw(n-1, x0, y0, x1, y1, nx2, ny2, 0);
   }
   
   
   
  }
}