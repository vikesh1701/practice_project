// program 31:nested inner and  local classess;
// pass reference as a parameter

class Outer
{
  int a=10;
  void outer()
  {
    class Local
	{
	 void show()
        {
	     System.out.println("local class show is called");
	    }
	}
  Local obj=new Local();
  obj.show();
  }
  
  class A
  {
   void a()
     {
     System.out.println("class A's a() method is called");
     }
  }
  static class B
  {
    void b()
	{
	 System.out.println(" static class B's b() method is called");
	}
  }
}
class DemoNestedInner
{
  public static void main(String args [])
  {
   Outer out=new Outer();
    out.outer();
  Outer.A oa =out.new A();
  oa.a();
  Outer.B ob=new Outer.B();
  ob.b();
  }
}