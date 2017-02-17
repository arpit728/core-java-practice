class MyException extends Exception
{
	private int age;
	MyException(int a)
	{
		age=a;
	}
	public String toString()
	{
		return"Invalid age";
	}
}
class ExceptionDemo
{
	static void compute(int a)throws MyException
	{
		if(a<18)
		{
			throw new MyException(18);
			
		}
		System.out.println("Normal exit");
	}
	public static void main(String[]args)
	{
		try
		{
			compute(18);
			compute(16);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}