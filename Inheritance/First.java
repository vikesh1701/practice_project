// Super keyword  useses

class A
{
  private int a;
  private int b;
  
  A(int x,int y)
  {
   a=x;
   b=y;
   }
   int sum()
   {
    System.out.println("sum is :"+(a+b));
	return a+b;
   }
}
class B extends A
{
  int c;
  B(int a,int b,int c)
  {
    super(a,b);
	this.c=c;
  }
  void sumAll()
  {
  System.out.println("sum all is :"+(sum()+c));
  }
}
class First
{
  public static void main(String args [])
  {
   B ob= new B(10,20,30);	
   //ob.sum();
   ob.sumAll();
  }
}