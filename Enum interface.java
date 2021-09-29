import java.util.Vector;
import java.util.Enumeration;
 class Program 
 {
   public static void main(String args[]) 
   {
      /*creating variable of enumeration*/
      Enumeration courses;
      /*creating object of vector*/
      Vector courseName = new Vector(); 
      /*adding data into vector*/
      courseName.add("C");
      courseName.add("C++");
      courseName.add("JAVA");
      courseName.add("PHP");
      courseName.add("ANDROID");
      courseName.add("C#");
      /*passing vector data into enumeration*/
      courses = courseName.elements();
      /*Accessing data of enumeration*/
      while (courses.hasMoreElements()) 
      {
       /*printing data of enumeration*/
       System.out.println(courses.nextElement()); 
      }
   }
}
