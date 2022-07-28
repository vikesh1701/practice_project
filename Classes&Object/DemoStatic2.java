// program 21:static method can be refer by using the class name


class Demo
{
  static void show(int a)
  {
    System.out.println("static show method is call"+a);
  }
}

class DemoStatic2
{
  public static void main(String args[])
  {
  // Demo d=new Demo();
    Demo.show(3);
    Demo.show(2);
  }
}