import java.io.*;
import java.util.zip.*;
class Decompress
{
	public static void main(String[]args)
	{
		try
		{
			FileInputStream fin=new FileInputStream("crme.txt");
			InflaterInputStream in=new InflaterInputStream(fin);
			FileOutputStream fout=new FileOutputStream("rme1.txt");
			int i;
			while((i=in.read())!=-1)
			{
				fout.write((char)i);
			}
			fout.close();
			fin.close();
			in.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}