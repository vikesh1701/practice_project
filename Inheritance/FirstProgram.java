// Inheritance program

class A
{
  int a;
  int b;
  
  void sum()
  {
    System.out.println("sum is :"+(a+b));
  }
}
class B extends A
{
   int c;
   void sumAll()
   {
   System.out.println("sum all is :"+(a+b+c));
   }
}

class FirstProgram
{
 public static void main(String args [])
 {
  B ob=new B();
  ob.a=10;
  ob.b=20;
  ob.c=30;
  ob.sum();
  ob.sumAll();
 }
}