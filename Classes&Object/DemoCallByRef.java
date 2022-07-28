// program 28:call by reference

 class Demo
 {
   void show (Demo obj)
   {
   System.out.println(this+":::"+obj);
   }
 }
 class DemoCallByRef
 {
  public static void main(String args [])
  {
  
   Demo d1=new Demo();
   Demo d2=new Demo();
   d1.show(d2);
   d2.show(d1);
  }
 }