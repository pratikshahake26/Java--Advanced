abstract class Geometry
{
 //declaring non-abstract method
 public void rectangle_area(int height,int width)
 {
  int ar=height*width;
  System.out.println("Area of rectangle="+ar);
 }
  //declaring non-abstract method
 public void square_area(int side)
 {
  int ar=side*side;
  System.out.println("Area of square="+ar);
 }
  //declaring non-abstract method
 public void circle_area(float radius)
 {
  float ar=3.14f*radius*radius;
  System.out.println("Area of circle="+ar);
 }
          
}
//extending abstract class
class Easy extends Geometry
{
 public static void main(String[] args)
 {
   //creating instance of derived class
   Easy obj=new Easy();
   //calling method of abstract class
   obj.rectangle_area(12, 13);
   obj.square_area(12);
   obj.circle_area(2.2f);
 }
}
