import java.util.Scanner;
class Demo2D
{
  public static void main(String args [])
  {
  int arr[][]=new int [5][5];
  for(int i=0;i<5;i++)
  {
    for(int j=0;j<5;j++)
	{
  arr[i][j]=(int)(Math.random()*20);
  System.out.print(arr[i][j]+"\t");
  }
  System.out.println();
  }
  }
  }