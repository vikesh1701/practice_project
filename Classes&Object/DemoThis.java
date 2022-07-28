//program 14:this keyword

class Calc
{
 Calc()
 {System.out.println(this);}
}
class DemoThis
{
 public static void main( String args[])
 {
  Calc c=new Calc();
  System.out.println("c is :"+c);
  System.out.println("--------------------------");
  Calc c1=new Calc();
 System.out.println("c1 is :"+c1);
 }
 }