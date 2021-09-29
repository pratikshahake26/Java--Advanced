class Rectangle 
{
  //declaring static varibale
  static int height,width,ar;
    void area() 
    {
     ar=height*width;
     System.out.println("Area of Rectangle="+ar);
    }
  }
class Easy
{
 public static void main(String[] args)
 {
  //accessing static varible and assigning value to it
  //note that we are accessing using class name not using object
  Rectangle.height=20;
  Rectangle.width=30;
  //Creating instance(object) of  class
  Rectangle obj=new Rectangle();
  obj.area();//calling function
 }
}
