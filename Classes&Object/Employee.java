class Person
{
 int id;
 char name;
}
class Student extends Person
{
 int roll;
 int std;
}

class Employee extends Student
{
  public static void main(String args[])
  {
 Student s=new Student();
 s.id=39;
 System.out.println("Student id is:");
 System.out.println(s.id);
 
 s.name='v';
 System.out.println("Student name is:");
 System.out.println(s.name);
 
 s.roll=28;
 System.out.println("Student roll is:");
 System.out.println(s.roll);
 
 
 s.std=15; 
 System.out.println("student std is:");
 System.out.println(s.std);
 
}
}

