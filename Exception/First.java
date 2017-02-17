import java.util.Random;
class First
{
	public static void main(String []args)
	{
		int a=0,b=0,c=0;
		Random r=new Random();
		for(int i=0;i<32000;i++)
		{
			try
			{
				a=r.nextInt();
				b=r.nextInt();
				c=12345/(a/b);
			}
			catch(Exception e)
			{	
				System.out.println(e+"\nDivision by zero not possible");
				c=0;
			}
			System.out.println(c);
		}
		
	}
}