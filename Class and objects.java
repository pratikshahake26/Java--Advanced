// creating class
class Rectangle
{
int height;
int width;
int area;
void findArea()
 {
  area=height*width;
  System.out.println("Area of Rectangle="+area);
 }
 public static void main(String[] args) 
 {
  //creating object
  Rectangle obj=new Rectangle();
  obj.height=25;
  obj.width=15;
  obj.findArea();
 }
}
