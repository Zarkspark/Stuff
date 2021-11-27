
using System;

struct Employee{
   public int Id { get; set; }
   public string FullName { get; set; }
}

public class MyClass{
 public static void Main(){
   Employee obj= new Employee();
   obj.FullName = "Hello World";
   Console.WriteLine(obj.FullName);
  }
}