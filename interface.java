interface Geometry
{
  void rectangle_area(int height,int width);      
}
//implementing interface
class Easy implements Geometry
{
 //implementing method of interface
 public void rectangle_area(int height,int width)
 {
  int ar=height*width;
  System.out.println("Area of rectangle="+ar);
 }
public static void main(String[] args)
 {
   //creating instance of derived class
   Easy obj=new Easy();
   obj.rectangle_area(12, 13);
}
}
