class Addition
{
 void add()
  {
  int x,y=30,z=10;
  x=y+z;
  System.out.println("Add="+x);
  }  
}
//Derived class extending base class
class Subtraction extends Addition
{
 void sub()
  {
  int x,y=30,z=10;
  x=y-z;
  System.out.println("Sub="+x);
  }  
}
class Easy
{
 public static void main(String[] args)
 {
  //Creating instance(object)
  Subtraction obj=new Subtraction();
  //calling base class method
  obj.add();
  //calling derived class method
  obj.sub();
 }
}
