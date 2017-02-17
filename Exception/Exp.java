class A extends ArithmeticException
{
	A(String s)
	{
		super(s);
	}
}
class Exp
{
	void m(int p)
	{
		if(p<18)
		{
			throw new A("my exception");
		}
		
	}
	public static void main(String[]args)
	{
		Exp e=new Exp();
		try
		{
			e.m(10);
		}
		catch(A l)
		{
			System.out.println(l);
		}
		
	}
}