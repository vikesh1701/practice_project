class DemoTest{
public static void main(String []args)
{
/*
int a=10;
System.out.println(a);
a=a;
System.out.println(a);
System.out.println((a=10)==a);
System.out.println(a=90);


System.out.println(true&false);
System.out.println(true|false);
System.out.println(!false);

int c=10;
if(c==20)
System.out.println("hi");
else
System.out.println("bye");
System.out.println("end of the program");

boolean d=false;
if(d==false)
System.out.println("hi");
else
System.out.println("bye");
int e=10,f=20,g=30;
int result=(e>f)? e:f;
System.out.println("result is :"+ result);
*/


int h=(int)(Math.random()*100);
int i=(int)(Math.random()*100);
int j=(int)(Math.random()*100);
System.out.println( h +","+ i+","+j);
int result11=((h>i)?((h>j)? h:j):((i>j)? i:j));
System.out.println("greatest number id:"+result11);


/*

double k=(Math.random()*1000);
System.out.println((int)k);

for(int p=0;p<50;p++)
   {
    int ch=(int)(Math.random()* 25)+65;
	
	System.out.println((char)ch);
   }
   
   System.out.println(true&false);
   System.out.println(true|false);
   System.out.println(!false);

   int v=10;
   int l=20;
   System.out.println((v==10)&(l=10)==l);
   */
}
}