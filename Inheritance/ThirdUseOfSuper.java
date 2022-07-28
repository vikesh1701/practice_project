//program 6:  method overriding

class Demo
{
  public void show()
  {
  System.out.println("super class show method called");
  }
  void calc(double a,double b)
  {
  System.out.println("sum is :"+(a+b));
  }
}
class UseDemo extends Demo
{
 public void show()
  {
  System.out.println("sub class show method is called");
  super.show();
  }
 void calc(double a,double b)
 {
 System.out.println("power is :"+Math.pow(a,b));
 
 }
 void f1()
 {
  super.show();
 }
}
class ThirdUseOfSuper
{
 public static void main(String args[])
 {
  UseDemo d=new UseDemo();
  d.show();
  d.f1();
  d.calc(2,3);
 }
}