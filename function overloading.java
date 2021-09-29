class Geometry
{
  void area(int height,int width)
  {
   int ar=height*width;
   System.out.println("Area of Rectangle="+ar);
  }
  void area(int side)
  {
   int ar=side*side;
   System.out.println("Area of Square="+ar);
  }
  void area(float r)
  {
   float ar=3.14f*r*r;
   System.out.println("Area of Circle="+ar);
  }
  void area(float base,float height)
  {
   float ar=0.5f*base*height;
   System.out.println("Area of Triangle="+ar);
  }
}
class Easy
{
 public static void main(String[] args)
 {
  //Creating instance(object)
  Geometry obj=new Geometry();
  //single para for square
  obj.area(12);
  //double int para for rectangle
  obj.area(5,6);
  //single float for circle
  obj.area(2.2f);
  //double float for trianlge
  obj.area(2.5f,6.3f);
 }
}
