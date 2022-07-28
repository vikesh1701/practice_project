 class A
{
  
 final void authorName()
  {
  System.out.println("created by Abhisehk Sir");
  }
 }
 class B extends A
 {
  void authorName()   // error overriden method is final
  {
    System.out.println("created by vikesh g");
  
  }
 }
 class Dono
 {
   public static void main(String args [])
   {
    B ob=new B();
	ob.authorName();
	new A().authorName();
   }
 }