// public-->protected-->default-->private

abstract class A
{
 public void authorName()
 {
  System.out.println("created by Abhisehk Sir");
 }
}
class B extends A
{
 @Override
 void authorName()
 {
 System.out.println("Created by vikesh g");
 }
 void call()
 {
 System.out.println("call method called");
 }
 void show()
 {
  super.authorName();
 }
}
class ThirdUse
{
  public static void main(String args[])
  {
  B ob=new B();
  ob.authorName();
  ob.show();
  }
}