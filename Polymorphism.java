class Poly
{
  void a()
  {
   System.out.println("No para");
  }
  void a(int i)
  {
   System.out.println("Integer para");
  }
  void a(char ch)
  {
   System.out.println("Character para");
  }
  void a(float f)
  {
   System.out.println("Float para");
  }
  void a(double d)
  {
   System.out.println("Double para");
  }
  void a(String s)
  {
   System.out.println("String para");
  }
}
class Easy
{
 public static void main(String[] args)
 {
  //Creating instance(object)
  Poly obj=new Poly();
  obj.a(12);
  obj.a('e');
  obj.a("Easy");
 }
}
