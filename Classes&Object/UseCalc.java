// program 4

class Calc
{
 void sum(double a,double b)
 {
   System.out.println(a+"+"+b + "is:"+(a+b));
 }
 void multiplication(double a,double b)
 {
 System.out.println(a+"*"+b + "is:"+(a*b));
 }
}
class UseCalc
{
  public static void main(String args[])
  {
    Calc c=new Calc();
	c.sum(20,10);
    c.multiplication(30,40);
  }
}