package p2;
import com.rat.meth.MyCalc;
class UseMyCalc
{
  public static void main(String args[])
  {
   MyCalc c=new MyCalc();
   System.out.println("sqrt is :"+c.getSqrt(225));
   System.out.println("power is :"+c.getPower(3,4));
  }
}