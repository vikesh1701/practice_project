// WAP to print given pattern using nested loop.
					

class PartBQ11
{
   public static void main(String args[])
   { 
     int i,j,k;
	  int z=0;
	  int m=6;
	  
	  for( i=6;i<1;i++)
	  {
	    for(j=5;j>=i;j--)
	  {
	    System.out.print(" ");
	  
	    for(k=6;k<=i;k++)
		{
		 System.out.print(k);
		}
	 } 
	System.out.println();
	 }
   }
}