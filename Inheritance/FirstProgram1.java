// Inheritance program//Is a //it means the inheritance is a

class A
{
   private int a;
   private int b;
   
   void setvalues(int x,int y)
   {
     a=x;
	 b=y;
   }
  
  int sum()
  {
    System.out.println("sum is :"+(a+b));
   return a+b;
  }
}
class B extends A
{
   int c;
   void sumAll()
   {
   System.out.println("sum all is :"+(sum()+c));
   }
}

class FirstProgram1
{
 public static void main(String args [])
 {
   B obj=new B();
   obj.setvalues(10,20);
   obj.c=30;
   obj.sumAll();
 }
}