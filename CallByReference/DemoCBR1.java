class A
{
  void show()
  {
    System.out.println("show is called");
  }
}
class B
{
 void showme()
 {
 System.out.println("showme is called");
 }
}
/*class C
{
  C()
  {
  System.out.println("contructor C called");
  }
}*/
class Demo
{
  void showmetoo(A oa,B ob)
  {
 System.out.println("showmetoo is called");
  oa.show();
  ob.showme();
  }
}
class DemoCBR1
{
  public static void main(String args[])
   {
   Demo d=new Demo();
   A d1=new A();
   B d2=new B();
  // C d3=new C();
   d.showmetoo(d1,d2);
   
   }
}