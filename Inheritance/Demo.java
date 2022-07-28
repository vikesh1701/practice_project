// Super keyword

class A
{
  A()
  {
   
   System.out.println("class A cons is called");
  }
}
class B extends A
{
  B()
  {
   super();
    System.out.println("class B cons is called");
 
  }
}
class C extends B
{
  C()
  {
    super();
  System.out.println("class C cons is called");
  }
}
class Demo
{
  public static void main(String args [])
  {
    new C();	
  }
}