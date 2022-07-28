// program 17: this keyword

class A
{
  int a=10;
  
  A()
  {
    int a=90;
	System.out.println("value of a is :"+a);
    System.out.println("value of this.a is :"+this.a);
}
  void show()
  {
  System.out.println("value of a is :"+a);
  }
  }
class DemoThis1
{
  public static void main (String args[])
  {
    A oa=new A();
	oa.show();
  
  }
}