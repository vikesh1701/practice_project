class DemoCLA1
{
 public static void main(String[]args)
 {
  int len =args.length;
  System.out.println("command line argument length :"+len);
   
   if(len==0)
   {
   System.out.println("no command line argument pass !!");
   } 
 else
 {
   System.out.println("ur command line value are : " );
     int sum=0;
	 for(int i=0;i<len;i++)
	 {
      sum=sum+Integer.parseInt(args[i]);
	 }
	 System.out.println("sum is :" + sum);
 }
 }
}







