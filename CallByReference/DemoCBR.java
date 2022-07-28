class Demo
{
  int a=10;
  int b=20;
  Demo()
  {
  System.out.println("object created");
  }
}
class A
{
  A(Demo d)
  {
   // Demo c=new Demo();
  System.out.println("sum is :"+(d.a+d.b));
  }
}
class B
{
  B(Demo d)
  {
 // Demo c=new Demo();
  System.out.println("multiplication is:"+d.a*d.b);
  }
}
class DemoCBR
{
  public static void main(String args[])
  {
   Demo obj=new Demo();
   System.out.println(obj);
   A oa=new A(obj);
   B ob=new B(obj);
  }
}