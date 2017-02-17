class NestTry
{
	public static void main(String[]args)
	{
		int a,b,c;
		b=c=0;
		a=10;
		try
		{
			try
			{
				c=a/b;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("caught");
			}
			System.out.println("Control returned");
		}
		catch(Exception e)
		{
			System.out.println("caught")s;
		}
		System.out.println("Control not returned");
	}
}