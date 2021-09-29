class group
{
  void area(int height,int width)
  {
   int ar=height*width;
   System.out.println("Area of Rectangle1="+ar);
  }
}
class solution extends group
{
  void area(int height,int width)
  {
   int ar=height*width;
   System.out.println("Area of Rectangle2="+ar);
  }
}
class Easy
{
 public static void main(String[] args)
 {
  //Creating instance(object)
  solution.obj=new solution();
  //calling function
  obj.area(12,13);
 }
}
