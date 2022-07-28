class Calc
{
  void sum(int a,int b)
  {
    System.out.println("sum is:"+(a+b)); 
  }
 int multipliction(int a,int b)
 {
  //System.out.println("multipliction is:");
  return a*b;
 }
  double getPower(int a,int b)
  {
   //System.out.println("power is:");
   return Math.pow(a,b);
  } 
}
  class DemoMethod
  { public static void main(String args[])
  {
   Calc c=new Calc();
   c.sum(20,30);
   System.out.println("multiplication result is:"+(c.multipliction(10,20)));
   System.out.println("power is:"+(c.getPower(2,3)));
   }
   }