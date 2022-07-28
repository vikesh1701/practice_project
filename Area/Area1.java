class Room
{
   int length,breadth,height;
   void setvalue(int l,int b,int h)
    {
	  length=l;
	  breadth=b;
	  height=h;
	}
	void area()
    { 
	System.out.println("area is:"+(length*height));
	}

    void volume()
	{
	 System.out.println( " volume is:"+(length*height*breadth));
	}
	}
    class Area1
	{
	public static void main(String args[])
	{
    Room r=new Room();
	r.setvalue(20,30,10);
    r.area();
    r.volume();	
	
	}
   }
