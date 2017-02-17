import java.io.*;
class FileWrite
{
	public static void main(String []args)
	{
		try
		{
			FileWriter fw=new FileWriter("abc.txt");
			fw.write("I am a java Developer");
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}