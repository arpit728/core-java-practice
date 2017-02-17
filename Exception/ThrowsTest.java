class ThrowsTest
{
	void cum()throws IllegalAccessException
	{
		throw new IllegalAccessException("sdasdsd");
	}
	
	void p()throws IllegalAccessException
	{
		cum();
	}
	public static void main(String[]args)throws IllegalAccessException
	{
		ThrowsTest t=new ThrowsTest();
		try
		{
			t.p();
		}
		catch(IllegalAccessException e)
		{
			System.out.println(e);
		}
	}
}
