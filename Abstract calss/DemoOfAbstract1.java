abstract class Demo
{
 abstract void authorName();
}
class A extends Demo
{
  @Override
  void authorName()
  {
  System.out.println("created by vikesh g");
  }
}
class B
{
 B(Demo d)
  {
  d.authorName();
  }
}
class DemoOfAbstract1
{
 public static void main(String args[])
 {
  // B ob=new B(new A());
  Demo d=new A();
  B ob=new B(d);
 }

}