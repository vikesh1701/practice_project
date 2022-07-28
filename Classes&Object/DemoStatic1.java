//program 20:  static /class member can be refer by using the class name


class Demo
{
  int a=10;          // instance variable
  static int b=30;   // static variable
}
class DemoStatic1
{
  public static void main(String args[])
  {
    Demo d=new Demo();
	System.out.println("value of a is :"+d.a);
   System.out.println("value of  is :"+Demo.b);
   
	d.a=-1;
	Demo.b=-1;
	System.out.println("value of a is :"+d.a);
   System.out.println("value of  is :"+Demo.b);
   System.out.println("--------------------------------");
   
   
   Demo d1=new Demo();
   System.out.println("value of a is :"+d1.a);
   System.out.println("value of a is :"+Demo.b);
  }
}