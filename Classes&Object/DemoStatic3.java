// program 22:static method can be refer by using the class name

class Demo
{
  void showme()
  {
    System.out.println("show me method is called");
  }
  static void show()
  {
    // showme();    // error
  
  Demo d=new Demo();   // right way to call non static method
  d.showme();
  
  System.out.println("static show method is called");
  
  }
}
class DemoStatic3
{
 public static void main(String args[])
 {
 // Demo d=new Demo();
 // d.showme();
  Demo.show();
 }
}