//program 11:constructor

class Demo
{
  Demo()
  {System.out.println("default cons called");}

   void Demo()
   {System.out.println("method cons called");}
}
class DemoConstractor
{
  public static void main(String args[])
  {
   Demo d=new Demo();
   d.Demo();
  }
}