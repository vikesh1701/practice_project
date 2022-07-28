class DemoCLA
{
 public static void main(String args[])
 {
  int len =args.length;
  System.out.println("command line argument length is:"+len);
  if(len==0)
  {
  System.out.println("no command line value is passed!!");
  }  
 else
  {
 System.out.println("your command line value are:");
 for(int i=0;i<len;i++)
   {
  System.out.println( args[i]);
  
   }
  
  }
 }
}