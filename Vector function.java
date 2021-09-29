import java.util.Vector;
 class Program 
 {
   public static void main(String args[]) 
   {

   //add()
    /*creating object of vector*/
    Vector courseName = new Vector(); 
    /*adding data to vector*/
    courseName.add("JAVA");
    courseName.add("PHP");
    /*Accessing data of vector*/
    for(int i=0;i< courseName.size();i++)
    {
     /*printing data of vector*/
     System.out.println(courseName.get(i)); 

  //addElement
    /*creating object of vector*/
    Vector courseName = new Vector(); 
    /*adding data to vector*/
    courseName.addElement("JAVA");
    courseName.addElement("PHP");
    /*Accessing data of vector*/
    for(int i=0;i< courseName.size();i++)
    {
     /*printing data of vector*/
     System.out.println(courseName.get(i)); 
    }
    
  //size() 
/*creating object of vector*/
    Vector courseName = new Vector(); 
    /*adding data to vector*/
    courseName.addElement("JAVA");
    courseName.addElement("PHP");
       System.out.println("Size of vector="+courseName.size());
 
  //get()
/*creating object of vector*/
    Vector courseName = new Vector(); 
    /*adding data to vector*/
    courseName.addElement("JAVA");
    courseName.addElement("PHP");
    /*Accessing element of 
    vector using index value*/
    System.out.println(courseName.get(1));

  //elementAt()
/*creating object of vector*/
    Vector courseName = new Vector(); 
    /*adding data to vector*/
    courseName.addElement("JAVA");
    courseName.addElement("PHP");
    /*Accessing element of 
    vector using index value*/
    System.out.println(courseName.elementAt(1));
   
  //capacity()
/*creating object of vector*/
    Vector obj1 = new Vector(); 
    /*default capacity of vector is 10*/
     System.out.println("Capacity="+obj1.capacity());
     /*here 5 is the capacity*/
    Vector obj2 = new Vector(5); 
     System.out.println("Capacity="+obj2.capacity()); 
 
  //firstElement()
/*creating object of vector*/
    Vector obj = new Vector(); 
    /*adding data to vector*/
    obj.addElement("JAVA");
    obj.addElement("PHP");
    obj.addElement("PyTHON");
    obj.addElement("ANDROID");
    /*Accessing first element of vector */
    System.out.println(obj.firstElement());

  //lastElement()
/*creating object of vector*/
    Vector obj = new Vector(); 
    /*adding data to vector*/
    obj.addElement("JAVA");
    obj.addElement("PHP");
    obj.addElement("PyTHON");
    obj.addElement("ANDROID");
    /*Accessing last element of vector */
    System.out.println(obj.lastElement());
   
  //contains() 
/*creating object of vector*/
    Vector obj = new Vector(); 
    /*adding data to vector*/
    obj.addElement("JAVA");
    obj.addElement("PHP");
    obj.addElement("PyTHON");
    obj.addElement("ANDROID");
    System.out.println(obj.contains("PHP"));
    System.out.println(obj.contains("HTML"));
 
  //isEmpty()
/*creating object of vector*/
    Vector obj = new Vector(); 
    /*currently there is no element in vector*/
     System.out.println(obj.isEmpty());
    /*adding data to vector*/
    obj.addElement("JAVA");
    obj.addElement("PHP");
    /*vector has two elements JAVA and PHP*/
     System.out.println(obj.isEmpty());
   
  //remove()
/*creating object of vector*/
    Vector obj = new Vector(); 
    /*adding data to vector*/
    obj.addElement("JAVA");
    obj.addElement("PHP");
    obj.addElement("PyTHON");
    obj.addElement("ANDROID");
     System.out.println("Elements of vector");
     System.out.println(obj);
     /*removing element from vector*/
     obj.remove(2);/*removes element of index 2*/
     System.out.println("Elements of vector after removing");
     System.out.println(obj);
  
  //removeElement()
/*creating object of vector*/
    Vector obj = new Vector(); 
    /*adding data to vector*/
    obj.addElement("JAVA");
    obj.addElement("PHP");
    obj.addElement("PyTHON");
    obj.addElement("ANDROID");
     System.out.println("Elements of vector");
     System.out.println(obj);
     /*removing element from vector*/
     obj.remove("ANDROID");
     System.out.println("Elements of vector after removing");
     System.out.println(obj);
  
   //insertElementAt() 
/*creating object of vector*/
    Vector obj = new Vector(); 
    /*adding data to vector*/
    obj.addElement("JAVA");
    obj.addElement("PHP");
    obj.addElement("PyTHON");
    obj.addElement("ANDROID");
     System.out.println("Elements of vector");
     System.out.println(obj);
     /*Insert element at index 2*/
     obj.insertElementAt("HTML",2);
     System.out.println("Elements of vector after insertion");
     System.out.println(obj);

  //set() 
/*creating object of vector*/
    Vector obj = new Vector(); 
    /*adding data to vector*/
    obj.addElement("JAVA");
    obj.addElement("PHP");
    obj.addElement("PyTHON");
    obj.addElement("ANDROID");
     System.out.println("Vector elements : "+obj);
     /*setting HTML at index 2*/
     obj.set(2,"HTML");     
     System.out.println("Vector elements after updation : "+obj);
  
  //setElement() 
/*creating object of vector*/
    Vector obj = new Vector(); 
    /*adding data to vector*/
    obj.addElement("JAVA");
    obj.addElement("PHP");
    obj.addElement("PyTHON");
    obj.addElement("ANDROID");
     System.out.println("Vector elements : "+obj);
     /*setting HTML at index 2*/
     obj.setElementAt("HTML",2);     
     System.out.println("Vector elements after updation : "+obj);
  
  //removeAllElement() 
/*creating object of vector*/
    Vector obj = new Vector(); 
    /*adding data to vector*/
    obj.addElement("JAVA");
    obj.addElement("PHP");
    obj.addElement("PyTHON");
    obj.addElement("ANDROID");
     System.out.println("Vector elements : "+obj);
     /*removing all the elements of vector*/
     obj.removeAllElements();     
     System.out.println("Vector elements after deletion : "+obj);
   }
 }
