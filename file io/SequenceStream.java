import java.io.*;
class SequenceStream
{
	public static void main(String[]args)
	{
		try
		{
			FileInputStream fin1=new FileInputStream("f1.txt");
			FileInputStream fin2=new FileInputStream("f2.txt");
			FileInputStream fin3=new FileInputStream("f3.txt");
			FileOutputStream fout=new FileOutputStream("f3.txt");
			SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
			int i;
			while((i=sis.read())!=-1)
			{
				fout.write((char)i);
			}
			while((i=fin3.read())!=-1)
			{
				System.out.print((char)i);
			}
			sis.close();
			fin1.close();
			fin2.close();
			fin3.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}