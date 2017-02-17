import java.io.*;
class SimpleRead
{
	public static void main(String[]args)
	{
		int i=0;
		try
		{
			
			FileInputStream fin=new FileInputStream("abc.txt");
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}