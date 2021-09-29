class Parameter
  {
    int height=10,width=20;
  }
class Rectangle extends Parameter
{
int height=5,width=6;
    public void area() 
    {
     int ar;
     ar=height*width;
     System.out.println("Area without super="+ar);
     ar=super.height*super.width;
     System.out.println("Area with super="+ar);
    }
}
class Easy
{
 public static void main(String[] args)
 {
  //Creating instance(object) of  class
  Rectangle obj=new Rectangle();
  obj.area();
 }
}
