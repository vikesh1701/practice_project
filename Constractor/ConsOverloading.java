 class Calc
{
 Calc()
 {System.out.println("Default cons called");}

 Calc(int a)
 {System.out.println("int a cons called");}
 
 Calc(int a,double b)
 {System.out.println("int a,double b cons called");}

 Calc(double b,int a)
{System.out.println("double b,int a cons called");}
}
 public class ConsOverloading
{
 public static void main(String args[])
 {
   Calc c= new Calc();
   new Calc(10);
   new Calc(20,30.00);
   new Calc(40.00,10);
   new Calc();
}
}