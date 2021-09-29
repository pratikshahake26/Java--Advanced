abstract class Geometry
{
  //declaring abstract method
  abstract void rectangle_area(int height,int width);
   //declaring non-abstract or normal method
 public void square_area(int side)
 {
  int ar=side*side;
  System.out.println("Area of square="+ar);
 }
  //declaring non-abstract or normal method
 public void circle_area(float radius)
 {
  float ar=3.14f*radius*radius;
  System.out.println("Area of circle="+ar);
 }
}
//extending abstract class
class Easy extends Geometry
{
 //implementing abstrcat method of abstract class
 public void rectangle_area(int height,int width)
 {
  int ar=height*width;
  System.out.println("Area of rectangle="+ar);
 }
 public static void main(String[] args)
 {
   //creating instance of derived class
   Easy obj=new Easy();
   //calling abstract method
   obj.rectangle_area(12, 13);
   //calling non-abstract or normal method
   obj.square_area(12);
   obj.circle_area(2.2f);
 }
}
