   import java.util.Scanner;
   class Sum1
   {
     public static void main(String[]args)
	 {
	  Scanner sc=new Scanner(System.in);
	    System.out.print("enter rows count:");
	  int rows=sc.nextInt();
	  
	  System.out.print("enter cols count:");
	  int cols=sc.nextInt();
	
	  int m1[][]=new int[rows][cols];
	  int m2[][]=new int[rows][cols];
      int sum[][]=new int[rows][cols];
//----------inserting value into m1-------
    for(int i=0;i<rows;i++)
	{  for(int j=0;j<cols;j++)
	{
      m1[i][j]=(int)(Math.random()*100);
	}
	  
	  }
	  System.out.println("--------------");
//-------- inserting value into m2-------------	  
	  for(int i=0;i<rows;i++)
	{ 
	for(int j=0;j<cols;j++)
	{
	  m2[i][j]=(int)(Math.random()*100);
	}
	  
	  }
	  System.out.println("--------------");
	  
//---------print m1--------------
      for(int i=0;i<rows;i++)
       {
	    for(int j=0;j<cols;j++)
		{
		 System.out.print(m1[i][j] +"\t");
		}
	   System.out.println();   //new line 
	   }	  
	  System.out.println("-----------");
	  
	 
//---------print m2--------------
      for(int i=0;i<rows;i++)
       {
	    for(int j=0;j<cols;j++)
		{
		 System.out.print(m2[i][j] +"\t");
		}
	   System.out.println();   //new line 
	   }	  
	  System.out.println("-----------"); 
	  
//------printing sum-------------------------------------------------------------------
	  
      for(int i=0;i<rows;i++)
       {
	    for(int j=0;j<cols;j++)
		{
		 sum[i][j]=m1[i][j]+m2[i][j];
		 System.out.print(sum[i][j]+"\t");
		}
	   System.out.println();   //new line 
	   }	  
	 }
   }