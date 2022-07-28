abstract class Demo
{
 abstract void authorName();
}

class B
{
 B(Demo d)
  {
  d.authorName();
  }
}
class DemoOfAbstract2
{
 public static void main(String args[])
 {
  
  Demo d=new A()
  {
   void authorName()
   {
   System.out.println("created by Abhishek sir");
   }
  };
  B ob=new B(d);
  System.out.println("------------------------------------------------------or----");
   new B(
     new Demo()
      {
	  void authorName()
	  {
	    System.out.println("RAT");
	  }
	  }
   );
 }
}