// program 24: static block wil execuite before all block execute and execute only once

class DemoStatic6
{
 static{System.out.println("static  block 1111111 called");}

 public static void main(String args [])
    {
       System.out.println("main method called");
    }
   
   
   
   static{System.out.println("static  block 1 called");}
   
   
} 