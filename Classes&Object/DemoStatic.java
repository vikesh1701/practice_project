//program 19:  static /class member can be refer by using the class name


class Demo
{
  int a=10;
  static int b=30;
}
class DemoStatic
{
  public static void main(String args[])
  {
    Demo d=new Demo();
	System.out.println("value of a is :"+d.a);
   
    System.out.println("value of b is :"+d.b);
   
    System.out.println("value of b is :"+Demo.b);
   
  }
}