// program 23: static block wil execuite before all block execute and execute only once

class DemoStatic5
{
 static{System.out.println("static  block 1 called");}

 public static void main(String args [])
  {
   System.out.println("main method called");
  }
} 