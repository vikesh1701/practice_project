//WAP to print third element of command line argument.

 
 class PartBQ12
 {
  public static void main(String args [])
  {
   int len=args.length;
  System.out.println("commandline argument length is :"+len);
  
  if(len==0)
  {
  System.out.println("no commandline argument is pass :!!!!!!!");
  }
  else
  {
   System.out.println("your commandline argument are :");
  
    for ( int i=0;i<len;i++)
     { System.out.println(args[i]);}
  }
  }
 }