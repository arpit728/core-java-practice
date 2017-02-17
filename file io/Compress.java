import java.io.*;
import java.util.zip.*;
class Compression
{
	public static void main(String[]args)
	{
		try
		{
			FileInputStream fin=new FileInputStream("rme.txt");
			FileOutputStream fout=new FileOutputStream("crme.txt");
			DeflaterOutputStream out=new DeflaterOutputStream(fout);
			int i;
			while((i=fin.read())!=-1)
			{
				out.write((byte)i);
				out.flush();  
			}
			out.close();
			fout.close();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}
}