abstract class Demo
{
  abstract void authorName();
  abstract void calc(int a,int b);
}
class DemoOfAbstract
{
 public static void main(String args[])
 {
  Demo d=new Demo()
  {
   @Override
   void authorName()
   {
    System.out.println("created by vikesh g");
   }
   @Override
   void calc(int a,int b)
   {
     System.out.println("sum is :"+(a+b));
   }
  };
   d.authorName();
   d.calc(10,20);
 }
}