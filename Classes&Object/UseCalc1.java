// program 9: calculate power &squr using method

class Calc1
{
  void division(int a,int b)
  {
    System.out.println("division is :"+a/b);
  }
  void getpower(double a,double b)
  {
   System.out.println("power is :"+Math.pow(a,b));
  }
  double getsqrt(double a)
  {
   return Math.sqrt(a);
  }
}
 class UseCalc1
 {
   public static void main(String args[])
   {
     Calc1 c=new Calc1();
	 c.division(200,20);
	 c.getpower(2,3);
	double b= c.getsqrt(25);
	System.out.println("sqrt is :"+b);
  }
 }