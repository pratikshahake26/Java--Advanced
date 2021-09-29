class Rectangle
 {
    int height=10,width=20;
    public void area()
    {
    int height=5,width=6,ar;
    ar=height*width;
    System.out.println("Area 1="+ar
    ar=this.height*this.width;
    System.out.println("Area 2="+ar);
    }  
  }
class Easy
{
 public static void main(String[] args)
 {
  Rectangle obj=new Rectangle();
  obj.area();
 }
}
