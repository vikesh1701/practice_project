class DemoSwitch
{
  public static void main (String args[])
  {
   int i=(int)(Math.random()*6);
   System.out.println("value is:"+i);
   switch(i)
   { case 1:
	 System.out.println("one");
	 break;
     case 2:
	 System.out.println("two");
	 break;
     case 3:
	 System.out.println("three");
	 break;
     case 4:
	 System.out.println("four");
	 break;
     case 5:
	 System.out.println("five");
	 break;
	 default:
	 System.out.println("invalid"); 
   }
  }
}