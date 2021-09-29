class Showroom
{
public void company()
{
 System.out.println("Renault"); 
}
public void model()
{
 System.out.println("Duster"); 
}
public void color()
{
 System.out.println("White/Gray/Silver/Black/Brown"); 
}
public void oilType()
{
 System.out.println("Petrol"); 
}
public void price()
{
 System.out.println("800,000 to 1400,000"); 
}
//private member
private void piston()
{
 System.out.println("4 piston"); 
}
//private member
private void person_who_made()
{
 System.out.println("Alexo Remon"); 
}
}
class Easy
{
 public static void main(String[] args) 
 {
  //creating instance(object) of class
 Showroom obj=new Showroom();
 //calling function
 obj.company();
 obj.model();
 obj.color();
 obj.price();
 obj.oilType();
 }
}
