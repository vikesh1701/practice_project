// program 13:constructor overloading

class Calc
{
 Calc(double a,double b)
 {System.out.println("sum is :"+(a+b));}

 Calc(int a,int b)
 {System.out.println("power is :"+Math.pow(a,b));}
 
  Calc(int a)
  {System.out.println("sqrt is :"+Math.sqrt(a));}
  
  Calc(double a,double b,double c)
  {System.out.println("mult is :"+(a*b*c));}
}

class ConsOverloading
{
  public static void main(String args[])
  {
   Calc c=new Calc(10.0,10.8);
   new Calc(2,3);
   new Calc(25);
   new Calc(10,20,30);
  
  }
}