class ThrowTest
{
	public static void main(String[]args)
	{
		int a=2;
		if(a<3)
		{		
			try
			{			
				throw new ArithmeticException("asdaf");
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
				System.out.println("Invalid age");
			}
		}
	}
}