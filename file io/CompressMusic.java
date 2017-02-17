import java.io.*;
import java.util.zip.*;
class CompressMusic
{
	public static void main(String[]args)
	{
		try
		{
			FileInputStream fin=new FileInputStream("abc.mp3");
			FileOutputStream fout1=new FileOutputStream("ambarsaria.mp3");
			FileOutputStream fout2=new FileOutputStream("ambarsaria.txt");
			DeflaterOutputStream out1=new DeflaterOutputStream(fout1);
			DeflaterOutputStream out2=new DeflaterOutputStream(fout2);
			int i;
			while((i=fin.read())!=-1)
			{
				out1.write((byte)i);
				out2.write((byte)i);
				out1.flush();  
				out2.flush();  
			}
			out1.close();
			out2.close();
			fout1.close();
			fout2.close();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}
}