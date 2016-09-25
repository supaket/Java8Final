package school;

public class Student {
   String name; 
   Gpa gpa;    
   
   public Student() {
       gpa = new Gpa();
   }
   
   void setName(String studentName) {
       name = studentName;
    }      
}
