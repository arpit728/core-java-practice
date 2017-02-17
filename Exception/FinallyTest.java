class FinallyTest extends Exception
{
	public String toString()
	{
		return"This is my exception";
	}
	public static void main(String[]args)throws IllegalAccessException
	{
		int a=10,b,c;
		b=0;
		//check(10,0);
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}	
	}
}