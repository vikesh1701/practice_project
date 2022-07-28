class Calc
{
  Calc()
  {
   this(30.00,60.0);
  System.out.println(" default constructor called");
  }
  Calc(int a)
  { 
  this(40,50);
  System.out.println(" int constructor called");
  }
  Calc(int a,int b)
 {
  //this();
 System.out.println(" int,int constructor called");
 } 
 Calc(double a,double b)
 {
   this(10);
 System.out.println(" double ,double constructor called");
 }
}
 class ConstOverloading
 {
  public static void main(String args [])
  {
   Calc c=new Calc();
  }
 }

