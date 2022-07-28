//program 30:when a method return class type this is known as returning reference(addresses)

class Demo
{
  Demo()
  {
   System.out.println("cons called");
  }
  A show()
  {
  System.out.println("show called");
  return new A();
  }
  
  void showMe()
  {
    System.out.println("showMe called");
  }
} 
class A
{
  Demo call()
  {
   System.out.println("call is called");
   return new Demo();
  }
 B f1()
 {
   System.out.println("f1 is called");
   return new B();
 }
}

class B
{
  C callMe()
  {
   System.out.println("callme is called");
  return new C();
  }
  C f2()
  {
    System.out.println("f2 is called");
    return new C();
	}
}
  class C
  {
   A f3()
   {
     System.out.println("f3 is called");
   return new A();
   }
  B callMeTo()
  {
   System.out.println("callmeto is called");
  return new B();
  } 
 }
 class DemoReturningObject
 {
  public static void main(String args[])
   {
    new Demo().show().f1().f2().callMeTo().callMe().f3().call().showMe();
	/*
	Demo d=new Demo();
	A oa=d.show();
	B ob=oa.f1();
	C oc=ob.f2();
	ob=oc.callMeTo();
	oc=ob.callMe();
	oa=oc.f3();
	d=oa.call();
	d.showMe();
   */}
 }