//second use of super keyword

class Demo
{
 int a=100;
}

class UseDemo extends Demo
{
 int a=90;
 
 void show()
   {
    int a=80;
	System.out.println("value of a is :"+a);
	System.out.println("value of a this.a is :"+this.a);
    System.out.println("value of a super.a is :"+super.a);
   }
   void showme()
   {
  System.out.println("now value of a is :"+a);
   }
 }
 class SecondUseOfSuper
 {
  public static void main(String args[])
  {
   UseDemo obj=new UseDemo();
   obj.show();
   obj.showme();
  }
 }
 
 