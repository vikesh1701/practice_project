//program 27:static  class or nested class

class Outer
{
    static class A
	{
	   void show()
	   {
	    System.out.println(" static show called");
	   }
	}
  class B
  {
   void show()
   {
    System.out.println("show'B called");
   }
  }
  
  void call()
  {
    System.out.println("Outer's call is called");
  }
}
 class UseOuter
 {
  public static void main(String args [])
  {
     Outer.A obj=new Outer.A();
	   obj.show();
  
  	  Outer o=new Outer();
		  o.call();
		  
      Outer.B ob=o.new B();
	    ob.show();
	  
		  
  }
 }








