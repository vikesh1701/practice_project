// program 25: static block wil execuite before all block execute and execute only once


  class Demo
  {
    Demo()
     {
     System.out.println("constructor called");
     }
	void show()
     {
	  System.out.println("show called");
	 }
	 
	 //initiallization block
	 {
	  System.out.println("initialization block called");
	 }
	 
  static 
   {
   System .out.println("static block1 called");
   }
 } 
 class DemoStaticBlock
 {
  public static void main(String args[])
  {
    System.out.println("main method called");
    Demo d=new Demo();
    d.show();
   System.out.println("--------------------------");
   Demo d1=new Demo();
  }
   static 
   {
   System .out.println("static block2 called");
   }
 }