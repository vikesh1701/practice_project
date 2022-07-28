//program 29: passing reference as a parameter

class A
{
  int a=10;
  int b=20;
  A()
  {
   System.out.println("class A obj created ");
  } 
}
class Demo
{
  void sum(A obj)
  { 
   System.out.println("sum is :"+(obj.a+obj.b));
   obj.a=40;
   obj.b=20;
  // System.out.println("sum is :"+(obj.a+obj.b));
  }
}
class Demo1
{
  void mult(A obj)
  {
  System.out.println("mult is :"+(obj.a*obj.b));
  obj.a=10;
  obj.b=21;
  //System.out.println("mult is :"+(obj.a*obj.b));
  
  }
}
 class DemoCallByRe1f
 {
   public static void main(String args [])
   {
    A oa=new A();
	System.out.println("oa.a and oa.b is :"+oa.a+","+oa.b);
  Demo d=new Demo();
  d.sum(oa);
   
   Demo1 d1=new Demo1();
   d1.mult(oa);
   
   System.out.println("oa.a and oa.b is :"+oa.a+","+oa.b);
   } 
 }