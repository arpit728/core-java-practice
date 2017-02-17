class MethTry
{
	void calc()
	{
		try
		{
		int a=10,b=0,c;
		c=a/b;}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("caught in calc");
		}
	}
	
	/*void p()
	{
		n();
	}
	void n()
	{
		calc();
	}*/
	public static void main(String[]args)
	{
		MethTry m=new MethTry();
			try{
			m.calc();}
		catch(Exception e)
		{
			System.out.println("propagated");
		}
	}
}

