// program 22A:static method can be refer by using the class name

class Demo
{
  int a=10;
  static int b=20;
  static void show()
  {
     Demo d=new Demo();
    //System.out.println("a is :"+a);    // error 
	System.out.println("a is :"+d.a);
    System.out.println("static show method is called");
	
	System.out.println("b is :"+b);
  }
}
class DemoStatic4
{
 public static void main(String args[])
 {
     System.out.println("b is :"+Demo.b);
     Demo.show();
 }
}