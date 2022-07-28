class DemoShortcircuit
{
 public static void main(String[]args)
  {
   int a=20;
   int b=10;
   if((a>b) && ((a=20)==b))
   {  System.out.println("we are in if block1");
   
    }
  System.out.println("value of a is : "+a);
  System.out.println("value of b is : "+b);
     if((a>b) || ((a=20)==b))
   {  System.out.println("we are in if block2");
   
    }
  
  System.out.println("value of a is : "+a);
  System.out.println("value of b is : "+b);
  
  }

  
  }

