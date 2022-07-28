class Calc
{
  Calc()
  {
     this(20,90);
    System.out.println("default called");
  }
  Calc (int a)
  {
  System.out.println("int  called");
  }
  Calc(int a,int b)
  { 
    this(50);
  System.out.println("int ,int called");
  }
  Calc(double a,double b)
  {
    this();
  System.out.println("double,double");
  }
}
class Test
{
  public static void main(String args[])
  {
    Calc c=new Calc(10.2,30.9);
  }
}










